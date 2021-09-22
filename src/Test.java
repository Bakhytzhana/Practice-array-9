public class Test {
    public static void main(String[] args) {
        int[][] a = {{2, 6, 8, 9},
                {3, 7, 4, 6},
                {4, 8, 3, 4},
                {5, 9, 1, 2}};
        int temp;

        System.out.println("Заданная матрица:");
        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("Транспонированная матрица:");
        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}