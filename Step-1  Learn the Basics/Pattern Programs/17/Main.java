/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P17.png
 */
public class Main {
    public static void main(String[] args) {
        int rows = 5, ch = 65, q = 0;
        for (int i = 0; i < rows; i++) {
            q = 0;
            for (int k = 0; k <= (rows - i); k++) {

                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {

                if (j <= i - 1) {

                    System.out.print((char) (ch + q++) + "");
                } else {
                    System.out.print((char) (ch + q--) + "");
                }
            }
            System.out.println();
        }
    }
}
