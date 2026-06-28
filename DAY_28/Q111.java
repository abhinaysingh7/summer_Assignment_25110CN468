import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seats = 50;

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        if(tickets <= seats) {
            seats -= tickets;
            System.out.println("Booking Successful");
            System.out.println("Remaining Seats = " + seats);
        } else {
            System.out.println("Seats Not Available");
        }

        sc.close();
    }
}