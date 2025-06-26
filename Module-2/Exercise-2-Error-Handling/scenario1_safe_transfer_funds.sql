CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_from_account_id IN NUMBER,
    p_to_account_id   IN NUMBER,
    p_amount          IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    -- Check balance of the from account
    SELECT balance INTO v_balance FROM accounts WHERE account_id = p_from_account_id;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds.');
    END IF;

    -- Deduct from sender
    UPDATE accounts SET balance = balance - p_amount WHERE account_id = p_from_account_id;

    -- Add to receiver
    UPDATE accounts SET balance = balance + p_amount WHERE account_id = p_to_account_id;

    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO error_logs(log_time, error_message)
        VALUES (SYSDATE, SQLERRM);
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
