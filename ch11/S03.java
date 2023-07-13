package ch11;

import java.util.HashSet;
import java.util.Set;

public class S03 {
    public static void main(String[] args) {
        // 싸이버거 세트
        Set<String> set = new HashSet<String>();

        set.add("바나나");
        set.add("사과");
        set.add("바나나");
        set.add("멜론");
        set.add("망고");
        set.add("딸기");
        // 중복 불가 [사과, 바나나]
        System.out.println("set : " + set);

        // set은 순서가 없기 때문에 인덱스 값으로 값을 가져올 수 없다
        // set.get();

        // set는 리스트 안의 값 유무 파악할 때 사용
        System.out.println("set.contains(\"파인애플\") : " + set.contains("파인애플"));
    }
}
