import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro n: ");
        int n = sc.nextInt();
        double S = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("(" + 2 + " * (" + i + " ^ 2)) / " + 5 + " + ");
            S = S + (2.0 * (i * i)) / 5;
        }
        System.out.println(" = " + S);
    }
}
