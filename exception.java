public class exception {
    public static void main(String[] args) {
        try {
            int x[] = { 10, 20, 30, 40, 50 };
            System.out.println(x[3]);
            System.out.println(x[4] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(" heloo" + e);
        } catch (Exception e) {
            System.out.println("exception caught by super class");
        } finally {
            System.out.println("out of try catch block");
        }

    }

}
