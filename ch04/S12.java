package ch04;

public class S12 {
    public static void main(String[] args) {
        // for, while 이용해서 별찍기
        // "*" 은 한 개 씩만

        // 1. 
        // *****
        // *****
        // *****
        // *****
        // *****
        // for(int i = 0 ; i < 5 ; i ++){
        //     for(int j = 0 ; j < 5 ; j ++){
        //         System.out.printf("*");
        //     }
        //     System.out.println("");
        // }
        //
        // for(int i = 0 ; i < 5 ; i++){
        //     System.out.println("*".repeat(5));
        // }

        // 2.
        // *
        // **
        // ***
        // ****
        // *****
        // for(int i = 0 ; i < 5 ; i++){
        //     for(int j = 0 ; j < i+1; j++){
        //         System.out.printf("*");
        //     }
        //     System.out.println("");
        // }
        // for(int i = 0 ; i < 5 ; i++){
        //     switch(i){
        //         case 4:
        //             System.out.printf("*"); 
        //         case 3:
        //             System.out.printf("*"); 
        //         case 2:
        //             System.out.printf("*"); 
        //         case 1:
        //             System.out.printf("*"); 
        //         case 0:
        //             System.out.printf("*"); 
        //             break;
        //     }
        //     System.out.println("");
        // }
        //
        // for(int i = 0 ; i < 5 ; i++){
        //     System.out.println("*".repeat(i+1));
        // }


        // 3.
        // *****
        // ****
        // ***
        // **
        // *
        // for(int i = 5 ; i > 0 ; i--){
        //     for(int j = 0 ; j < i ; j++){
        //         System.out.printf("*");
        //     }
        //     System.out.println("");
        // }
        // for(int i = 0 ; i < 5 ; i++){
        //     switch(i){
        //         case 0:
        //             System.out.printf("*"); 
        //         case 1:
        //             System.out.printf("*"); 
        //         case 2:
        //             System.out.printf("*"); 
        //         case 3:
        //             System.out.printf("*"); 
        //         case 4:
        //             System.out.printf("*"); 
        //             break;
        //     }
        //     System.out.println("");
        // }
        //
        // for(int i = 0 ; i < 5 ; i++){
        //     System.out.println("*".repeat(5-i));
        // }
        

        // 4.
        // *****  0 5
        //  ***   1 3
        //   *    2 1
        // for (int i = 0 ; i < 3 ; i++){
        //     for (int k = 0 ; k < i ; k++){
        //         System.out.printf(" ");
        //     }
        //     for (int j = 0 ; j < 5-(2*i) ; j++){
        //         System.out.printf("*");
        //     }
        //     System.out.println("");
        // }
        //
        // for(int i = 0, j = 0 ; i < 3 ; i++, j++){
        //     switch(j){
        //         case 2:
        //             System.out.printf(" ");
        //         case 1:
        //             System.out.printf(" ");
        //             break;
        //     }
        //     switch(i){
        //         case 0 :
        //             System.out.printf("**");
        //         case 1 :
        //             System.out.printf("**");
        //         case 2 :
        //             System.out.printf("*");
        //             break;
        //     }
        //     System.out.println("");
        // }
        //
        // for(int i = 0 ; i < 3 ; i++){
        //     System.out.print(" ".repeat(i));
        //     System.out.println("*".repeat(5-(2*i)));
        // }

        // 5.
        // ***** 5
        // *   * 1 3 1
        // *   * 1 3 1
        // *   * 1 3 1
        // ***** 5
        // for(int i = 0 ; i < 5 ; i++){
        //     System.out.printf("*");
        //     switch(i){
        //         case 0, 4:
        //             System.out.printf("*");
        //             System.out.printf("*");
        //             System.out.printf("*");
        //             break;
        //         case 1, 2, 3:
        //             System.out.printf(" ");
        //             System.out.printf(" ");
        //             System.out.printf(" ");
        //             break;
        //     }
        //     System.out.printf("*");
        //     System.out.println("");
        // }
        //
        // String str;
        // int temp = 5;
        // for(int i = 0 ; i < temp ; i++){
        //     str = "*" + (i > 0 && i < temp - 1 ? " " : "*").repeat(temp - 2) + "*";
        //     System.out.println(str);
        // }
    }
}
