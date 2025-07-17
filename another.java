 import java.util.*;

    public class another {
        public static void main(String[] args) {
            ArrayList<String> store = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int i = 0;

            System.out.println("HELLO GREETINGS");

            while (true) {
                i++;
                System.out.print("ENTER THE TEACHER NAME: ");
                String name = sc.nextLine();

                System.out.print("ENTER THE SUBJECTS THAT CAN BE HANDLED BY THE TEACHER: ");
                String subject = sc.nextLine();

                store.add(name + " - " + subject);

                System.out.print("Do you want to enter more? Type 'yes' or 'no': ");
                String collect = sc.nextLine();

                if (collect.equalsIgnoreCase("no")) {
                    System.out.println("TOTAL ENTRIES DONE: " + i);
                    System.out.println("THANK YOU FOR ENTERING....................................................");
                    break;
                }
            }

            System.out.println("\nThe teachers and their subjects you entered:");
            for (String entry : store) {
                System.out.println(entry);
            }

            sc.close(); // Good practice to close the scanner
        }
    }

