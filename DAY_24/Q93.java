import java.util.Scanner;

public class Q93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() == str2.length() &&
            (str1 + str1).contains(str2)) {
            System.out.println("String is Rotation");
        } else {
            System.out.println("String is Not Rotation");
        }

        sc.close();
    }
}