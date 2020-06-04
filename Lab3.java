public class Lab3 {
    public static void main(String[] args){
        int n = 2;
        int m = 3;
        int[][] matrixA = new int[n][m];
        matrixA[0][0] = 1;
        matrixA[0][1] = -2;
        matrixA[0][2] = 3;
        matrixA[1][0] = 4;
        matrixA[1][1] = -1;
        matrixA[1][2] = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrixA[i][j] < 0)
                    System.out.println("Номер строки: " + i + ", Номер столбика: " + j);
            }
        }
    }
}
