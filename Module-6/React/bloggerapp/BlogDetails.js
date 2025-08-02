import React from 'react';

const blogs = [
  { id: 'a1', title: 'React Patterns', author: 'Michael Chan', published: true },
  { id: 'b2', title: 'JavaScript Tips', author: 'Sarah Drasner', published: false },
  { id: 'c3', title: 'State Management', author: 'Dan Abramov', published: true },
];

const BlogDetails = ({ showOnlyPublished }) => {
  // conditional rendering with logical &&
  const visibleBlogs = showOnlyPublished
    ? blogs.filter((b) => b.published)
    : blogs;

  if (visibleBlogs.length === 0) {
    return (
      <div style={{ border: '1px solid purple', padding: 12, borderRadius: 6, marginBottom: 16 }}>
        <h2>Blog Details</h2>
        <p>No blogs to display.</p>
      </div>
    );
  }

  return (
    <div style={{ border: '1px solid purple', padding: 12, borderRadius: 6, marginBottom: 16 }}>
      <h2>Blog Details</h2>
      {showOnlyPublished && <p>Only published blogs are shown. (logical &&)</p>}
      <ul>
        {visibleBlogs.map((b) => (
          <li key={b.id}>
            <strong>{b.title}</strong> by {b.author}{' '}
            {!b.published && <span style={{ color: 'gray' }}>(Draft)</span>}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BlogDetails;
