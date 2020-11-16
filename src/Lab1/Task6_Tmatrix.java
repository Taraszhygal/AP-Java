package Lab1;

public class Task6_Tmatrix {
    public static void main(String[] args) {
        //ініціалізація матриці
        final int [][] matrix = {{2,5,7},{3,5,4},{1,8,9},{4,6,9},{2,3,5}};
        System.out.println("Matrix before transposition:");
        //вивід матриці до транспонування
        printMatrix(matrix);
        System.out.println("Matrix after transposition:");
        //виклик методу для транспонування матриці та вивід результуючої матриці
        printMatrix(transpose(matrix));
    }
    //метод для транспонування
    public static int[][] transpose( int [][] mtx){
        //ініціалізація матриці в яку поміститься результат транспонування
        int[][] finMtx= new int[mtx[0].length][mtx.length];
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
              //заміна елементів стовпця на елеменит рядка
                finMtx[j][i]=mtx[i][j];
            }
        }
    return finMtx;
    }
    //метод для форматованого виводу матриць
    public static void printMatrix(int [][] mtx){
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }

    }
}
