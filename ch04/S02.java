package ch04;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();
        if(nextInt < 10){
            System.out.println("10보다 작음");
        } else if (nextInt < 20) { 
            System.out.println("9보다 크고 20보다 작음");
        } else if (nextInt < 30) { 
            System.out.println("19보다 크고 30보다 작음");
        }

        scanner.close();
    }
}
