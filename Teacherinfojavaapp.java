import java.util.*;
class Teacherinfo{
    String name;
    String dob;
    String subject;
    double experience;
    String nativeplace;
    Teacherinfo(String name , String dob , String subject , double experience, String nativeplace) {
        this.name = name;
        this.dob = dob ;
        this . subject = subject;
        this.experience = experience;
        this.nativeplace = nativeplace;
    }
}

public class Teacherinfojavaapp {
    public static void main(String[] args) {
        System.out.println("HELLO GREETINGS");
        ArrayList<Teacherinfo> store = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
      while(true){
          System.out.print("ENTER THE NAME OF THE TEACHER : ");
          String name = sc.nextLine();
          System.out.print("ENTER THE DATE OF BIRTH OF THE OF THE TEACHER : ");
          String dob = sc.nextLine();
          System.out.print("ENTER THE SUBJECT THAT IS HANDELD BY THE TEACHER :");
          String subject = sc.nextLine();
          double experience;
          while(true){
              System.out.print("ENTER THE EXPERIENCE OF THE TEACHER : ");
              experience = sc.nextDouble();
              sc.nextLine();
              if(experience>=0){
                  break;
              }
              else {
                  System.out.println("PLEASE CHECK THE EXPERIENCE AND RE-ENTER");
              }

          }
          System.out.print("ENTER THE NATIVE PLACE OF THE TEACHER : ");
          String nativeplace = sc.nextLine();
          Teacherinfo t = new Teacherinfo(name,dob,subject,experience,nativeplace);
          store.add(t);
          System.out.println("Do you want to continue? (1 = yes, 2 = exit): ");
          int choice = sc.nextInt();
          sc.nextLine();
          if(choice ==2){
              System.out.println("THANK YOU ......................................");
              break;
          }
      }
          System.out.println("THE TEACHERS DETAILS THAT YOU HAVE JUST ENTERED ");
          for(Teacherinfo getdetailes : store ){
              System.out.println("------------------------------------------------------------------------");
              System.out.println("THE NAME OF THE TEACHER : " + getdetailes.name);
              System.out.println("THE DATE OF THE BIRTH OF THE TEACHER : "+ getdetailes.dob);
              System.out.println("THE SUBJECT THAT IS HANDLED BY THE TEACHER : " + getdetailes.subject);
              System.out.println("THE  YEARS OF EXPERIENCE TEACHER HAVE : " + getdetailes.experience +" yrs");
              System.out.println("THE NATIVE PLACE OF THE TEACHER : " + getdetailes.nativeplace);

          }
    }
}
