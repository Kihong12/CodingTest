import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A + B + "\n");
        }
        System.out.println(sb);
    }
}