package ch02;

import java.text.MessageFormat;

public class S02 {
    public static void main(String[] args) {
        //String str = "저는 유승한이고, 24세 입니다.";
        String name = "지드래곤";
        int age = 34;

        // 문자열 사이에 변수를 넣을 때 '+' 사용
        String str1 = "저는 " + name + "이고 " + age + "세 입니다";
        System.out.println(str1);
        
        // 형식화된 출력 / 문자열 포맷팅 / 문자열 보간법
        System.out.printf("저는 %s이고 %d세 입니다.\n", "고양이", 2);
        System.out.printf("\"저는 %s이고 %d세 입니다.\"\n", name, age);

        //소수점 단위 제한 가능
        System.out.printf("%.2f\n", 10.0 / 3);
        // 잘린 소수점은 자동 반올림
        System.out.printf("%.2f\n", 3.6666666666);

        // 문자열 포맷팅
        String str2 = String.format("저는 %s\n", "홍길동");
        System.out.println(str2);
        
        String str3 = MessageFormat.format("저는 {0} {1} {0}\n", "다나카", 30);
        System.out.println(str3);
    }
}
