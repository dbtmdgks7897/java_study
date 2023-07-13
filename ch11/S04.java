package ch11;

import java.util.HashMap;
import java.util.Map;

public class S04 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        // 추가할 땐 put
        map.put("사과", "3개");
        map.put("바나나", "1개");
        map.put("멜론", "2개");
        System.out.println("map : " + map);

        // 값 찾을 떈 key 값으로 찾아오기
        System.out.println("map.get(\"사과\") : " + map.get("사과"));

        // 삭제도 key값
        map.remove("멜론");
        
        // 이름과 값 둘 다 중요할 때 사용
        System.out.println("map : " + map);

    }
}
