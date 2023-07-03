package ch04;

public class S08Quiz {
    public static void main(String[] args) {
        // 1000 ~ 1 사이 5의 배수 제외 출력
        // 101 미만이 되면 작동 멈추게
        int i = 1004;
        while(i > 100){
            if (i < 101) break;
            if(i % 5 != 0){
                System.out.println(i);
            }
            i--;
        }
    }
}
