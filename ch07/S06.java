package ch07;

// import
// 다른 패키지의 클래스 호출
import ch07.sub.Sub01;

public class S06 {
    public static int first = 1;
    public int second = 2;
    public static final int third = 3;

    public void printSecond(){
        System.out.println(second);
    }
    public static void main(String[] args) {
        // Sub01 코드는 아래쪽에
        Sub01 sub01 = new Sub01();
        System.out.println(sub01.getData());

        // S06 클래스의 public static int first = 1;
        // 같은 스태틱 객체이므로 가져올 수 있다
        System.out.println(first);
        System.out.println(S06.first);

        // S06 클래스의 public int second = 2;
        // main은 스태틱, second는 스태틱 변수가 아니므로 가져올 수 없다
        // System.out.println(second);
        // 실행할 수 없다
        // System.out.println(printSecond());

        // static이 아닌 필드는 인스턴스 생성 후 가져오기
        S06 s06 = new S06();
        System.out.println(s06.second);
        s06.printSecond();

        S06.first = 11;
        // final 값은 변경 불가능
        // S06.third = 33;

        // final String str = "홍길동";
        // 변경 불가능
        // str = "임꺽정";
    }
}
