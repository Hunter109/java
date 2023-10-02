import java.io.FileInputStream;

public class FIleException {
    public static void main(String[] args) {

        try {
            FileInputStream xd = new FileInputStream("hunter.txt");
            int i;
            while ((i = xd.read()) != -1) {
                System.out.print((char) i);
            }
            xd.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}