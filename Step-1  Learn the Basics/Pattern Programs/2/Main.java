/*
 * Pattern : https://takeuforward.org/wp-content/uploads/2022/08/P2.png
 * 
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
