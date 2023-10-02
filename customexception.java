class InvalidAgeException extends Exception {

    InvalidAgeException(String ex) {
        super(ex);
    }
}

public class customexception {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("user not valid to vote");
        } else {
            System.out.println("user valid to vote");
        }

    }

    public static void main(String[] args) {
        try {
            validate(12);
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
