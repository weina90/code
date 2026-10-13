public class ControlFlowExample {
    public static void main(String[] args) {
        int score = 85;

        // If-Else Condition
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // For Loop (Counting from 1 to 5)
        System.out.print("Counting: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}
