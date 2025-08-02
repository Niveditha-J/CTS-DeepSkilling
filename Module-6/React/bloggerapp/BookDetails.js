import React from 'react';

const books = [
  { id: 1, title: 'Clean Code', author: 'Robert C. Martin', price: 450 },
  { id: 2, title: 'You Don’t Know JS', author: 'Kyle Simpson', price: 300 },
  { id: 3, title: 'Eloquent JavaScript', author: 'Marijn Haverbeke', price: 350 },
];

const BookDetails = ({ showExpensiveOnly }) => {
  // conditional rendering: early return if no books
  if (!books || books.length === 0) return null;

  // element variable for list items with filter (if prop)
  const filtered = showExpensiveOnly
    ? books.filter((b) => b.price > 320)
    : books;

  const listItems = filtered.map((b) => (
    <li key={b.id}>
      <strong>{b.title}</strong> by {b.author} — ₹ {b.price}
    </li>
  ));

  return (
    <div style={{ border: '1px solid teal', padding: 12, borderRadius: 6, marginBottom: 16 }}>
      <h2>Book Details</h2>
      {showExpensiveOnly ? (
        <p>Showing only books priced above ₹320 (ternary-based rendering message)</p>
      ) : (
        <p>Showing all books</p>
      )}
      <ul>{listItems}</ul>
    </div>
  );
};

export default BookDetails;
