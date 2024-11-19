import java.util.Random;

class MatrixGenerator {
    public static Matrix generateMatrix(int rows, int cols) {
        Matrix matrix = new Matrix(rows, cols);
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                short value = (short) (random.nextInt(100) - 50);
                matrix.setElement(i, j, value);
            }
        }
        return matrix;
    }
}