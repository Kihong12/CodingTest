import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        long minus = b - a - 1;

        if (a == b) {
            System.out.println(0);
        } else {
            System.out.println(minus);
        }
        
        for (long i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }
    }
}