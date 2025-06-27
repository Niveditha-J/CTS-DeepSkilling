-- PL/SQL Block: UpdateLoanInterestRates
DECLARE
    CURSOR loan_cursor IS
        SELECT loan_id, interest_rate FROM Loans;

    v_loan_id        Loans.loan_id%TYPE;
    v_interest_rate  Loans.interest_rate%TYPE;

    interest_increment CONSTANT NUMBER := 0.5;  -- New policy: increase by 0.5%
BEGIN
    OPEN loan_cursor;
    LOOP
        FETCH loan_cursor INTO v_loan_id, v_interest_rate;
        EXIT WHEN loan_cursor%NOTFOUND;

        UPDATE Loans
        SET interest_rate = v_interest_rate + interest_increment
        WHERE loan_id = v_loan_id;

        DBMS_OUTPUT.PUT_LINE('Updated interest for Loan ID: ' || v_loan_id);
    END LOOP;
    CLOSE loan_cursor;
    COMMIT;
END;
/

-- Example:
-- Applies the new policy by incrementing all loan interest rates by 0.5%
