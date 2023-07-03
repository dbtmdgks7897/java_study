package ch04;

public class S07 {
    public static void main(String[] args) {
        // Ctrl + c 로 강제 종료 가능
        int i = 1;
        while(true){
            // 1001이면 브레이크 (출력 X)
            // if(i > 1000){
            //     // while문 내부에서 반복을 멈추게 할 때
            //     System.out.println("반복 종료");
            //     break;
            // }

            System.out.println(i);
            // 1001 출력 후 반복 종료
            // if(i > 1000){
            //     // while문 내부에서 반복을 멈추게 할 때
            //     System.out.println("반복 종료");
            //     break;
            // }
            
            i++;
            
            // 1001 올라가고 바로 브레이크
            if(i > 1000){
                // while문 내부에서 반복을 멈추게 할 때
                System.out.println("반복 종료");
                break;
            }
        }
    }
}
