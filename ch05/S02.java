package ch05;

public class S02 {
    public static void main(String[] args) {
        // 배열의 값 교환
        int[] intArray = new int[2];
        intArray[0] = 1;
        intArray[1] = 2;

        int temp = intArray[0];
        intArray[0] = intArray[1];
        intArray[1] = temp;
    }
}
