import React from 'react';
import Post from './post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Load posts from API
  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => this.setState({ posts: data }))
      .catch((error) => {
        console.error("Error fetching posts:", error);
        this.setState({ hasError: true });
      });
  };

  // Lifecycle method
  componentDidMount() {
    this.loadPosts();
  }

  // Error handler
  componentDidCatch(error, info) {
    alert("Something went wrong: " + error.toString());
  }

  render() {
    return (
      <div>
        <h1>All Posts</h1>
        {this.state.posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
