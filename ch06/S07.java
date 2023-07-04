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

        String my_string = "banana";
        String is_suffix = "ana";

        int answer = 0;
        // 3 + 3 == 6
        if(my_string.indexOf(is_suffix) + is_suffix.length() + 1 == my_string.length()){
answer = 1;}
        System.out.println(my_string.indexOf(is_suffix));
        System.out.println(is_suffix.length());
        System.out.println(answer);
    }
    
}
