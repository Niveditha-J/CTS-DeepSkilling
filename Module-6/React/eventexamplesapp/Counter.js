import React from 'react';

class Counter extends React.Component {
  constructor(props) {
    super(props);
    this.state = { value: 0, message: '' };

    // bind if not using arrow methods
    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.incrementAndHello = this.incrementAndHello.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handleSynthetic = this.handleSynthetic.bind(this);
  }

  increment() {
    this.setState(prev => ({ value: prev.value + 1 }));
  }

  decrement() {
    this.setState(prev => ({ value: prev.value - 1 }));
  }

  sayHello() {
    this.setState({ message: 'Hello! This is a static message.' });
  }

  incrementAndHello() {
    // multiple method invocation: increment then say hello
    this.increment();
    this.sayHello();
  }

  sayWelcome(greeting) {
    this.setState({ message: `${greeting}, user!` });
  }

  handleSynthetic(e) {
    // synthetic event demonstration
    // e is a SyntheticEvent; prevent default just as illustration
    e.preventDefault();
    this.setState({ message: 'I was clicked' });
  }

  render() {
    return (
      <div style={{ border: '1px solid #444', padding: 16, borderRadius: 8, marginBottom: 24 }}>
        <h2>Counter</h2>
        <p>
          Value: <strong>{this.state.value}</strong>
        </p>
        <div style={{ display: 'flex', gap: 10, flexWrap: 'wrap' }}>
          <button onClick={this.incrementAndHello}>Increase (and say hello)</button>
          <button onClick={this.decrement}>Decrement</button>
          <button onClick={() => this.sayWelcome('Welcome')}>Say Welcome</button>
          <button onClick={this.handleSynthetic}>Synthetic OnPress (click)</button>
        </div>
        {this.state.message && (
          <p style={{ marginTop: 10 }}>
            <em>{this.state.message}</em>
          </p>
        )}
      </div>
    );
  }
}

export default Counter;
