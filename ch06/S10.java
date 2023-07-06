package ch06;

class Cat{
    String name;
    
    public Cat(String name) {
        this.name = name;
    }

    
}

public class S10 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("야옹이");
        // 참조형 변수는 복사의 개념이 아닌 다른 이름은 하나 더 붙여준 것
        // 같은 공간.
        Cat cat2 = cat1;

        // cat2의 내용을 바꾸면
        cat2.name = "뚱땡이";
        // cat1의 내용도 바뀜
        System.out.println(cat1.name);
    }
}
