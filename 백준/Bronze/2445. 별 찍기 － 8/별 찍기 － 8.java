import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i < a; i++) {
            bw.write("*".repeat(i) + " ".repeat(2*(a-i)) + "*".repeat(i));
            bw.newLine();
        }

        for (int i = a; i > 0; i--) {
            bw.write("*".repeat(i) + " ".repeat(2*(a-i)) + "*".repeat(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}