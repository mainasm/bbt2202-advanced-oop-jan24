//Class with a custom exception method
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountId;
    private double balance;

    //Constructor
    public BankAccount(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    //Method to withdraw funds
    public void withdraw(double amount) {

        //Try block to attempt withdrawal while throwing exception if logic fails
        try {
            System.out.println("Attempting to withdraw: $" + amount);
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);

        //Catch block to catch the exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error during withdrawal: " + e.getMessage());

        //Code to be executed regardless of the outcome of exception handling
        } finally {
            System.out.println("Transaction completed.");
        }
    }
    // Getter for balance to show final account state
    public double getBalance() {
        return balance;
    }

    //Main method to test the withdrawal logic
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 500.0);
        account.withdraw(1000.0); // Attempting to withdraw more than the balance
        System.out.println("Final account balance: $" + account.getBalance());
    }
}
