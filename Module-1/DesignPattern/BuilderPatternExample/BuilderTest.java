package BuilderPatternExample;

// BuilderTest.java
public class BuilderTest {
    public static void main(String[] args) {
        // Basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("Basic Computer Configuration:");
        basicComputer.showConfig();

        System.out.println();

        // High-end computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .build();
        System.out.println("Gaming Computer Configuration:");
        gamingComputer.showConfig();
    }
}
