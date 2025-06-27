-- Assumes a table AuditLog(transaction_id, action_type, log_time)

-- Trigger: LogTransaction
CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (transaction_id, action_type, log_time)
    VALUES (:NEW.transaction_id, 'INSERT', SYSDATE);
END;
/

-- Example:
-- INSERT INTO Transactions (transaction_id, account_id, amount, type)
-- VALUES (201, 1001, 500, 'deposit');
-- This will create an audit log entry.
