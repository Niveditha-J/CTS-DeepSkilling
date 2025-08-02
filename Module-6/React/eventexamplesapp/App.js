import logo from './logo.svg';
import './App.css';

import React from 'react';
import Counter from './components/Counter';
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  return (
    <div style={{ padding: 24, fontFamily: 'Arial, sans-serif', maxWidth: 800, margin: '0 auto' }}>
      <h1>eventexamplesapp</h1>
      <p>
        Demonstrates React events, synthetic events, event handlers, and use of <code>this</code> in a class
        component.
      </p>
      <Counter />
      <CurrencyConverter />
    </div>
  );
}

export default App;
