import logo from './logo.svg';
import './App.css';

import React, { useState } from 'react';
import FlightList from './components/FlightList';
import BookingForm from './components/BookingForm';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Element variable for header message
  const header = isLoggedIn ? (
    <h2>Welcome back! Book your flight below.</h2>
  ) : (
    <h2>Browse flights as a Guest. Please log in to book.</h2>
  );

  // Element variable for login/logout button
  const authButton = isLoggedIn ? (
    <button onClick={() => setIsLoggedIn(false)}>Logout</button>
  ) : (
    <button onClick={() => setIsLoggedIn(true)}>Login</button>
  );

  return (
    <div style={{ padding: 24, fontFamily: 'Arial, sans-serif', maxWidth: 800, margin: '0 auto' }}>
      <h1>ticketbookingapp</h1>
      <div style={{ marginBottom: 16 }}>{authButton}</div>
      {header}

      {/* Guest sees flight list only */}
      {!isLoggedIn && <FlightList showPrices={true} />}

      {/* Logged-in user sees booking UI + flight list (you can adjust what they see) */}
      {isLoggedIn && (
        <>
          <FlightList showPrices={true} />
          <BookingForm />
        </>
      )}
    </div>
  );
}

export default App;
