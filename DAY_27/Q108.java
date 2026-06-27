import java.util.Scanner;

class BankAccount {
    double balance = 10000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance = " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (choice == 1)
            account.deposit(amount);
        else if (choice == 2)
            account.withdraw(amount);
        else
            System.out.println("Invalid Choice");

        sc.close();
    }
}