package ch04;

public class S08 {
    public static void main(String[] args) {
        // continue
        int i = 0;
        while (i <= 1000) {
            i++;
            // 짝수만 출력
            if (i % 2 != 0) {
                // continue를 사용한 위치에서 현재 반복 중지 후
                // 다음 반복 회차로 넘어감
                continue;
            }
            System.out.println(i);
        }
    }
}
