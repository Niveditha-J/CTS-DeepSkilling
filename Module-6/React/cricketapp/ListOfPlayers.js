import React from 'react';

const players = [
  { name: 'Rishab Pant', score: 85 },
  { name: 'Rohit Sharma', score: 92 },
  { name: 'KL Rahul', score: 65 },
  { name: 'Shreyas Iyer', score: 73 },
  { name: 'Hardik Pandya', score: 54 },
  { name: 'Jasprit Bumrah', score: 88 },
  { name: 'Ravindra Jadeja', score: 69 },
  { name: 'Yuzvendra Chahal', score: 77 },
  { name: 'Shubman Gill', score: 59 },
  { name: 'Ishan Kishan', score: 81 },
  { name: 'Mohammed Shami', score: 68 },
];

const ListOfPlayers = () => {
  // Display all players using map
  const allPlayers = players.map((p, idx) => (
    <li key={idx}>
      {p.name}: {p.score}
    </li>
  ));

  // Filter players with score below 70 using arrow function
  const belowSeventy = players
    .filter(p => p.score < 70)
    .map((p, idx) => (
      <li key={idx}>
        {p.name}: {p.score}
      </li>
    ));

  return (
    <div>
      <h2>List of Players</h2>
      <h3>All Players</h3>
      <ul>{allPlayers}</ul>
      <h3>Players with score below 70</h3>
      <ul>{belowSeventy}</ul>
    </div>
  );
};

export default ListOfPlayers;
