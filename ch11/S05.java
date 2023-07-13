package ch11;

import java.util.Stack;

public interface S05 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // 값 입력 push
        stack.push("사과");
        stack.push("바나나");
        stack.push("멜론");

        System.out.println(stack);

        // 값 뺄 때는 pop (무조건 마지막)
        stack.pop();
        System.out.println(stack);
    }
}
