import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        System.out.print("Intro x: ");
        int x = sc.nextInt();
        double S = 0;
        int e = 1;
        int d = 4;
        for (int i = 1; i <= N; i++) {
            System.out.println("(" + x + "^" + e + ") / " + d + " + ");
            S = S + (Math.pow(x, e)) / d;
            e = e + 2;
            d = d + 4;
        }
        System.out.println(" = " + S);
    }
}
