import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = 0, max = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            } else if (arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println(arr[min] + " " + arr[max]);
    }
}