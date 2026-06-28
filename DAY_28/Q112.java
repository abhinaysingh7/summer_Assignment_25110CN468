import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Phone: " + phone);
    }
}

public class Q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        Contact c = new Contact(name, phone);

        System.out.println("\nContact Details");
        c.display();

        sc.close();
    }
}