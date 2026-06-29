import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("\n1. Uppercase");
        System.out.println("2. Lowercase");
        System.out.println("3. Reverse");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(str.toUpperCase());
                break;

            case 2:
                System.out.println(str.toLowerCase());
                break;

            case 3:
                for (int i = str.length() - 1; i >= 0; i--)
                    System.out.print(str.charAt(i));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}