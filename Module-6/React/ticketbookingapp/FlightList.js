import React from 'react';

const flights = [
  { id: 1, from: 'Mumbai', to: 'Delhi', time: '09:00 AM', price: 4500 },
  { id: 2, from: 'Bengaluru', to: 'Chennai', time: '01:30 PM', price: 3800 },
  { id: 3, from: 'Hyderabad', to: 'Kolkata', time: '06:15 PM', price: 5200 },
];

const FlightList = ({ showPrices = true }) => {
  if (!flights || flights.length === 0) {
    // prevent rendering when no flights
    return null;
  }

  return (
    <div style={{ border: '1px solid #888', padding: 12, borderRadius: 6, marginBottom: 16 }}>
      <h3>Available Flights</h3>
      <ul>
        {flights.map(f => (
          <li key={f.id} style={{ marginBottom: 8 }}>
            <strong>
              {f.from} → {f.to}
            </strong>{' '}
            at {f.time}{' '}
            {showPrices && (
              <span>
                | Price: ₹ {f.price.toLocaleString()}
              </span>
            )}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default FlightList;
