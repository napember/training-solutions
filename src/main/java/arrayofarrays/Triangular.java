package arrayofarrays;

public class Triangular {
    public int[][] triangularMatrix(int size) {
        int[][] nums = new int[size][];
        for (int i = 0; i < size; i++) {
            nums[i] = new int[i+1];
            for (int j=0; j < i+1; j++) {
                nums[i][j] = i;
            }
        }
        return nums;
    }
}
