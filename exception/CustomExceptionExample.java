class InsufficientBankBalanceException extends Exception {
    public InsufficientBankBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBankBalanceException {
        if (amount > balance) {
            throw new InsufficientBankBalanceException("Insufficient bank balance. Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(1200);
        } catch (InsufficientBankBalanceException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
