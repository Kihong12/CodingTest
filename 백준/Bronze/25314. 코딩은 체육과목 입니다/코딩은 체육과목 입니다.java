import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int longCount = n / 4 - 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= longCount; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb.toString());
    }
}
