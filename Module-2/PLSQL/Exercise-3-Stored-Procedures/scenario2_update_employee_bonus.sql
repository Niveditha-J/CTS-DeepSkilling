CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_dept_id      IN NUMBER,
    p_bonus_pct    IN NUMBER
)
IS
BEGIN
    -- Update salary with bonus
    UPDATE employees
    SET salary = salary + (salary * p_bonus_pct / 100)
    WHERE dept_id = p_dept_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Bonus updated for department ID: ' || p_dept_id);
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
