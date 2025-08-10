import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            Stack<Character> leftSt = new Stack<>();
            Stack<Character> rightSt = new Stack<>();
            String str = br.readLine();

            for (char c : str.toCharArray()) {
                switch (c) {
                    case '<':
                        if (!leftSt.isEmpty())
                            rightSt.push(leftSt.pop());
                        break;
                    case '>':
                        if (!rightSt.isEmpty())
                            leftSt.push(rightSt.pop());
                        break;
                    case '-':
                        if (!leftSt.isEmpty())
                            leftSt.pop();
                        break;
                    default:
                        leftSt.push(c);
                        break;
                }
            }
            while (!leftSt.isEmpty())
                rightSt.push(leftSt.pop());
            while (!rightSt.isEmpty())
                bw.write(rightSt.pop());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}