package ua.ithillel.java;

public class ArrayInt {
    public static void main(String[] args) {
        // ctrl + alt + L
        int[][] score = new int[3][4];
        score[0][0] = 10;
        score[0][1] = 11;
        score[0][2] = 12;
        score[0][3] = 13;
        score[1][0] = 20;
        score[1][1] = 21;
        score[1][2] = 22;
        score[1][3] = 23;
        score[2][0] = 30;
        score[2][1] = 31;
        score[2][2] = 32;
        score[2][3] = 33;
        System.out.println("[");
        for (int i = 0; i < score.length; i++) {
            System.out.print("   [");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print("," + score[i][j]);
            }
            System.out.println("]" + ",");
        }
        System.out.println("]");

        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i] += score[i][j];
            }
            System.out.println(result[i]);
        }
    }
}

