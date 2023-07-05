package ch09;

public class S02 {
    public static void main(String[] args) {
        // 0이상 1미만의 랜덤한
        System.out.println("Math.random() : " + Math.random());
        // 절댓값
        System.out.println("Math.abs(-10) : " + Math.abs(-10));
        // 반올림
        System.out.println("Math.round(1.5) : " + Math.round(1.5));
        System.out.println("Math.round(1.4) : " + Math.round(1.4));
        // 내림(double 반환)
        System.out.println("Math.floor(1.5) : " + Math.floor(1.5));
        System.out.println("Math.floor(1.25) : " + Math.floor(1.25));
        // 올림(double 반환)
        System.out.println("Math.ceil(1.5) : " + Math.ceil(1.5));
        System.out.println("Math.ceil(1.25) : " + Math.ceil(1.25));
        System.out.println("Math.ceil(1.0) : " + Math.ceil(1.0));
        // n제곱 계산(double 반환)
        System.out.println("Math.pow(2, 3) : " + Math.pow(2, 3));
        // 루트(double 반환)
        System.out.println("Math.sqrt(4) : " + Math.sqrt(4));
        // 파이값
        System.out.println("Math.PI : " + Math.PI);
    }
}
