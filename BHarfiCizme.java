package Diziler;

public class BHarfiCizme {
    public static void main(String[] args) {
        int         row = 7, column = 10;
        String[][]  arr = new String[row][column];

        System.out.print("\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if ((i == 0 || i == row/2 || i == row-1) && j % 3 == 0) {
                    if (j == column-1)
                        arr[i][j] = " ";
                    else
                        arr[i][j] = "*";
                }
                else {
                    if (j == 0 || j == column-1)
                        arr[i][j] = "*";
                    else
                        arr[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.print(arr[i][j]);
            System.out.print("\n");
        }
    }
}
