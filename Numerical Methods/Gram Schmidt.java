public class GramSchmidt {

    public static void gramSchmidt(double[][] A) {
        int m = A.length;
        int n = A[0].length;
        double[][] Q = new double[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Q[j][i] = A[j][i];
            }
            for (int k = 0; k < i; k++) {
                double dot = 0;
                for (int j = 0; j < m; j++) {
                    dot += Q[j][k] * A[j][i];
                }
                for (int j = 0; j < m; j++) {
                    Q[j][i] -= dot * Q[j][k];
                }
            }
            double norm = Math.sqrt(dotProduct(Q, i));
            for (int j = 0; j < m; j++) {
                Q[j][i] /= norm;
            }
        }

        // Print Q matrix
        System.out.println("Q Matrix:");
        for (double[] row : Q) {
            for (double val : row) {
                System.out.printf("%8.4f", val);
            }
            System.out.println();
        }
    }

    private static double dotProduct(double[][] Q, int col) {
        double sum = 0;
        for (double[] row : Q) {
            sum += row[col] * row[col];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[][] A = {{1, 2}, {3, 4}};
        gramSchmidt(A);
    }
}
