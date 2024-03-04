public class BankAccount {
    private final String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor to initialize BankAccount object
    public BankAccount(String accountNumber, double initialBalance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for account holder name allows updating the name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: $" + balance);
    }
}

class MainAccount {
    public static void main(String[] args) {
        // Creating a new bank account
        BankAccount account = new BankAccount("123456789", 1000.0, "John Doe");
        // Displaying initial account details
        account.displayAccountDetails();
        // Performing some account operations
        account.deposit(500);
        account.withdraw(200);
        // Attempting an invalid operation
        account.withdraw(2000);
        // Updating and displaying account details
        account.setAccountHolderName("Jane Doe");
        account.displayAccountDetails();
    }
}

