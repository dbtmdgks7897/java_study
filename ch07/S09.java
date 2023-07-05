// package ch07;

// // 내부 클래스 중 인스턴스 클래스는
// // 메모리 누수 등 문제 발생 가능성, 특별한 때 아니면 안씀

// // 삼성공장
// // 갤럭시 생산

// // 외부 클래스
// // 공장 설계도
// class 삼성공장{

//     // 내부 클래스
//     // static 없는 인스턴스 클래스
//     // 스마트폰 설계도
//     class 갤럭시 {

//     }
//     class 르노삼성 {

//     }
// }

// public class S09 {
//     public static void main(String[] args) {
        
//         // 공장 설계도에서 폰을 만들어 내는 것
//         // 만들어지지 않음
//         // new 삼성공장.갤럭시();

//         // 공장을 상상
//         삼성공장 factory;

//         // 공장을 지음
//         factory = new 삼성공장();
    
//         // 공장에서 갤럭시 생산
//         삼성공장.갤럭시 phone = factory.new 갤럭시();
//         삼성공장.르노삼성 car = factory.new 르노삼성();

//         factory = null;

//         삼성공장 factory1 = new 삼성공장();

//         factory1.new 갤럭시();
//     }
// }
