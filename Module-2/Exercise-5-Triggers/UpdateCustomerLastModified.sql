-- Trigger: UpdateCustomerLastModified
CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON Customers
FOR EACH ROW
BEGIN
    :NEW.LastModified := SYSDATE;
END;
/

-- Example:
-- UPDATE Customers SET name = 'John Smith' WHERE customer_id = 101;
-- This will also update the LastModified column automatically.
