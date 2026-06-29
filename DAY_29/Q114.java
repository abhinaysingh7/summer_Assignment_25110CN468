import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 Elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\n1. Display Array");
        System.out.println("2. Find Maximum");
        System.out.println("3. Find Minimum");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int num : arr)
                    System.out.print(num + " ");
                break;

            case 2:
                int max = arr[0];
                for (int num : arr)
                    if (num > max)
                        max = num;
                System.out.println("Maximum = " + max);
                break;

            case 3:
                int min = arr[0];
                for (int num : arr)
                    if (num < min)
                        min = num;
                System.out.println("Minimum = " + min);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}