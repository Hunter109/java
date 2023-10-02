class invalidage extends Exception {
    public invalidage(String msg) {
        super(msg);
    }
}

public class try_3 {
    public static void validate(int age) throws invalidage {
        if (age < 18) {
            throw new invalidage("you are not eligible for vote");
        } else {
            System.out.println("you are not eligible for vote");
        }

    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (invalidage e) {
            System.out.println(e);
        }
    }

}
