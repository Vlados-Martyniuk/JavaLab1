
public class Main {
    public static void main(String[] args) {
        int studentId = 2214;


        int C5 = studentId % 5;
        int C7 = studentId % 7;
        int C11 = studentId % 11;

        System.out.println("Заліковка = " + studentId + ", C5 = " + C5 + ", C7 = " + C7 + ", C11 = " + C11);


        Matrix A = MatrixGenerator.generateMatrix(3, 3);
        Matrix B = MatrixGenerator.generateMatrix(3, 3);

        System.out.println("Матриця A:");
        A.print();
        System.out.println("Матриця B:");
        B.print();


        Matrix C;
        try {
            C = MatrixOperations.multiplyMatrices(A, B);
            System.out.println("Матриця C:");
            C.print();
        } catch (Exception e) {
            System.err.println("Поомилка: " + e.getMessage());
            return;
        }


        double result;
        try {
            result = MatrixOperations.sumMaxInRows(C);
            System.out.println("Сума найбільших елементів кожного рядка матриці\n: " + result);
        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
