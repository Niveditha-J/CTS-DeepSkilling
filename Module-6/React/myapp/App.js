import logo from './logo.svg';
import './App.css';

import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: 'React Bootcamp',
      status: 'ongoing',
      description: 'Learn React from scratch',
    },
    {
      name: 'Node.js Workshop',
      status: 'completed',
      description: 'Backend development with Node.js',
    },
  ];

  return (
    <div style={{ padding: 20 }}>
      <h1>Cohort Details</h1> {/* ← global heading */}
      <div>
        {cohorts.map(c => (
          <CohortDetails key={c.name} {...c} />
        ))}
      </div>
    </div>
  );
}

export default App;
