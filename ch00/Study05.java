package ch00;
public class Study05 {
    public static void main(String[] args) {
        // 스코프
        // 글로벌 - 어디서든 접근할 수 있는 변수

        // 함수 - 함수 내에서만 작동하고 벗어나면 없어지는 변수

        // 블록 - if, for, while 등 중괄호로 감싸지는 영역
        // 블록 내에서만 작동하고 벗어나면 없어짐

        // 자바 변수는 기본적으로 블록 단위

        // int i = 0;
        // while(i < 10){
        // int a = 1;
        // System.out.println(a);
        // i++;
        // a++;
        // }
        // System.out.println(i);

        // 블록 스코프 내에서 만든 변수는 블록 이탈 시 없어짐
        // if(true){
        // int a = 1;
        // }
        // System.out.println(a); 작동 안됨

        // gor에서 만든 변수는 반복이 끝날 때까지 살아있다가 이탈 시 없어짐

        // for (int i = 0 ; i < 10 ; i++){

        // }
        // System.out.println(i);

        // while에서 같은 변수로 여러 개의 while문을 쓰려 할 때
        // 변수 초기화 필요
        // int i = 0;
        // while (i < 10) {
        // System.out.println("첫 while");
        // i++;
        // }
        // i = 0;
        // while (i < 10) {
        // System.out.println(("둘 while"));
        // i++;
        // }

        // for (int i = 0; i < args.length; i++) {
        //     System.out.println("첫 for");
        // }
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println("둘 for");
        // }

        // 프로그래밍 작동 되는 동안 계속 사용할 변수라면 글로벌

        // while에서 횟수가 정해진 반복문 사용 시 외부에서 선언하여 변경 사용
        // for에서는 ()안에 변수를 만들고 변경하며 사용

        // if, while, for 등의 블록 안에서 선언시 반복 시마다 초기화
    }
}
