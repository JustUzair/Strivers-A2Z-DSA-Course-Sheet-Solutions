/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P18.png
 */


public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int ascii = 65 + rows - 1;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char) (ascii - j) + " ");
            }
            System.out.println();
        }
    }
}
