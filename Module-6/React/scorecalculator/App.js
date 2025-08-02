import { CalculateScore } from '../src/components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name={"Sharvani"} 
        School={"St.John's Public School"} 
        total={284} 
        goal={3} 
      />
    </div>
  );
}

export default App;
