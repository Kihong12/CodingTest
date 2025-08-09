import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());

        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int startPoint = 0;
        int endPoint = a - 1;
        int count = 0;
        int temp = 0;

        while (startPoint < endPoint) {
            temp = arr[startPoint] + arr[endPoint];

            if (temp > x) {
                endPoint--;
            } else if (temp < x) {
                startPoint++;
            } else if (temp == x) {
                count++;
                startPoint++;
                endPoint--;
            }
        }
        System.out.println(count);
    }
}