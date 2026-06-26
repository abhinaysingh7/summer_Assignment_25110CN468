import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("1. Java is developed by?");
        System.out.println("1. Microsoft");
        System.out.println("2. Sun Microsystems");
        System.out.println("3. Apple");
        System.out.print("Answer: ");

        int ans = sc.nextInt();

        if (ans == 2)
            score++;

        System.out.println("Your Score: " + score + "/1");

        sc.close();
    }
}