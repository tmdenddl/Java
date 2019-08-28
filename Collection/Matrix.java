package Collection;

public class Matrix {
    public static void main(String[] args) {
        // Initialize multiArray = Collection.Matrix
        int[][] multiArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };


        // Alternative way
        int[][] matrix = new int[3][4];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = (i * 4 + 1) + j;
            }
        }
    }
}
