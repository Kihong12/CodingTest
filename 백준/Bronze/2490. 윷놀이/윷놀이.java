import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = 0;
            for (int j = 0; j < 4; j++) {
                a += Integer.parseInt(st.nextToken());
            }
            if (a == 0) {
                System.out.println("D");
            } else if (a == 1) {
                System.out.println("C");
            } else if (a == 2) {
                System.out.println("B");
            } else if (a == 3) {
                System.out.println("A");
            } else {
                System.out.println("E");
            }
        }
    }
}