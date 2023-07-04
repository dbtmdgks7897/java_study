// package ch06;

// class Cat {
//     String name;
//     int hp;
//     int position;

//     public Cat(String name, int hp, int position) {
//         this.name = name;
//         this.hp = hp;
//         this.position = position;
//     }

//     public Cat(String name) {
//         this(name, 100, 0);
//     }

//     public void moveRight() {
//         this.position++;
//         System.out.println(this.name + "가 오른쪽으로 이동했습니다");
//         reduceHp();
//     }

//     public void moveLeft() {
//         if (this.position < 1) {
//             System.out.println(this.name + "는 왼쪽으로 갈 수 없습니다.");
//             // 메서드(함수)에서 return을 만나면 종료 (뒤 코드 실행 X)
//             return;
//         }
//         this.position++;
//         System.out.println(this.name + "가 왼쪽으로 이동했습니다");
//         reduceHp();
//     }

//     public void reduceHp() {
//         this.hp--;
//         System.out.println(this.name + "의 체력이 내려갔습니다");
//     }

//     public void yam(int food){
//         if(this.hp + food >= 100){
//             System.out.println("체력이 가득 찼습니다");
//             this.hp = 100;
//             return;
//         }
//         this.hp = this.hp + food;
//         System.out.println(this.name + "가 밥을 먹었습니다" );
//     }

//     public String dong(){
//         return "이쁜 ㄸ";
//     }
// }

// public class S03 {
//     public static void main(String[] args) {
//         Cat cat = new Cat("야옹이");

//         cat.moveLeft();

//         cat.moveRight();

//         cat.yam(5);
        
//         System.out.println(cat.hp);

//         System.out.println(cat.dong());
//     }
// }
