// package ch06;

// class Cat{
//     // 클래스 변수 - 클래스 전체를 아우르는 데이터(클래스의 바깥에 존재) 모든 클래스가 하나의 저장공간 차지, (클래스이름.클래스변수)
//     // static - 정적.
//     static int countCat = 0;

//     // 인스턴스 변수 - 인스턴스 생성 시 생성, 참조변수가 없을 때 가비지 컬렉터에 의해 자동 제거 (참조변수.인스턴스 변수명)
//     String name;

//     public Cat() {
//         this.name = "길고양이";
//         Cat.addCat();
//     }

//     public static void addCat(){
//         Cat.countCat++;
//         System.out.println("새로운 고양이가 태어났습니다.");
//     }
    
// }

// public class S04 {
//     public static void main(String[] args) {

//         new Cat();
//         new Cat();
//         new Cat();
//         new Cat();
//         new Cat();

//         System.out.println("고양이의 수는 " + Cat.countCat);

//     }
// }
