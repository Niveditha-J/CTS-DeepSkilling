import logo from './logo.svg';
import './App.css';

import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [showExpensiveBooks, setShowExpensiveBooks] = useState(false);
  const [onlyPublishedBlogs, setOnlyPublishedBlogs] = useState(false);
  const [onlyAvailableCourses, setOnlyAvailableCourses] = useState(false);

  return (
    <div style={{ padding: 24, fontFamily: 'Arial, sans-serif', maxWidth: 900, margin: '0 auto' }}>
      <h1>bloggerapp</h1>
      <p>
        Demonstrates multiple conditional rendering techniques, list rendering with <code>map()</code>, keys,
        and extracted components.
      </p>

      <div style={{ marginBottom: 16 }}>
        <label style={{ marginRight: 12 }}>
          <input
            type="checkbox"
            checked={showExpensiveBooks}
            onChange={(e) => setShowExpensiveBooks(e.target.checked)}
          />{' '}
          Show only expensive books (price &gt; 320)
        </label>
        <label style={{ marginRight: 12 }}>
          <input
            type="checkbox"
            checked={onlyPublishedBlogs}
            onChange={(e) => setOnlyPublishedBlogs(e.target.checked)}
          />{' '}
          Show only published blogs
        </label>
        <label>
          <input
            type="checkbox"
            checked={onlyAvailableCourses}
            onChange={(e) => setOnlyAvailableCourses(e.target.checked)}
          />{' '}
          Show only available courses
        </label>
      </div>

      <BookDetails showExpensiveOnly={showExpensiveBooks} />
      <BlogDetails showOnlyPublished={onlyPublishedBlogs} />
      <CourseDetails showAvailableOnly={onlyAvailableCourses} />
    </div>
  );
}

export default App;



