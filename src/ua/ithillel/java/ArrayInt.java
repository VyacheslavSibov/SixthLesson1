package ua.ithillel.java;

public class ArrayInt {
    public static void main(String[] args) {
        // ctrl + alt + L
        int xSize = 3;
        int ySize = 4;

        int[][] score = new int[xSize][ySize];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = 10 * (i + 1) + j;

            }

        }
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

