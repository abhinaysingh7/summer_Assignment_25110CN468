import java.util.Scanner;

public class Q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        boolean symmetric = true;

        System.out.println("Enter matrix:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(a[i][j] != a[j][i]) {
                    symmetric = false;
                }
            }
        }

        if(symmetric) {
            System.out.println("Symmetric Matrix");
        } else {
            System.out.println("Not Symmetric Matrix");
        }

        sc.close();
    }
}