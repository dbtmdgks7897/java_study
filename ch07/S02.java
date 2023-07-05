package ch07;

// 작은 구성요소, 포함될 클래스 생성
class Skill{
    String name;
    int damage;

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}

class 초보자{
    // 스킬 클래스 포함
    Skill skill_1;

    public 초보자() {
        this.skill_1 = new Skill("달팽이 세마리", 1);
    }
    
}

class 마법사 extends 초보자{
    // 스킬 클래스 포함
    Skill skill_2;

    public 마법사() {
        this.skill_2 = new Skill("매직 클로", 10);
    }
}

public class S02 {
    public static void main(String[] args) {
        
    }
}
