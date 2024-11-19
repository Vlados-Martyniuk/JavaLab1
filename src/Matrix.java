class Matrix {
    private final short[][] elements;
    private final int rows;
    private final int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.elements = new short[rows][cols];
    }

    public void setElement(int row, int col, short value) {
        elements[row][col] = value;
    }

    public short getElement(int row, int col) {
        return elements[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void print() {
        for (short[] row : elements) {
            for (short value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
