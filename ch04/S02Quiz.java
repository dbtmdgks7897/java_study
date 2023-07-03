package ch04;

import java.util.Scanner;

public class S02Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("점수 입력 : ");
        int score = scanner.nextInt() / 10;

        // 90 이상 A
        // 80 이상 B
        // 70 이상 C
        // 60 이상 D
        // 60 미만 F
        switch (score) {
            case 10, 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("f");
                break;
        }

        

    }

}
