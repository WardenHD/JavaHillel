public class Main {
    static final int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    static int[][] transposedMatrix = new int[3][3];

    public static void main(String[] args) {
        System.out.println("\nInitial Matrix");
        printMatrix(matrix, null);
        System.out.println("\nTransposed Matrix");
        printMatrix(matrix, transposedMatrix);
        System.out.print("\n");
    }

    public static void printMatrix(int[][] matrix, int[][] transposed) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    if(transposed != null) transposed[i][j] = matrix[j][i];
                    System.out.print(((transposed != null) ? matrix[j][i] : matrix[i][j]) + " ");
                }
            System.out.print("\n");
        }
    }
}