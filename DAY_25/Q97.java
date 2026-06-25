import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        while (i < arr1.length)
            arr3[k++] = arr1[i++];

        while (j < arr2.length)
            arr3[k++] = arr2[j++];

        System.out.print("Merged Array: ");
        for (int x : arr3)
            System.out.print(x + " ");

        sc.close();
    }
}