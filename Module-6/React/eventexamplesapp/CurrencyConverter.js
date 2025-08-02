import React, { useState } from 'react';

const INR_TO_EURO_RATE = 0.011; // example: 1 INR = 0.011 Euro
const EURO_TO_INR_RATE = 1 / INR_TO_EURO_RATE;

const CurrencyConverter = () => {
  const [inr, setInr] = useState('');
  const [euro, setEuro] = useState('');
  const [result, setResult] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault(); // synthetic event usage
    if (inr !== '') {
      const converted = (parseFloat(inr) * INR_TO_EURO_RATE).toFixed(2);
      setResult(`${inr} ₹ = € ${converted}`);
    } else if (euro !== '') {
      const converted = (parseFloat(euro) * EURO_TO_INR_RATE).toFixed(2);
      setResult(`€ ${euro} = ₹ ${converted}`);
    } else {
      setResult('Enter a value in INR or Euro.');
    }
  };

  return (
    <div style={{ border: '1px solid #444', padding: 16, borderRadius: 8 }}>
      <h2>Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: 8 }}>
          <label>
            INR:{' '}
            <input
              type="number"
              value={inr}
              onChange={(e) => {
                setInr(e.target.value);
                setEuro(''); // clear other
              }}
              placeholder="e.g., 1000"
            />
          </label>
        </div>
        <div style={{ marginBottom: 8 }}>
          <label>
            Euro:{' '}
            <input
              type="number"
              value={euro}
              onChange={(e) => {
                setEuro(e.target.value);
                setInr('');
              }}
              placeholder="e.g., 10"
            />
          </label>
        </div>
        <button type="submit">Convert</button>
      </form>
      {result && (
        <p style={{ marginTop: 10 }}>
          <strong>{result}</strong>
        </p>
      )}
    </div>
  );
};

export default CurrencyConverter;
