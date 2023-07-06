package ch00;

// class Person {
//     // 인스턴스의 사적인 속성은 private로
//     private String name;
//     private boolean male;

//     public Person(String name, boolean male) {
//         this.name = name;
//         this.male = male;
//     }

//     // 인스턴스의 사적인 속성 외부에서 요청 시
//     // 가공해서 전달 가능
//     // boolean을 제외한 나무지 나머지 타입은 get~
//     public String getName(){
//         return this.name.substring(0, 1) + "씨 입니다";
//     }

//     public void setName(String name){
//         this.name = name;
//     }

//     // boolean은 get 대신 is 사용할 수도 있다
//     public boolean isMale() {
//         return this.male;
//     }

//     public void setMale(boolean male) {
//         this.male = male;
//     }

//     // @Override와 같은 것들을 '어노테이션'
//     // 주석 -> 사람이 보라고 만든 설명
//     // 어노테이션 -> 컴파일러, JVM 등이 읽을 수 있는 설명
//     // @Override처럼 적어도 되고 안 적어도 되고
//     // 상황에 따라 필수로 적어야하는 어노테이션 존재
//     // 프로그램은 어노테이션 참고하여 특수 기능 수행 가능
//     // 예를 들어 @Override는 부모의 메소드를 사용하지 않고 새로운 로직 사용하겠다는 뜻
//     @Override
//     public String toString() {
//         return "저는 " + this.name + "이고 " + (this.male ? "남자" : "여자") + "입니다";
//     }

    
// }

// public class Study06 {
//     public static void main(String[] args) {
//         // 사람 태어남
//         Person person = new Person("홍길동", true);

//         // 겉으로 봐서는 사람의 이름을 알 수 없다 (private)
//         // System.out.println(person.name);

//         // 이름을 물어봄
//         System.out.println(person.getName());

//         // 남자야?
//         System.out.println(person.isMale());

//         // 객체 설명
//         // 인스턴스를 print하면 toString 메소드 실행 후 반환
//         System.out.println(person);
//         System.out.println(person.toString());

//         Person person2 = new Person("김자옥", false);
//         System.out.println(person2);

//         Person nick = person2;
//         System.out.println(nick);

//         // 남자로 성전환 해
//         person2.setMale(true);
//         System.out.println(nick);

//         // 임꺽정으로 이름 변경
//         person2.setName("임꺽정");
//         System.out.println(person2);

//     }
// }
