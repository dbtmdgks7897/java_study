// package ch08;

// import java.util.InputMismatchException;
// import java.util.Scanner;

// // finally

// public class S03 {
//     public static void main(String[] args) {
        
//         // 스캐너 -> 마지막에 꼭 close() 해줘야 함
//         Scanner scanner = new Scanner(System.in);

//         int num;

//         try {
//             num = scanner.nextInt();            
//         } catch (InputMismatchException e) {
//             num = 0;
//             System.out.println("정수가 아님");
//         // finally는 try안의 모든 변수와 관련된 객체가
//         // 무조건 처리되어야 할 경우
//         // try 안의 코드가 예외 발생하든 안하든 무조건 실행
//         } finally {
//             scanner.close();
//         }

//         System.out.println(num);
//     }   
// }
