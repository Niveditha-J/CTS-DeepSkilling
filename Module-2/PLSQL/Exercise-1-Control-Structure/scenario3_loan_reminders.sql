DECLARE
  CURSOR cur_loans IS
    SELECT LoanID, CustomerID, DueDate
    FROM Loans
    WHERE DueDate <= SYSDATE + 30;

  v_customer_name Customers.Name%TYPE;
BEGIN
  FOR loan_rec IN cur_loans LOOP
    -- Fetch customer name for the message
    SELECT Name INTO v_customer_name
    FROM Customers
    WHERE CustomerID = loan_rec.CustomerID;

    DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || v_customer_name ||
                         ', your loan (ID: ' || loan_rec.LoanID || 
                         ') is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY') || '.');
  END LOOP;
END;
