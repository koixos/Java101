package Projeler.MayinTarlasiOyunu;

import java.util.Scanner;
import java.lang.Math;

public class MineSweeper {
    Scanner inp = new Scanner(System.in);
    int     row;
    int     column;
    int     mineCount;
    int[][] gameField;
    int[][] minePosition;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.mineCount = (this.row*this.column)/4;
        this.gameField = new int[this.row][this.column];
        this.minePosition = new int[this.row][this.column];
    } /* END OF MineSweeper */

    /* Function to create an empty game field.
    *  First all values will be assigned as -1 meaning the situation of that point is unknown. */
    void createGameField() {
        for (int i = 0; i < this.row; i++)
            for (int j = 0; j < this.column; j++)
                this.gameField[i][j] = -1;
    } /* END OF createGameField */

    /* Function to plate mines randomly on the game field.
    *  First all points of the game field will be filled with 0 meaning there is not any mine yet.
    *  After that mines will be planted all over the field.
    *  If there is already a mine on a point, value of i will not be increased. */
    void mineScatter() {
        for (int i = 0; i < this.row; i++)
            for (int j = 0; j < this.column; j++)
                this.minePosition[i][j] = 0;

        for (int i = 0; i < this.mineCount; i++) {
            int resultRow = (int)(Math.random() * this.row);
            int resultColumn = (int)(Math.random() * this.column);

            if (this.minePosition[resultRow][resultColumn] == 0)
                this.minePosition[resultRow][resultColumn] = 1;
            else --i;
        }
    } /* END OF mineScatter */

    /* Function to count mines surrounding a given point    */
    int mineCounter(int row, int column) {
        int mineCounter = 0;

        for (int i = row-1; i <= row+1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if (checkBoundaries(i, j))
                    if (this.minePosition[i][j] == 1)
                        ++mineCounter;
            }
        }
        return mineCounter;
    } /* END OF mineCounter */

    /* Function to see the positions of mines   */
    void printMines() {
        System.out.print("===============================================================\nMayınların Konumu: \n===============================================================\n");
        for (int i = 0; i < this.row; i++) {
            System.out.print("\t\t");
            for (int j = 0; j < this.column; j++) {
                if (this.minePosition[i][j] == 1)
                    System.out.print("X\t");
                else if (this.gameField[i][j] == -1)
                    System.out.print("-\t");
                else System.out.print(this.gameField[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("===============================================================\n");
    } /* END OF printMines */

    int printField() {
        int possibleMoveCounter = 0;    // this will hold number of possible moves

        for (int i = 0; i < this.row; i++) {
            System.out.print("\t\t");
            for (int j = 0; j < this.column; j++) {
                if (this.gameField[i][j] == -1) {
                    System.out.print("-\t");
                    ++possibleMoveCounter;
                }
                else System.out.print(this.gameField[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        return possibleMoveCounter;
    } /* END OF printField */

    /* Function to check if a given point inside the game field  */
    boolean checkBoundaries(int row, int column) {
        return row >= 0 && row < this.row && column >= 0 && column < this.column;
    } /* END OF checkBoundaries */

    void playGame() {
        boolean flag = false;
        int     row = -1, column = -1;

        do {
            // this will hold the number of possible moves, and will be used as a "did win?" check-flag
            int counter = this.printField();
            // if only mines remained, player wins
            if (counter == this.mineCount) {
                System.out.print("Tebrikler! Oyunu kazandınız!\n");
                break;
            }

            try {
                System.out.print("Satır: ");    row = inp.nextInt();
                System.out.print("Sütun: ");    column = inp.nextInt();

                if (!checkBoundaries(row, column))
                    System.out.print("\nLütfen geçerli sınırlar girin.\n");
                else flag = true;
            }
            catch (Exception e) {
                inp.nextLine();
                System.out.print("\nLütfen geçerli sınırlar girin.\n");
            }
            finally {
                System.out.print("---------------------------------------------------------------\n");
            }

            if (flag) {
                int counter_Mines = this.mineCounter(row, column);
                this.gameField[row][column] = counter_Mines;

                if (this.minePosition[row][column] == 1) {
                    System.out.print("Ups! Mayına Bastınız :(\n");
                    break;
                }
                flag = false;
            }
        } while (true);
    } /* END OF playGame */

    public void run() {
        this.createGameField();
        this.mineScatter();
        this.playGame();
        this.printMines();
    } /* END OF run */
}