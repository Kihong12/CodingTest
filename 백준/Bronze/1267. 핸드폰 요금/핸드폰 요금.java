import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ysum = 0;
        int msum = 0;

        for (int j = 0; j < a; j++) {
            if (arr[j] / 30 >= 1) {
                ysum += 10 * ((arr[j] / 30)+1);
            } else {
                ysum += 10;
            }
        }

        for (int j = 0; j < a; j++) {
            if (arr[j] / 60 >= 1) {
                msum += 15 * ((arr[j] / 60)+1);
            } else {
                msum += 15;
            }
        }

        if (ysum == msum) {
            System.out.println("Y M " + ysum);
        } else if (ysum < msum) {
            System.out.println("Y " + ysum);
        } else {
            System.out.println("M " + msum);
        }
    }
}