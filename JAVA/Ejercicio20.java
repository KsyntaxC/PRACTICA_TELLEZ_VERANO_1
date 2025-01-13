import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        System.out.print("Intro x: ");
        int x = sc.nextInt();
        double S = 0;
        int e = 0;
        int d = 2;
        int c = 0;
        int c2 = 1;
        for (int i = 1; i <= N; i++) {
            System.out.println("(" + x + "^" + e + ") / " + d + " + ");
            S = S + (Math.pow(x, e)) / d;
            c = c + 1;
            if (c >= c2) {
                e = e + 1;
                c2 = c2 + 1;
                c = 0;
            }
            d = d + 2;
        }
        System.out.println(" = " + S);
    }
}
