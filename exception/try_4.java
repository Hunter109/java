class insufficent extends Exception {
    public insufficent(String msg) {
        super(msg);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double ammount) throws insufficent {
        if (balance < ammount) {
            throw new insufficent("insufficent bank balance");

        } else {
            balance -= ammount;
            System.out.println("withdraw succedfully");
            System.out.println("remaining amount " + balance);

        }
    }

}

public class try_4 {
    public static void main(String[] args) {
        try {
            BankAccount xd = new BankAccount(1000);
            xd.withdraw(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
