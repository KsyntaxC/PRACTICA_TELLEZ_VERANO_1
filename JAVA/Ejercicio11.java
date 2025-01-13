import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        int a = 1, b = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(b + ", ");
                b = b + 1;
            } else {
                System.out.print(a + ", ");
                a = a + 1;
            }
        }
    }
}