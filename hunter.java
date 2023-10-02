/**
 * main
 */
import java.util.Scanner;
class car {
    String name;
    int price;
    String color;
    int year;
    String model;
    Scanner sc = new Scanner(System.in);

    public void getDetailCar() {
        System.out.println("enter car name ");
        name = sc.nextLine();
        System.out.println("enter your model number");
        model = sc.nextLine();
        System.out.println("enter your car color");
        color = sc.nextLine();
        System.out.println("enter car release year");
        year = sc.nextInt();
        System.out.println("enter the price of car");
        price = sc.nextInt();

        
    }

    public void showCarDetail(){
        System.out.println("car name : "+ name);
        System.out.println("car model : "+ model);
        System.out.println("car color : "+ color );
        System.out.println("car release year : " + year );
System.out.println("price of car is : RS "+ price);
    }

}

public class hunter {

    public static void main(String[] args) {
        System.out.println("hellow world");

        car thar = new car();

        System.out.println("inserting detail of carr");
        thar.getDetailCar();

        System.out.println("displaying car detail");
        thar.showCarDetail();

    }
}