package ch08;

// 예외 직접 만들기
// Exception 또는 RuntimeException을 상속하는 것이 일반적
class NotOneException extends Exception {
    public NotOneException(String message) {
        super(message);
    }
}

class ClacUtil {

    // 들어온 정수가 1이면 정살 / 아니면 에러
    // throws는 이 함수를 호출한 곳에 에러를 던지겠다
    static void checkOne(int num) throws NotOneException {
        if (num == 1) {
            System.out.println("정상입니다");
        } else {
            throw new NotOneException("에러 발생");
        }
    }
}

public class S05 {
    public static void main(String[] args) {
        int num = 142;

        try {
            ClacUtil.checkOne(num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("다음");
    }
}
