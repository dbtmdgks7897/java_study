package ch05;

public class S05{
    public static void main(String[] args) {
        int a = 1;
        int b = a;
        b = 5;
        System.out.println(a);
        System.out.println(b);

        // 참조형은 '주소'를 대입
        // int[] intArray = {10, 20};
        // int[] intArray1 = intArray;
        // 그 주소의 데이터를 30으로 바꿨기 때문에
        // intArray1[0] = 30;
        // 두 참조형 변수안의 위치의 데이터가 바뀜 (둘 다 30)
        // System.out.println(intArray[0]);
        // System.out.println(intArray1[0]);

        // 배열 복사
        int[] intArray = {10, 20, 30};
        int[] intArray1 = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray1[i] = intArray[i];
        }
    }
}