package ch07;

class Skill{
    String name; // 스킬 이름
    int damage; // 공격력

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}

class Skill0 extends Skill{
    public Skill0(){
        super("달팽이 세마리", 1);
    }
    // super - 부모(Skill) 클래스의 요소
    public Skill0(String name, int damage){
        // 부모의 생성자 호출
        // Skill은 기본 생성자가 없어 부모 생성자와 매개변수 넘겨줘야 가능
        super(name, damage);
    }
}

// Skill_1 클래스 생성 / 모든 매개변수 받는 생성자
class Skill1 extends Skill{
    public Skill1(){

        super("1차 스킬", 10);
    }
    public Skill1(String name, int damage){
        super(name, damage);
    }
}

class 초보자{
    // 포함
    Skill skill_0;

    public 초보자() {
        // 부모 클래스를 상속 받은 자식 클래스는
        // 부모 클래스 형식의 변수에 담길 수 있다.
        // ex) Skill0도 Skill이기 때문에 Skill형 변수에 담길 수 있다.
        this.skill_0 = new Skill0();
    }
    public 초보자(Skill0 skill){
        this.skill_0 = skill;
    }

}

class 마법사 extends 초보자{
    Skill skill_1;

    public 마법사() {
        super(new Skill0("달팽이 세마리", 3));
        this.skill_1 = new Skill1("매직 클로", 10);
    }
} 

public class S03 {
    public static void main(String[] args) {
        
    }
}
