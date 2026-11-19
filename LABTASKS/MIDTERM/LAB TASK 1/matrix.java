import java.util.Scanner;
 
// 1. class Matrix created :>
public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
// 2. declare and create :>
          do {
  int[][] matrix = new int[3][3];
int[] rowSum = new int[3];
int[] colSum = new int[3];
int dsum1 = 0;
int dsum2 = 0;
int count = 0;
System.out.println("Enter 9 elements:");
// 3. create loop to iterate and input values inside :>
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix.length; c++) {
                    matrix[r][c] = input.nextInt();
                    count++;    }   }
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix.length; c++) {
                    rowSum[r] += matrix[r][c];
                    colSum[c] += matrix[r][c];  }   }
            for (int r = 0; r < matrix.length; r++) {
                dsum1 += matrix[r][r];
                dsum2 += matrix[r][matrix.length - 1 - r ]; }
            System.out.printf("%39s%n", "Row Sum");
            for (int r = 0; r < matrix.length; r++) {
                System.out.printf("%11s", " ");
                for (int c = 0; c < matrix.length; c++) {
                    System.out.printf("%4d", matrix[r][c]); }
                System.out.printf("%10d%n", rowSum[r]); }
           System.out.println();
            System.out.print("Col sum:   ");
            for (int c = 0; c < matrix.length; c++) {
                System.out.printf("%4d", colSum[c]);    }
            System.out.println("");
            System.out.println("Diag Sum 1:   "+ dsum1);
            System.out.println("Diag Sum 2:   "+ dsum2);
            System.out.println("\nTotal number entered: " + "[" + count + "]"  );
            System.out.println();
            System.out.print("\nTry Again [y/n]: ");
          choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}