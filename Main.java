public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(
                "PK1001",
                "Humaira",
                15000
        );

        try {
            acc1.deposit(2000);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            acc1.withdraw(3000);
        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        acc1.printStatement();
        
        try {
            acc1.withdraw(25000);
        }
        catch (InsufficientFundsException e) {
            System.out.println("\nException Caught: " + e.getMessage());
        }

        try {
            acc1.deposit(-500);
        }
        catch (IllegalArgumentException e) {
            System.out.println("\nException Caught: " + e.getMessage());
        }
    }
}
