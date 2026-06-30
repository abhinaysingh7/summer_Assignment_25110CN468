import java.util.Scanner;

public class Q117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] marks = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter Student Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nStudent Records");
        for(int i = 0; i < n; i++) {
            System.out.println(name[i] + " - " + marks[i]);
        }

        sc.close();
    }
}