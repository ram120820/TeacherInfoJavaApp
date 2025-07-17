import java.util.*;
class print {

    public static void main(String[] args) {
        ArrayList< String> teacherlist = new ArrayList<>();
        for (;;){
            System.out.print("enter a name of the teacher : ");
            Scanner sc = new Scanner(System.in);
            String teacher_name = sc.nextLine();
            System.out.print("enter teacher roll no : ");
            int teachersrollno = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------------");
            System.out.println("THE TEACHER NAME YOU HAVE PRINTED " + teacher_name);
            System.out.println("THE TEACHER ROLL NO YOU HAVE ENTER " +teachersrollno);
            System.out.println("enter 1 to continue 2 to exit");
            int no = sc.nextInt();
            sc.nextLine();
            if (no==2){
                break;
            }
        }
    }
}