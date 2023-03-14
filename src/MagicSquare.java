// NAME : Bramantyo Priyo Utomo
// NPM : 2206821563
// TA : SA
// CLASS : KKI
// GITHUB REPO : https://github.com/brmntyprytm/Assignment2.git
// COLLABORATORS : Daffa Farras Putra Tarigan, Muhammad Fahmi Habibie
//
// START OF THE PROGRAM!!!

public class MagicSquare {
    // the 2D array to hold the numbers in the square
    private final int[][] square;
    // the size of the square (i.e. the number of rows and columns)
    private final int size;

    // constructor to create the magic square
    public MagicSquare(int size) {
        this.size = size;
        // create a new 2D array with 'size' rows and 'size' columns
        square = new int[size][size];

        // start with the number 1 in the middle column of the bottom row
        int num = 1;
        int row = size - 1;
        int col = size / 2;

        // loop until all cells in the square have been filled
        while (num <= size * size) {
            // put the current number in the current cell
            square[row][col] = num;
            num++;

            // move to the next cell
            int nextRow = (row + 1) % size;
            int nextCol = (col + 1) % size;

            // if the next cell is already filled, move up one row instead
            if (square[nextRow][nextCol] != 0) {
                nextRow = (row - 1 + size) % size;
                nextCol = col;
            }

            // update the row and column variables for the next iteration
            row = nextRow;
            col = nextCol;
        }
    }

    // method to calculate the sum of the diagonal from top-left to bottom-right
    public int diagonalSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    // method to calculate the sum of a specified column
    public int columnSum(int col) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            sum += square[row][col];
        }
        return sum;
    }

    // method to calculate the sum of a specified row
    public int rowSum(int row) {
        int sum = 0;
        for (int col = 0; col < size; col++) {
            sum += square[row][col];
        }
        return sum;
    }

    // method to create a string representation of the square
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // use formatting to ensure each number takes up 5 spaces
                sb.append(String.format("%5d", square[row][col]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
