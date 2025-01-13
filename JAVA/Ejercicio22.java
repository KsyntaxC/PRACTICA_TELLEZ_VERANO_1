import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        System.out.print("Intro x: ");
        int x = sc.nextInt();
        double S = 0;
        int e = 2;
        int d = 2;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println("(" + x + "^" + e + ") / " + d + "! + ");
                S = S - (Math.pow(x, e) / factorial(d));
            } else {
                System.out.println("(" + x + "^" + e + ") / " + d + "! - ");
                S = S + (Math.pow(x, e) / factorial(d));
            }
            e = e * 2;
            d = d + 2;
        }
        System.out.println(" = " + S);
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
