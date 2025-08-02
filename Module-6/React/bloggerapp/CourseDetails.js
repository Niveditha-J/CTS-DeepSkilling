import React from 'react';

const courses = [
  { code: 'CS101', name: 'Intro to Computer Science', seats: 0 },
  { code: 'REACT200', name: 'Advanced React', seats: 5 },
  { code: 'NODE300', name: 'Node.js Backend', seats: 2 },
];

const CourseDetails = ({ showAvailableOnly }) => {
  // conditional rendering using element variables
  let content;

  const displayed = showAvailableOnly
    ? courses.filter((c) => c.seats > 0)
    : courses;

  if (displayed.length === 0) {
    content = <p>No courses available.</p>;
  } else {
    content = (
      <ul>
        {displayed.map((c) => (
          <li key={c.code}>
            {c.name} ({c.code}) —{' '}
            {c.seats > 0 ? (
              <span style={{ color: 'green' }}>Seats: {c.seats}</span>
            ) : (
              <span style={{ color: 'red' }}>Full</span>
            )}
          </li>
        ))}
      </ul>
    );
  }

  return (
    <div style={{ border: '1px solid navy', padding: 12, borderRadius: 6, marginBottom: 16 }}>
      <h2>Course Details</h2>
      {showAvailableOnly ? (
        <p>Showing only courses with availability.</p>
      ) : (
        <p>Showing all courses (including full ones).</p>
      )}
      {content}
    </div>
  );
};

export default CourseDetails;
