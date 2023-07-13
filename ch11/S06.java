package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class S06 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        // 값 넣기
        queue.add("사과");
        queue.add("바나나");
        queue.add("멜론");
        System.out.println(queue);
        // 값 빼기 (처음 들어온 것)
        // FIFO, 음식점, 은행 번호표
        // 롤 큐
        queue.poll();
        System.out.println(queue);
    }
}
