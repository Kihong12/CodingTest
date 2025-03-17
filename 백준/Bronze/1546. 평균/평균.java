import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt(); // 사용자에게 개수 입력받기
        int[] score = new int[count]; // 입력받은 개수만큼 배열 선언
        
        int max = 0;

        // 점수 입력 및 최댓값 찾기
        for (int i = 0; i < count; i++) {
            score[i] = sc.nextInt();
            if (max < score[i]) {
                max = score[i];
            }
        }

        // 새로운 평균 계산
        double newsum = 0;
        for (int i = 0; i < count; i++) {
            newsum += (double) score[i] / max * 100;
        }

        sc.close();

        // 기존 출력문 유지
        System.out.println((double) newsum / count);
    }
}