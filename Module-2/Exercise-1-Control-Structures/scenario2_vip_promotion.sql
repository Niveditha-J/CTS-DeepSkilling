DECLARE
  CURSOR cur_balances IS
    SELECT CustomerID
    FROM Customers
    WHERE Balance > 10000;

BEGIN
  FOR cust_rec IN cur_balances LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerID = cust_rec.CustomerID;
  END LOOP;

  COMMIT;
END;
