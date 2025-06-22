package MVCPatternExample;

public class MVCTest {
    public static void main(String[] args) {
        // Model
        Student student = new Student("Nive", "101", "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        System.out.println("\nUpdating student info...\n");

        // Update model using controller
        controller.setStudentName("Nive Mahalakshmi");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
