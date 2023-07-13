package ch12;

// 제네릭
// <T extends "제한할 타입">
class Num <T extends Number> {
    // 필드가 정수일 수도 있고 소수일 수도 있는 경우
    T value;

    public Num(T value){
        this.value = value;
    }
}

public class S01 {
    public static void main(String[] args) {
        // Integer - int의 참조형 타입
        // Num num = new Num<Integer>(1.0);
        // Num num = new Num<Double>(1.0);
        // Num num = new Num<Long>(1L);
        // Num num = new Num<Float>(1.0f);

        // 타입 제한에 걸려 오류
        // Num num = new Num<String>("asdf");

        // 앞에 제네릭을 적으면 뒤에 안 적어도 되긴 하지만 둘 다 적는 게 좋음
        Num<Long> num = new Num<Long>(1L);

    }
}
