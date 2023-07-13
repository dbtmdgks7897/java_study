package ch00;

import lombok.Getter;
import lombok.ToString;

class Animal {
    // 상속이나 같은 종류만 접근 가능
    // protected
    protected String name;
}

@ToString
@Getter
class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println("야옹");
    }
}

public class Study08 {
    public static void main(String[] args) {
        Cat cat = new Cat("dd");

        cat.cry();

        // 조상 클래스로 캐스팅 하는 것 = 업캐스팅
        Animal animal = (Animal) cat;

        // 자손이 cry를 가지고 있더라도
        // 업캐스팅 시 사용할 수 없다
        // animal.cry();

        // 자손 클래스로 캐스팅 하는 것 = 다운캐스팅
        Cat cat1 = (Cat) animal;
        cat1.cry();
        System.out.println(cat1);


        // Cat -> Animal -> Cat은 가능 하지만
        // 원래 Animal 에서 Cat은 불가능
        Animal animal2 = new Animal();        
        Cat cat2 = (Cat) animal2;

        cat2.cry();
    }
}
