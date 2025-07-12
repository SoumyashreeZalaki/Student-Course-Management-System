import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Course Management System");
        System.out.println("1. Register Student");
        System.out.println("2. Enroll in Course");
        System.out.println("3. Exit");

        // Simulated menu (extend with real JDBC operations)
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Student Registered Successfully!");
                break;
            case 2:
                System.out.println("Course Enrolled Successfully!");
                break;
            default:
                System.out.println("Thank you for using the system.");
        }
        sc.close();
    }
}
