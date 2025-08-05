import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            for (int j = 0; j < (end - start + 1) / 2; j++) {
                int temp = arr[start + j];
                arr[start + j] = arr[end - j];
                arr[end - j] = temp;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}