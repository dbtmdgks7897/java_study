package ch04;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
            
        
        // switch((int)Math.sqrt(Math.pow(nextInt, 2)) / nextInt){
        //     case 1:
        //         System.out.println("양");
        //         break;
        //     case -1:
        //         System.out.println("음");
        //         break;
        // }
        


        switch(nextInt * nextInt ){
            case 1:
                System.out.println("양");
                break;
            case -1:
                System.out.println("음");
                break;
            default:
                System.out.println("0");
        }

        // switch(nextInt / 10){
        //     case 0:
        //         System.out.println("숫자가 10보다 작습니다");
        //         break;
        //     case 1:
        //         System.out.println("숫자가 9이상 20미만");
        //         break;
        //     case 2:
        //         System.out.println("숫자가 19이상 30미만");
        //         break;
        //     case 3:
        //         System.out.println("숫자가 29이상");
        //         break;
        //     case -1:
        //         System.out.println("음수");
        //         break;
            
            
        // }
    }
}
