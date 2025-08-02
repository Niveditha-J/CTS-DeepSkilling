import React from 'react';

const allPlayers = [
  'Player1',
  'Player2',
  'Player3',
  'Player4',
  'Player5',
  'Player6',
  'Player7',
  'Player8',
  'Player9',
  'Player10',
  'Player11',
];

// Destructure to split into odd/even team. Here we’ll consider 1-based positions:
// odd team: positions 1,3,5,... even team: 2,4,6,...
const IndianPlayers = () => {
  const oddTeam = allPlayers.filter((_, idx) => idx % 2 === 0); // idx 0,2,4...
  const evenTeam = allPlayers.filter((_, idx) => idx % 2 === 1); // idx 1,3,5...

  // Example merge of two arrays (T20players and RanjiTrophy)
  const T20players = ['T20_A', 'T20_B', 'T20_C'];
  const RanjiTrophy = ['Ranji_X', 'Ranji_Y', 'Ranji_Z'];
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Indian Players</h2>
      <div>
        <h3>Odd Team Players</h3>
        <ul>
          {oddTeam.map((name, i) => (
            <li key={`odd-${i}`}>{name}</li>
          ))}
        </ul>
      </div>
      <div>
        <h3>Even Team Players</h3>
        <ul>
          {evenTeam.map((name, i) => (
            <li key={`even-${i}`}>{name}</li>
          ))}
        </ul>
      </div>
      <div>
        <h3>Merged Players (T20 + RanjiTrophy)</h3>
        <ul>
          {mergedPlayers.map((name, i) => (
            <li key={`merged-${i}`}>{name}</li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default IndianPlayers;
