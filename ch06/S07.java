package ch06;

class Temp{
    public static int myFunction(int b){
        int a = 1;
        if(a + b > 0){
            System.out.println("10보다 작습니다.");
            return myFunction(a + b);
        }else{
            return a+b;
        }
    }
}

public class S07 {
    public static void main(String[] args) {
        // Temp.myFunction(0);

        // 대부분의 재귀 함수는 반복문으로 바뀔 수 있다
        // while(true){
        //     System.out.println("10보다 작습니다");
        // }
    }
    
}
