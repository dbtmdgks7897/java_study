// package ch08;

// public class S02 {
//     public static void main(String[] args) {
//         int[] intArr = { 10, 20 };

//         try{
//         // 여기서 에러 발생
//         System.out.println(10 / 0);
//         // 밑으로 안 내려감

//         System.out.println(intArr[2]);
//         } catch (ArithmeticException e) {
//         System.out.println("인덱스 값 예외 발생");
//         }

//         try {
//             System.out.println(intArr[2]);
//             System.out.println(10 / 0);

//         // 발생할 수 있는 모든 에러에 대해 각각 처리해주는 것이 좋다
//         } catch (ArithmeticException e) {
//             System.out.println("계산 예외 발생");
//         } catch (ArrayIndexOutOfBoundsException e1) {
//             System.out.println("배열 검색 범위 넘어섬");
//         }

//         try {
//             System.out.println(intArr[2]);
//             System.out.println(10 / 0);
//             // 중요한 코드가 아닐 시
//             // 한꺼번에 처리 가능
//             // 예외 클래스 최상위 Exception
//         } catch (Exception e) {
//             System.out.println("예외 발생");
//         }



//     }
// }
