/**
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P8.png
 */
public class Main {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * (rows - i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
