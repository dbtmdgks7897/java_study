package ch11;

import java.util.ArrayList;
import java.util.List;

public class S02 {
    public static void main(String[] args) {

        // 리스트 선언
        List<String> list = new ArrayList<String>();
        System.out.println("list.size() : " + list.size());
        System.out.println();

        // 추가 메소드. 불린 반환, 리스트 반환이 아니니 내부적으로 실행됨
        list.add("바나나");
        System.out.println("list.size() : " + list.size());
        System.out.println("list : " + list);
        System.out.println();

        list.add("사과");
        list.add("바나나");
        // add한 순서대로 정렬이 되어있다
        System.out.println("list : " + list);
        System.out.println("list.get(1) : " + list.get(1));
        System.out.println();

        // 변경 메소드. 바뀌기 전 객체(?) 반환
        System.out.println("list.set(1, \"멜론\") : " + list.set(1, "멜론")); 
        System.out.println("list : " + list);
        System.out.println();

        // 삭제 메소드. 삭제한 객체 반환
        System.out.println("list.remove(0) : " + list.remove(0));
        System.out.println("list : " + list);

        // 콜렉션 모든 요소 추가
        System.out.println("list.addAll(1, list) : " + list.addAll(1, list));
        // 콜렉션 모든 요소 포함 여부
        System.out.println("list.containsAll(list) : " + list.containsAll(list));

        // list.forEach(null);
        // list.removeIf(null);
        // list.notifyAll();
        // list.wait();
        // list.stream();
        // list.spliterator();
        
    }
}
