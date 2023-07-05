package ch07;

// 클래스는 아무것도 안 적어도 static
// package랑 같은 기능
class 종이접기책목차 {
    
    // 학 접는 방법 (class)
    // 방법 대로 만들면 종이 학 (instance)
    static class 학 {

    }
}

public class S10 {
    public static void main(String[] args) {

        // 클래스의 내부 static 클래스가 실제 클래스이고
        // 외부의 클래스는 내부 static 클래스에 접근할 경로를 제공하는 느낌
        // 외부의 클래스는 내부 static 클래스의 패키지와 비슷
        종이접기책목차.학 bird = new ch07.종이접기책목차.학();
    }
}
