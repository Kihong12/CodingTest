import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String b = String.valueOf(a);

        int[] arr = new int[10];

        for (int i = 0; i < b.length(); i++) {
            arr[b.charAt(i) - 48]++;
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}