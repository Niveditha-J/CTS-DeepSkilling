-- PL/SQL Block: GenerateMonthlyStatements
DECLARE
    CURSOR txn_cursor IS
        SELECT customer_id, transaction_id, amount, type, transaction_date
        FROM Transactions
        WHERE TRUNC(transaction_date, 'MM') = TRUNC(SYSDATE, 'MM');

    v_customer_id     Transactions.customer_id%TYPE;
    v_transaction_id  Transactions.transaction_id%TYPE;
    v_amount          Transactions.amount%TYPE;
    v_type            Transactions.type%TYPE;
    v_date            Transactions.transaction_date%TYPE;
BEGIN
    OPEN txn_cursor;
    LOOP
        FETCH txn_cursor INTO v_customer_id, v_transaction_id, v_amount, v_type, v_date;
        EXIT WHEN txn_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Customer ID: ' || v_customer_id || 
                             ' | Transaction ID: ' || v_transaction_id ||
                             ' | Type: ' || v_type ||
                             ' | Amount: ' || v_amount ||
                             ' | Date: ' || v_date);
    END LOOP;
    CLOSE txn_cursor;
END;
/

-- Example:
-- Execute block to print all transactions of the current month for each customer.
