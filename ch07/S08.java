package ch07;

// 인터페이스는 '기능'
// 여러 클래스에 적용 가능
interface 입 {
    void cry();
}

interface 눈 {
    void see();
}

interface 날개 {
    void fly();
}

// 기능이 있다는 것만 알려줌, 구현은 자손 클래스에서
// 인터페이스들이 모이면 종족의 특성이 될 수 있다
abstract class 사람 implements 입, 눈 {

}

class 홍길동 extends 사람 {

    @Override
    public void cry() {

    }

    @Override
    public void see() {

    }

}

class 천사 extends 사람 implements 날개 {

    @Override
    public void cry() {

    }

    @Override
    public void see() {

    }

    @Override
    public void fly() {

    }

}

// 인터페이스는 클래스에서 여러개 구현 가능
class Cat implements 입, 눈 {

    @Override
    public void cry() {
        System.out.println("야옹");
    }

    @Override
    public void see() {
        System.out.println("고양이가 봅니다");
    }

}

class Dog implements 입, 눈 {

    @Override
    public void cry() {
        System.out.println("멍멍");
    }

    @Override
    public void see() {
        System.out.println("강아지가 봅니다");
    }

}

public class S08 {

}
