/**
 * try_1
 */
public class try_1 {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        try {
            System.out.println(arr[5]);
            System.out.println(arr[2] / 0);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound exception occur");

        }

        catch (ArithmeticException e) {
            System.out.println("arithmetic exception occur");
        }
    }

}