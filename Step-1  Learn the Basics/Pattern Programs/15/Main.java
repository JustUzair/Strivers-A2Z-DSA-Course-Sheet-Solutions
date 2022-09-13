/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P15.png
 */
public class Main {

    public static void main(String[] args) {
        int rows = 5, ch = 65;
        for (int i = 0; i < rows; i++) {
            int k = 0;
            for (int j = rows - i; j > 0; j--) {
                System.out.print("" + (char) (ch + k++));
            }
            System.out.println();
        }
    }
}
