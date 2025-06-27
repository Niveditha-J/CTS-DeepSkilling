CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_emp_id     IN NUMBER,
    p_percentage IN NUMBER
)
IS
    v_salary NUMBER;
BEGIN
    -- Try to fetch current salary
    SELECT salary INTO v_salary FROM employees WHERE emp_id = p_emp_id;

    -- Update the salary
    UPDATE employees
    SET salary = salary + (salary * p_percentage / 100)
    WHERE emp_id = p_emp_id;

    COMMIT;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        INSERT INTO error_logs(log_time, error_message)
        VALUES (SYSDATE, 'Employee ID ' || p_emp_id || ' not found.');
        DBMS_OUTPUT.PUT_LINE('Error: Employee not found.');
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO error_logs(log_time, error_message)
        VALUES (SYSDATE, SQLERRM);
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
