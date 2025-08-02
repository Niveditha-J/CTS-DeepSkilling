import logo from './logo.svg';
import './App.css';

import React from 'react';
import OfficeCard from './components/OfficeCard';
import office1 from './img/download (1).jpeg';
import office2 from './img/pic2.jpeg'; 
import office3 from './img/puc3.jpeg';

const offices = [
  {
    name: 'Downtown Workspace',
    rent: 55000,
    address: '123 Main St, City Center',
    imageUrl:
      office1,
  },
  {
    name: 'Tech Park Office',
    rent: 75000,
    address: '456 Innovation Drive',
    imageUrl: office2,
  },
  {
    name: 'Riverside Suite',
    rent: 59000,
    address: '789 River Road',
    imageUrl: office3,
  },
];

function App() {
  return (
    <div style={{ padding: 20, fontFamily: 'Arial, sans-serif' }}>
      <h1>Office Space Rental</h1>
      <div style={{ display: 'flex', gap: 20, flexWrap: 'wrap' }}>
        {offices.map((office, idx) => (
          <OfficeCard key={idx} office={office} />
        ))}
      </div>
    </div>
  );
}

export default App;
