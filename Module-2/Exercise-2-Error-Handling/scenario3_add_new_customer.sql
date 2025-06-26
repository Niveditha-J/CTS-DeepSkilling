CREATE OR REPLACE PROCEDURE AddNewCustomer(
    p_cust_id   IN NUMBER,
    p_name      IN VARCHAR2,
    p_dob       IN DATE,
    p_balance   IN NUMBER
)
IS
BEGIN
    -- Insert new customer
    INSERT INTO customers(cust_id, name, dob, balance)
    VALUES (p_cust_id, p_name, p_dob, p_balance);

    COMMIT;
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        INSERT INTO error_logs(log_time, error_message)
        VALUES (SYSDATE, 'Customer ID ' || p_cust_id || ' already exists.');
        DBMS_OUTPUT.PUT_LINE('Error: Duplicate customer ID.');
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO error_logs(log_time, error_message)
        VALUES (SYSDATE, SQLERRM);
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
