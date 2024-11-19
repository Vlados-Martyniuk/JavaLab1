class MatrixOperations {
    public static Matrix multiplyMatrices(Matrix A, Matrix B) throws Exception {
        if (A.getCols() != B.getRows()) {
            throw new Exception("Розміри матриці не сумісні для множення.");
        }

        int rows = A.getRows();
        int cols = B.getCols();
        int common = A.getCols();
        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                short sum = 0;
                for (int k = 0; k < common; k++) {
                    sum += A.getElement(i, k) * B.getElement(k, j);
                }
                result.setElement(i, j, sum);
            }
        }

        return result;
    }

    public static double sumMaxInRows(Matrix C) {
        double sum = 0;
        for (int i = 0; i < C.getRows(); i++) {
            short max = C.getElement(i, 0);
            for (int j = 1; j < C.getCols(); j++) {
                if (C.getElement(i, j) > max) {
                    max = C.getElement(i, j);
                }
            }
            sum += max;
        }
        return sum;
    }
}
