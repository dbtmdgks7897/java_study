package test;

public class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        for (int i = 0 ; i < strlist.length ; i++){
            answer[i] = (int)strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] strlist = new String[4];
        System.out.println(new Solution().solution(strlist));
    }
}
