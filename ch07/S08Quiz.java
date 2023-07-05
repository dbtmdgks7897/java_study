// package ch07;

// // 인터페이스 / 추상 클래스 / 클래스 이용
// // 스마트폰
// // 갤럭시 / 아이폰
// // 갤럭시 - 통화 / 문자 / 빅스비
// // 아이폰 - 통화 / 문자 / 시리
// // 갤럭시 - S23
// // 아이폰 - IPhone 14

// interface Call {
//     void call();
// }

// interface Mail {
//     void mail();
// }

// interface Bixby {
//     void bixby();
// }

// interface Siri {
//     void siri();
// }

// abstract class Phone implements Call, Mail {

// }

// abstract class Galaxy extends Phone implements Bixby {

// }

// abstract class IPhone extends Phone implements Siri {

// }

// class S23 extends Galaxy {

//     @Override
//     public void call() {
//         System.out.println(this.getClass().getName() + " 전화 시작");
//     }

//     @Override
//     public void mail() {
//         System.out.println(this.getClass().getName() + " 문자 보내기");
//     }

//     @Override
//     public void bixby() {
//         System.out.println("하이 빅스비");
//     }

// }

// class IPhone14 extends IPhone {

//     @Override
//     public void call() {
//         System.out.println(this.getClass().getName() + " 전화 시작");
//     }

//     @Override
//     public void mail() {
//         System.out.println(this.getClass().getName() + " 문자 보내기");
//     }

//     @Override
//     public void siri() {
//         System.out.println("시리야");
//     }

// }

// public class S08Quiz {

// }
