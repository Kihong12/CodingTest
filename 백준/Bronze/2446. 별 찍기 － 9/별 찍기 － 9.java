import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            bw.write(" ".repeat(i) + "*".repeat(2*(a-i)-1));
            bw.newLine();
        }

        for (int i = 2; i <= a; i++) {
            bw.write(" ".repeat(a-i) + "*".repeat(2*i-1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}