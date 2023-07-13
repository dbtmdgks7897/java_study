package ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class S01 {
    public static void main(String[] args) {
        // List - 순서가 있고 데이터 중복이 가능
        List list = new ArrayList<>();

        // Set - 순서가 없고 데이터 중복 불가능
        // key만으로 이루어져 있다
        Set set = new HashSet<>();

        // Map - 순서가 없고 key, value로 이루어져 있다
        // key는 중복 불가능, value는 중복 가능
        Map map = new HashMap<>();

        // Stack - 나중에 들어온 값이 먼저 나감
        Stack stack = new Stack<>();

        // Queue - 먼저 들어온 값이 먼저 나감
        Queue queue = new LinkedList<>();
    }
}
