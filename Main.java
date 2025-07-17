import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n --- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter name: ");
               sc.nextLine(); // consume leftover newline
                String name = sc.nextLine();

                System.out.print("Enter roll number: ");
                int roll = sc.nextInt();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                Student s = new Student(name, roll, marks);
                students.add(s);

                System.out.println("✅ Student added!");
            } else if (choice == 2) {
                System.out.println("👋 Exiting...");
                break;
            } else {
                System.out.println("⚠️ Invalid choice. Try again.");
            }
        }

        sc.close();
        for (int i =0 ; i < students.size(); i++){
            System.out.println(students.get(i));
        }

    }
}
