import java.util.Scanner;
public class method {
 void myNeb(){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter your faculty name ");
        String faculty = sc.nextLine();
        System.out.println("enter your age");

        String course = sc.nextLine();
        System.out.println("enter your college name ");
        String college = sc.nextLine();

        System.out.println(faculty);
        System.out.println(course);
        System.out.println(college);
    }
 }

    public static void myInfo(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your name ");
            String name = sc.nextLine();
            System.out.println("enter your course");

            String course = sc.nextLine();
            System.out.println("enter your college name ");
            String college = sc.nextLine();

            System.out.println(name);
            System.out.println(course);
            System.out.println(college);
        }

    }
    public static void main(String[] args){
        System.out.println("my bachelor detail");
       myInfo();
       System.out.println( "my +2 details ");
       method hunter = new method();
       hunter.myNeb();
    //    hunter.myInfo();

    }
    
}
