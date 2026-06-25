import java.util.Scanner;

public class Q100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[i].length() > str[j].length()) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Strings sorted by length:");
        for (String s : str) {
            System.out.println(s);
        }

        sc.close();
    }
}