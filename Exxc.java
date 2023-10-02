import java.util.Scanner;
class Exception{
    private int num;
    private int deno;
    Scanner sc = new Scanner(System.in);
     public Exception(){
         System.out.println("object created sucesssfulyy");
     }
     
     public void setup(){
         System.out.println("enter the value of numerator");
         num = sc.nextInt();
         
          System.out.println("enter the value of denomerator");
         deno = sc.nextInt();
     }
     
     public void division(){
         try{
              System.out.println("the division calcutaion perform");
              int division = (num/deno);
              System.out.println("the value of division is " + division);
         
         } catch(ArithmeticException H){
             System.out.println("the exception occur and tha eexception is :");
             System.out.println(H);
             
         }
         
     }
}
public class Exxc{
    public static void main(String [] args){
        Exception a1 = new Exception();
        a1.setup();
        a1.division();
    }
}