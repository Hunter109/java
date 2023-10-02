public class overloading {
    static void display(){
        System.out.println("hello my name is hunter ");
    }
    static void display(int a, int b){
        System.out.println("the value of a is " + a +"the value of b is "+ b);
    }
    static int display (int a , int b, int c ){
        System.out.println("the value of a is" + a);
        System.out.println("the valeu of bs is "+ b);
        System.out.println("the value od c is "+c);
        return b;
    }
    public static void main(String [] args){
        display();
        display(4,5);
        display(4,5);

    }
    
}
