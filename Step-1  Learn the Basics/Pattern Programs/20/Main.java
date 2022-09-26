/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P20.png
 */
public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int totalRows = rows * 2;
        for (int i = 0; i < totalRows - 1; i++) {
            if (i < rows) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2 * (rows - i - 1); j++) { // print inverted pyramid of spaces
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 0; k < totalRows - i - 1; k++)
                    System.out.print("*");
                for (int j = 0; j < 2 * (i - rows) + 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < totalRows - i - 1; k++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
