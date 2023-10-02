/**
 * customclass
 */
import java.util.Scanner;

 class Hunter{
    String name;
    int salary;
    Scanner sc = new Scanner(System.in);
 public void showDetail(){
    System.out.println("detail oof employee");
    System.out.println("my name is " +name);
    System.out.println("my salary " + salary);
 }
 public void getDetail(){
    System.out.println("enter your name ");
    name = sc.nextLine();
    System.out.println("enter your salary ");
    salary = sc.nextInt();

 }

 }
public class customclass {

    public static void main(String[] args) {
        Hunter obj = new Hunter();
        obj.getDetail();
        obj.showDetail();
        
    }
}