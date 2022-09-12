/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P5.png
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
