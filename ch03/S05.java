package ch03;
public class S05 {
    public static void main(String[] args) {
        
        // 삼항 연산자
        // 논리 ? 참 : 거짓
        int age = 70;
        String man = age > 65 ? "할아버지" : "아저씨";
        System.out.println(man);

        // 삼항 연산자 겹쳐서 X
        String man1 = age > 65 ? "할아버지" : (age > 20 ? "어른" : "아이");
        System.out.println(man1);
    }
}
