import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        int n = 0, c = 1, c2 = 1;
        for (int i = 1; i <= N; i++) {
            if (c2 % 2 == 0) {
                System.out.print(0 + ", ");
            } else {
                System.out.print(1 + ", ");
            }
            if (c >= c2) {
                c = 0;
                c2 = c2 + 1;
            }
            c = c + 1;
        }
    }
}