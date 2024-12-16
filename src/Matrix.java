/**
 * Клас, що представляє матрицю.
 */
class Matrix {
    private final short[][] elements;
    private final int rows;
    private final int cols;

    /**
     * Створює матрицю заданих розмірів.
     *
     * @param rows кількість рядків
     * @param cols кількість стовпців
     */
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.elements = new short[rows][cols];
    }

    /**
     * Встановлює значення елемента матриці.
     *
     * @param row рядок
     * @param col стовпець
     * @param value значення елемента
     */
    public void setElement(int row, int col, short value) {
        elements[row][col] = value;
    }

    /**
     * Повертає значення елемента матриці.
     *
     * @param row рядок
     * @param col стовпець
     * @return значення елемента
     */
    public short getElement(int row, int col) {
        return elements[row][col];
    }

    /**
     * Повертає кількість рядків у матриці.
     *
     * @return кількість рядків
     */
    public int getRows() {
        return rows;
    }

    /**
     * Повертає кількість стовпців у матриці.
     *
     * @return кількість стовпців
     */
    public int getCols() {
        return cols;
    }

    /**
     * Виводить матрицю в консоль.
     */
    public void print() {
        for (short[] row : elements) {
            for (short value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
