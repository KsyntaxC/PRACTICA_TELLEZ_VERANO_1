import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        int a = 2;
        boolean sw = true;
        for (int i = 1; i <= N; i++) {
            if (i % 3 != 0) {
                if (sw) {
                    System.out.print(1 + ", ");
                    sw = false;
                } else {
                    System.out.print(a + ", ");
                    a += 2;
                    sw = true;
                }
            } else {
                System.out.print(-5 + ", ");
            }
        }
    }
}