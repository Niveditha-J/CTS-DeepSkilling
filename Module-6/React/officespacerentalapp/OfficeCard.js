import React from 'react';

const OfficeCard = ({ office }) => {
  const rentStyle = {
    color: office.rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold',
  };

  const cardStyle = {
    border: '1px solid #333',
    borderRadius: 8,
    padding: 16,
    width: 320,
    boxShadow: '2px 2px 8px rgba(0,0,0,0.1)',
    marginBottom: 16,
    display: 'inline-block',
    verticalAlign: 'top',
  };

  const imgStyle = {
    width: '100%',
    borderRadius: 4,
    marginBottom: 10,
    objectFit: 'cover',
    height: 150,
  };

  return (
    <div style={cardStyle}>
      <h2>{office.name}</h2>
      <img src={office.imageUrl} alt={office.name} style={imgStyle} />
      <dl>
        <dt>Rent:</dt>
        <dd style={rentStyle}>₹ {office.rent.toLocaleString()}</dd>
        <dt>Address:</dt>
        <dd>{office.address}</dd>
      </dl>
    </div>
  );
};

export default OfficeCard;
