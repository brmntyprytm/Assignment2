public class MagicSquare {
    private final int[][] square;
    private final int size;

    public MagicSquare(int size) {
        this.size = size;
        square = new int[size][size];
        int num = 1;
        int row = size - 1;
        int col = size / 2;
        while (num <= size * size) {
            square[row][col] = num;
            num++;
            int nextRow = (row + 1) % size;
            int nextCol = (col + 1) % size;
            if (square[nextRow][nextCol] != 0) {
                nextRow = (row - 1 + size) % size;
                nextCol = col;
            }
            row = nextRow;
            col = nextCol;
        }
    }

    public int diagonalSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    public int columnSum(int col) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            sum += square[row][col];
        }
        return sum;
    }

    public int rowSum(int row) {
        int sum = 0;
        for (int col = 0; col < size; col++) {
            sum += square[row][col];
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                sb.append(String.format("%5d", square[row][col]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
