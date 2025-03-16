import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];

        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            int t = 0;

            t = basket[c-1];
            basket[c-1] = basket[d-1];
            basket[d-1] = t;
        }
        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}

