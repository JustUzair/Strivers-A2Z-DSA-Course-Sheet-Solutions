/*
 * Pattern: https://takeuforward.org/wp-content/uploads/2022/08/P10.png
 */
public class Main {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();

        }
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--)
                System.out.print("*");
            System.out.println();

        }

    }
}
