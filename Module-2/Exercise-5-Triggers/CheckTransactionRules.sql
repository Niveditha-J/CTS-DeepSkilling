-- Trigger: CheckTransactionRules
CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    v_balance NUMBER;
BEGIN
    IF :NEW.type = 'withdrawal' THEN
        SELECT balance INTO v_balance FROM Accounts WHERE account_id = :NEW.account_id;

        IF :NEW.amount > v_balance THEN
            RAISE_APPLICATION_ERROR(-20001, 'Withdrawal amount exceeds balance.');
        END IF;
    ELSIF :NEW.type = 'deposit' THEN
        IF :NEW.amount <= 0 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be positive.');
        END IF;
    END IF;
END;
/

-- Example:
-- INSERT INTO Transactions (transaction_id, account_id, amount, type)
-- VALUES (202, 1001, 1000, 'withdrawal');
-- Will raise error if balance is insufficient.
