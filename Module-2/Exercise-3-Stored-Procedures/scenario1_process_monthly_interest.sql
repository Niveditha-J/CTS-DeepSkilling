CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    -- Update all savings accounts with 1% interest
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'SAVINGS';

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
