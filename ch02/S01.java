package ch02;

public class S01 {
    public static void main(String[] args) {
        System.out.println(65);
        // 형변환 - 리터럴 앞에 소괄호를 적고 그 안에 타입 입력
        // 명시적 형변환
        System.out.println((char)65);

        // 범위가 적은 데이터 타입에서 큰 타입은 문제 X
        System.out.println((double)65);

        // 큰 타입에서 작은 데이터 타입으로 변환시 데이터 유실 가능성 O 
        System.out.println((int)65.1);        

        // 다른 타입을 계산하게 되면 범위가 큰 타입으로 자동 캐스팅
        // 묵시적 형변환
        System.out.println(3.0 / 2);
        System.out.println(3.0 / (double)2);
        System.out.println(3 / 2.0);
    }    
}
