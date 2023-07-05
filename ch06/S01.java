

// // 고양이를 추상화
// class Cat {
//     // 필드 (객체의 속성)
//     String name;
//     int age;

//     // 해답 3
//     // String name = "길냥이";
//     // int age = 1;

//     // 생성자 (객체 생성 시 사용)
//     // 이름은 클래스명과 동일하게
//     // 생성자가 있어야 클래스를 인스턴스화 가능
//     // 리턴 타입 X (무조건 void)
//     // ---------------------------------
//     // 클래스에 아무 생성자가 없을 경우
//     // 매개변수가 없는 생성자가 기본적으로 세팅
//     // public Cat() {
//     //     System.out.println("내가 태어났다");
//     // }

//     // 다른 생성자를 만들 시 기본적으로 세팅된 생성자(매개변수 X)는 없어짐
//     public Cat(String name, int age){
//         // this는 클래스가 아니라 생성될 인스턴스를 가리킴
//         this.name = name;
//         this.age = age;

//         System.out.println(this.name + "가 태어났다");
//     }

//     // 길 고양이
//     // 일부 데이터만 받을 수 있다
//     // 받은 데이터 이외의 데이터는 직접 초기화
//     // public Cat(int age){
//     //     this.name = "길냥이";
//     //     this.age = age;
//     //     System.out.println(this.name + "가 태어났다");
//     // }

//     public Cat(int age){
//         // this를 이용해 생성자에서 다른 생성자 호출 가능
//         // 보통은 매개변수가 가장 많은 생성자를 호출
//         this("길냥이", age);
//     }

//     // 해답 1
//     // public Cat(){
//     //     this.name = "길냥이";
//     //     this.age = 1;
//     // }

//     // 해답 2 (best)
//     public Cat(){
//         this("길냥이", 1);
//     }

//     // 해답 3
//     // public Cat(){
//     //     // 필드에 값 입력
//     // }

//     // 해답 4
//     // public Cat(){
//     //     this(1);
//     // }

//     // 메소드 (객체의 기능)
//     public void cry() {
//         System.out.println("야옹");
//     }
// }

// public class S01 {
//     public static void main(String[] args) {
//         // 인스턴스
//         // new Cat();

//         // 오브젝트
//         // 상상할 수 있지만 실체화 되지 않은 것
//         // Cat cat;
//         // 초기화 오류
//         // cat.cry(); 

//         // 오브젝트를 생성 후, 인스턴스를 넣어줌.
//         // 생성자가 요구하는 매개변수대로 작성
//         Cat cat = new Cat("야옹이", 2);
//         // Cat cat2 = new Cat(1);
//         cat.cry();

//         new Cat(1).cry();
        
//         // 문제
//         new Cat(); // 이름이 '길냥이'이고 나이가 1살인 고양이 생성   
//     }
// }
