import java.io.FileInputStream;

public class try_2 {
    public static void main(String[] args) {
        try {
            FileInputStream xd = new FileInputStream("hunter.txt");
            int i = 0;
            while ((i = xd.read()) != -1) {
                System.out.print((char) i);
            }
            xd.close();

        } catch (

        Exception e) {
            System.out.println("exception occure: " + e);
        }
    }

}
