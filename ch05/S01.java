package ch05;

public class S01 {
    public static void main(String[] args) {
        // 배열 선언
        int[] intArray = new int[5];

        // 배열의 값 가져오기
        // int 배열은 선언 시 초기화 하지 않으면 0으로 전부 초기화
        System.out.println(intArray[0]);

        // 배열의 요소 값 바꾸기
        intArray[0] = 5;
        System.out.println(intArray[0]);

        // 범위를 넘어선 요소 가져오기
        // ArrayIndexOutOfBoundsException
        System.out.println(intArray[5]);
    }
}
