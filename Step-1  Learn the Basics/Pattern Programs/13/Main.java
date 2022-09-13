/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P13.png
 */
public class Main {
    public static void main(String[] args) {
        int rows = 5, k = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((k++) + " ");
            }
            System.out.println();
        }
    }
}
