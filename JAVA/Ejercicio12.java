import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        int n = 2, c = 1;
        for (int i = 1; i <= N; i++) {
            System.out.print(n + ", ");
            if (c >= 2) {
                n = n + 2;
                c = 0;
            }
            c = c + 1;
        }
    }
}