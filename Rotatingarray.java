import java.util.Scanner;
public class Rotatingarray {
    public static void rotatingRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        int[] temp1 = new int[n];
        for (int i = 0; i < k; i++) {
            temp1[i] = arr[n - k + i];
        }
        for (int i = k; i < n; i++) {
            temp1[i] = arr[i - k];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp1[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();
        System.out.println("\nOriginal Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        rotatingRight(arr, k);
        System.out.println("\nArray after rotate right by " + k + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}