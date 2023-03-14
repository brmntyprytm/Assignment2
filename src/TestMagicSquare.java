// NAME : Bramantyo Priyo Utomo
// NPM : 2206821563
// TA : SA
// CLASS : KKI
// GITHUB REPO : https://github.com/brmntyprytm/Assignment2.git
// COLLABORATORS : Daffa Farras Putra Tarigan, Muhammad Fahmi Habibie
//
// START OF THE PROGRAM!!!

public class TestMagicSquare {
    /**
     The main method takes a single command line argument, the size of the square, and creates
     a MagicSquare object of that size. It then prints out the square, as well as the sum of
     the main diagonal, a specific column, and a specific row.
     @param args the command line arguments, where the first argument is the size of the square.
     */
    public static void main(String[] args) {
        // Check if the correct number of command line arguments have been provided
        int n = 0;
        if (args.length == 1) {
            n = Integer.parseInt(args[0]);
        } else {
            System.out.println("Usage: java -jar <jarFile> <size of square>");
            System.exit(1);
        }
        // Create a new MagicSquare object of size n
        MagicSquare ms = new MagicSquare(n);
        // Print out the Magic Square, the sum of the main diagonal, a specific column, and a specific row
        System.out.println("\nMagic Square of size " + n + "x" + n + ":\n\n" + ms +
                "\nMain diagonal sum: " + ms.diagonalSum() +
                "\nColumn sum: " + ms.columnSum(0) +
                "\nRow sum: " + ms.rowSum(n - 1) + "\n");
    }
}