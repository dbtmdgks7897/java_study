package ch05;

public class S06 {
    public static void main(String[] args) {
        // 이차원 배열
        // new int[][] 생략 가능
        int[][] intArray = new int[][] {
            {10, 20, 30},
            {40, 50, 60}
        };

        // int[][] intArray1 = new int[2][3];
        // intArray1[0] = new int[]{10, 20, 30};
        // intArray1[1] = new int[]{40, 50, 60};

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println(intArray[i][j]);
            }
        }
    }
}
