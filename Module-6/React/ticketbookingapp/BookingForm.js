import React, { useState } from 'react';

const BookingForm = () => {
  const [selectedFlightId, setSelectedFlightId] = useState('');
  const [passengerName, setPassengerName] = useState('');
  const [confirmation, setConfirmation] = useState('');

  const handleBook = (e) => {
    e.preventDefault();
    if (!selectedFlightId || !passengerName.trim()) {
      setConfirmation('Please select a flight and enter passenger name.');
      return;
    }
    setConfirmation(
      `Ticket booked for ${passengerName} on flight #${selectedFlightId}.`
    );
  };

  return (
    <div style={{ border: '1px solid #227', padding: 12, borderRadius: 6 }}>
      <h3>Book a Ticket</h3>
      <form onSubmit={handleBook}>
        <div style={{ marginBottom: 8 }}>
          <label>
            Flight ID:{' '}
            <input
              type="number"
              value={selectedFlightId}
              onChange={(e) => setSelectedFlightId(e.target.value)}
              placeholder="e.g., 1"
              min="1"
            />
          </label>
        </div>
        <div style={{ marginBottom: 8 }}>
          <label>
            Passenger Name:{' '}
            <input
              type="text"
              value={passengerName}
              onChange={(e) => setPassengerName(e.target.value)}
              placeholder="Your name"
            />
          </label>
        </div>
        <button type="submit">Confirm Booking</button>
      </form>
      {confirmation && (
        <p style={{ marginTop: 10, color: 'green' }}>
          <strong>{confirmation}</strong>
        </p>
      )}
    </div>
  );
};

export default BookingForm;
