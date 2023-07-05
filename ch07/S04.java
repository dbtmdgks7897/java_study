package ch07;

// 모든 스킬들의 공통적인 부분 세팅
// MAX_POINT는 모든 스킬들의 공통 고정 값 (static final)
class Skill {
    static final int MAX_POINT = 5;
    String name;
    int point;
    Champ champ;

    public Skill(String name, Champ champ) {
        this.name = name;
        this.champ = champ;
        this.point = 0;
    }

    public int getDamage() {
        return 0;
    }

    public void plusPoint() {
        if (this.point >= MAX_POINT) {
            this.point = MAX_POINT;
            System.out.println("포인트를 더이상 올릴 수 없습니다");
            return;
        }
        this.point++;
    }
}

// 챔피언의 공통적인 부분들 만들기
class Champ {
    // 물리 공격력
    int ad;
    Skill skill;

    public Champ(int ad, Skill skill) {
        this.ad = ad;
        this.skill = skill;
    }

}

// 챔피언의 공통적인 부분을 이어 받되
// 캐릭터의 개별 특징을 세팅
class ash extends Champ {
    public ash() {
        // 1. 상속받는 객체가 생성됨
        // 2. super를 통해 객체 안의 필드에 값을 초기화 해줌
        super(100, null);
        // 3. 현재 class의 객체가 생성됨
        // 4. 현재 객체 안의 필드에 값을 넣어줌
        this.skill = new Volley(this);
    }
}

// 부모가 필요로하는 정보는 넘겨주고
// 내가 부모와 다르게 커스텀 할 부분 세팅
class Volley extends Skill {

    public Volley(Champ champ) {
        super("일제사격", champ);
    }

    // 부모가 가진 메소드 형태를 그대로 가져와
    // 내용만 바꿔 세팅
    @Override
    public int getDamage() {
        // return super.getDamage();
        // 고정 데미지 20 35 50 65 80
        // + 캐릭터 공격력 * 1

        // 스킬을 찍지 않았을 때
        if (point < 1) {
            System.out.println("스킬을 사용할 수 없습니다");
            return super.getDamage();
        }

        int damage = (int) (20 + (15 * (point - 1)) + (this.champ.ad * 1.0));

        return damage;
    }
}
// 고정 공격력 : 50 90 130 170 210
// 캐릭터 공격력 * 1.25 / 1.45 / 1.65 / 1.85 / 2.05
class Peace extends Skill {
    public Peace(Champ champ){
        super("필트오버 피스메이커", champ);
    }
 
    @Override
    public int getDamage(){
        int damage = 0;

        if(point < 1){ 
            System.out.println("스킬을 사용할 수 없습니다");
            return super.getDamage();
        }  
        damage = (50 + (point-1) * 40) + (int)(champ.ad * (1.25 + 0.2 * (point-1)));
        return damage;
    }
}     

class 케이틀린 extends Champ{
    public 케이틀린(){
        super(100, null);
        this.skill = new  Peace(this);
    } 
}

public class S04 {
    public static void main(String[] args) {
    
        // // 참조형 변수에 주소값을 아직 모르는 상태에서
        // // 초기화 하는 경우 null 사용

        // System.out.println(str);
        // str = new String("홍길동");
        // System.out.println(str);
        // // 더 쓰지 않는 객체에 null
        // str = null;

        // ash champ1 = new ash();
        // System.out.println(champ1.skill.getDamage(champ1));
        // champ1.skill.plusPoint();
        // System.out.println(champ1.skill.getDamage());
        // champ1.skill.plusPoint();
        // System.out.println(champ1.skill.getDamage());

        // // 케이틀린 생성
        // 케이틀린 champ2 = new 케이틀린();
        // // 케이틀린
        // champ2.skill.plusPoint();
        // System.out.println(champ2.skill.getDamage());
        // champ2.skill.plusPoint();
        // System.out.println(champ2.skill.getDamage());


        // 상속을 받으면 부모 타입으로 공통화 사용 가능
        Champ[] champArr = new Champ[2];
        
        champArr[0] = new ash();
        champArr[1] = new 케이틀린();

        for (Champ cham : champArr){
            cham.skill.plusPoint();
            // 항상 같은 메소드를 사용하기 때문에
            // 메소드 이름 고민을 할 필요가 없어서 
            // 신뢰성이 높아진다.
            System.out.println(cham.skill.getDamage());
        }
    }
}
