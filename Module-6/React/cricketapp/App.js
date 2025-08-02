import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';
import ListOfPlayers from './components/ListOfPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  const [flag, setFlag] = useState(true); // toggle true/false to switch

  return (
    <div style={{ padding: 20 }}>
      <h1>cricketapp</h1>
      <button onClick={() => setFlag(f => !f)}>
        Toggle Flag (currently {flag ? 'true' : 'false'})
      </button>
      <div style={{ marginTop: 20 }}>
        {flag ? <ListOfPlayers /> : <IndianPlayers />}
      </div>
    </div>
  );
}

export default App;
