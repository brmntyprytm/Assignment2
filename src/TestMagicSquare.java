public class TestMagicSquare {

    public static void main(String[] args) {

        int n = 0;

        if (args.length == 1) {
            n = Integer.parseInt(args[0]);
        } else {
            System.out.println("Usage: java -jar <jarFile> <size of square>");
            System.exit(1);
        }

        MagicSquare ms = new MagicSquare(n);

        System.out.println("Magic Square of size " + n + "x" + n + ":\n\n" + ms +
                "\nMain diagonal sum: " + ms.diagonalSum() +
                "\nColumn sum: " + ms.columnSum(0) +
                "\nRow sum: " + ms.rowSum(n - 1) + "\n");
    }
}