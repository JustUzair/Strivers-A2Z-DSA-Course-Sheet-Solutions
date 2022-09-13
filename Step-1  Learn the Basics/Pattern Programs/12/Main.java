/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P12.png
 */
public class Main {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("" + (k + 1));
            }
            for (int j = 0; j < 2 * (rows - i - 1); j++) { // print inverted pyramid of spaces
                System.out.print(" ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print("" + (k + 1));
            }
            System.out.println();
        }
    }
}
