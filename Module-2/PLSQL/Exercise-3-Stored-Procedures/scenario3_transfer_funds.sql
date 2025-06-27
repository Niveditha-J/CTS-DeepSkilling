CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_acc_id IN NUMBER,
    p_to_acc_id   IN NUMBER,
    p_amount      IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    -- Get current balance of source account
    SELECT balance INTO v_balance FROM accounts WHERE account_id = p_from_acc_id;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20002, 'Insufficient balance for transfer.');
    END IF;

    -- Deduct from sender
    UPDATE accounts SET balance = balance - p_amount WHERE account_id = p_from_acc_id;

    -- Add to receiver
    UPDATE accounts SET balance = balance + p_amount WHERE account_id = p_to_acc_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
