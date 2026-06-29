import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Quantity : " + quantity);
    }
}

public class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Product p = new Product(id, name, quantity);

        System.out.println("\nInventory Details");
        p.display();

        sc.close();
    }
}