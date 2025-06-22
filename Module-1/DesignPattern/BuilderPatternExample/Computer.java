package BuilderPatternExample;

// Computer.java
public class Computer {
    // Required parameters
    private String cpu;
    private String ram;

    // Optional parameters
    private String storage;
    private String graphicsCard;

    // Private constructor (Only Builder can access it)
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    // Nested static Builder class
    public static class Builder {
        // Required
        private String cpu;
        private String ram;

        // Optional
        private String storage;
        private String graphicsCard;

        // Constructor for required params
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // Optional setters (return Builder for chaining)
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // Final method to build Computer
        public Computer build() {
            return new Computer(this);
        }
    }

    // For display
    public void showConfig() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + (storage != null ? storage : "Not included"));
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "Not included"));
    }
}

