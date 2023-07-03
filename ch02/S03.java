package ch02;

import java.util.Scanner;

public class S03 {

    public static void main(String[] args) {

        // 데이터 입력 받기
        Scanner scanner = new Scanner(System.in);

        // nextInt -> 입력된 값을 int 타입으로 형변환 후 리턴
        // int nextInt = scanner.nextInt();
        // System.out.println("나온 값은 " + nextInt);


        // scanner.next는 띄어쓰기 기준
        // String next = scanner.next();
        // String next1 = scanner.next();
        // String next2 = scanner.next();
        // System.out.println(next);
        // System.out.println(next1);
        // System.out.println(next2);

        String nextLine = scanner.nextLine();
        System.out.println(nextLine);

        

        scanner.close();
    }
}
