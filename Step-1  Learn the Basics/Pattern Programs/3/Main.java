/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P3.png
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("" + (j + 1));
            }
            System.out.println();
        }
    }
}
