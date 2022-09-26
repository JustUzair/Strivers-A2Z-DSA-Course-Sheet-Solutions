/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P19.png
 */
public class Main {
    public static void main(String[] args) {
        int totalRows = 20;
        int rows = totalRows / 2; // Actual Rows;
        for (int i = 0; i < 2 * rows; i++) {
            if (i < rows) {
                for (int k = 0; k < (rows - i); k++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2 * i; j++)
                    System.out.print(" ");
                for (int k = 0; k < (rows - i); k++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int k = 0; k <= (i - rows); k++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2 * (totalRows - i) - 2; j++)
                    System.out.print(" ");
                for (int k = 0; k <= (i - rows); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
