package array;

import arrayofarrays.Triangular;

public class TrangularMain {
    public static void main(String[] args) {
        Triangular tri = new Triangular();

        int[][] matrix =  tri.triangularMatrix(5);

        for( int i=0; i < matrix.length; i++) {
            for( int j=0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
