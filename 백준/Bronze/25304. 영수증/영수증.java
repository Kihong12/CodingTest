import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 영수증에 적힌 총 금액
        int totalAmount = sc.nextInt();
        
        // 구매한 물건의 종류 수
        int N = sc.nextInt();
        
        // 계산된 총 금액
        int calculatedAmount = 0;
        
        // 물건의 가격과 개수를 읽고 합산
        for (int i = 0; i < N; i++) {
            int price = sc.nextInt();  // 가격
            int quantity = sc.nextInt();  // 개수
            calculatedAmount += price * quantity;  // 계산된 금액에 더함
        }
        
        // 계산된 금액과 영수증 금액 비교
        if (totalAmount == calculatedAmount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
