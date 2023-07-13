// package ch00;

// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.ToString;

// // 어노테이션 읽어서 롬복에서 생성자 자동 생성
// @AllArgsConstructor
// @NoArgsConstructor
// // getter와 setter 자동 생성
// @Getter
// @Setter
// // toString을 인스턴스 정보 정리 출력으로 오버라이딩
// @ToString
// class Cat {
//     private String name;
//     private boolean male;

//     // lombok 사용 시에도 덮어쓰기 가능
//     public String getName() {
//         return this.name + " 입니다";
//     }
// }

// public class Study07 {
//     public static void main(String[] args) {
//         // 고양이 생성
//         Cat cat = new Cat("야옹이", true);

//         // 고양이 이름
//         // 어노테이션으로 getter, setter 자동 생성
//         System.out.println(cat.getName());

//         // 수컷?
//         System.out.println(cat.isMale());

//         // 이름 변경
//         cat.setName("냐옹이");

//         // cat.toString()과 같음
//         System.out.println(cat);
//     }

// }
