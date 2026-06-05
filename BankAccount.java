class BankAccount implements Transactable {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    @Override
    public void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance += amount;
        System.out.println("Deposit Successful: " + amount);
    }
    @Override
    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful: " + amount);
    }  
    public void printStatement() {
        System.out.println("\n---Account Statement---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Current Balance: " + balance);
    }

}

