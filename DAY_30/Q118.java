import java.util.Scanner;

class LibraryBook {
    int id;
    String name;

    LibraryBook(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Book ID : " + id);
        System.out.println("Book Name : " + name);
    }
}

public class Q118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        LibraryBook book = new LibraryBook(id, name);

        System.out.println("\nLibrary Record");
        book.display();

        sc.close();
    }
}