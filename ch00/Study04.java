package ch00;
public class Study04 {
    // 함수 - 반복적으로 사용하는 로직들을 하나로 모음
    // 함수명 printAdd, 소괄호 안의 데이터는 외부에서 받아옴
    public static void printAdd(int num1, int num2) {
        System.out.println("계산 시작");
        System.out.println(num1 + num2);
        System.out.println("계산 끝");
    }

    public static void main(String[] args) {
        // 함수 사용 시 함수명을 적고 괄호 안에 요구 데이터 타입의 데이터 입력
        printAdd(5125, 123125);
    }
}
