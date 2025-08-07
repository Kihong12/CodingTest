import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = 0;
        int count = 1;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < 9; i++) {
            if (max != arr[i]) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(max);
        System.out.println(count);

    }
}