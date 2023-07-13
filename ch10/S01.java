package ch10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class S01 {
    public static void main(String[] args) {
        // 현재 시간을 가져온다
        // 실행한 컴퓨터의 시간대(Local)을 가져옴
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // plus minus / 예약 등의 기능 만들 때 사용
        LocalDateTime plusDays = now.plusDays(2);
        System.out.println(plusDays);
        
        // parse
        // 다른 타입의 데이터나 미가공 데이터를 사용 가능하게 바꾸는 작업
        // 문자열 데이터를 date 타입으로 파싱
        LocalDateTime parse = LocalDateTime.parse("2020-07-06T14:20:02.886353900");
        System.out.println(parse);

        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        LocalDateTime parse2 = LocalDateTime.parse("2000년 11월 24일 00시 00분 01초", ofPattern);
        System.out.println(parse2);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
    }
}
