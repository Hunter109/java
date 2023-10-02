import java.util.Scanner;
public class character {
    public static void main(String args[]){
int x;
char a;
try (Scanner hunter = new Scanner(System.in)) {
    System.out.println("enter the valye of x");
    x=hunter.nextInt();
    System.out.println(x);
    System.out.println("enter the character");
    a = hunter.next().charAt(0);
}
System.out.println(a);

    }
    
}
