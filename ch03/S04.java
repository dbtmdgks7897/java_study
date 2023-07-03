package ch03;

public class S04 {
    public static void main(String[] args) {
        boolean check = 100 >= 100;
        System.out.println(check);

        // 계산 6번
        boolean check4 = true && true && true && true && true && true;
        // 계산 1번
        // and 조건에서는 false가 나올 수 있는 조건을 앞에다가 거는 것이 효율이 좋다.
        boolean check5 = false && true && true && true && true && true;

        // 계산 4번
        boolean check6 = false || false || false || true;
        // 계산 1번
        boolean check7 = true || false || false || false;
    }
}
