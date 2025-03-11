import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        int mm = sc.nextInt();
        int timer = sc.nextInt();
        sc.close();
        
        mm += timer;
        hh += mm / 60;
        mm %= 60;
        hh %= 24;

        System.out.println(hh + " " + mm);
    }
}
