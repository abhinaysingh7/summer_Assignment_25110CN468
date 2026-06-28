import java.util.Scanner;

class Account {
    double balance = 10000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Updated Balance = " + balance);
    }

    void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Updated Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Q110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if(choice == 1)
            acc.deposit(amount);
        else if(choice == 2)
            acc.withdraw(amount);
        else
            System.out.println("Invalid Choice");

        sc.close();
    }
}