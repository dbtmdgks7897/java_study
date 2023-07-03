package ch04;

public class S04 {
    public static void main(String[] args) {

        //0 <= Math.random() < 1
        double num = Math.random() * 45;

        // int로 캐스팅하여 0~44로
        int intNum = (int) num;
        
        // + 1
        int result = intNum + 1;

        System.out.println(result);
    }
}
