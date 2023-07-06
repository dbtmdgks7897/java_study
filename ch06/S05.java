package ch06;

// 함수를 사용하기 위한 클래스 (보통 함수 만들 때 클래스를 만들고 사용)
class CalcUtil{

    // static을 사용하면 객체를 생성하지 않아도 기능 사용 가능
    // 함수
    // 리턴 타입 존재 할 수도 안 할 수도
    // 함수의 이름은 개발자가 기능과 관련된 것으로 정하기
    // 소괄호 안에는 매개변수 / 인자 / 인수
    static int add(int a, int b){
        // return 뒤에는 내부에서 연산된 값을 요청한 곳에 되돌려 줌
        // 리턴 타입이 void라면 return이 없거나 return;으로 마무리
        return a + b;
    }

}

public class S05 {
    public static void main(String[] args) {
        // 호출된 함수(CalcUtil.add)는 결과 값으로 바뀜 
        // ex) 자판기에 500원을 넣으면
        // 자판기에서 콜라가 나오는 것이 아니라
        // 자판기 자체가 콜라가 되는 것과 비슷
        int result = CalcUtil.add(2, 3);

        System.out.println(result);
    }
}
