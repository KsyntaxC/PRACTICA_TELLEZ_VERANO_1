import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 5 números separados por espacios: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int M, m;
        if (a > b) {
            M = a;
            m = b;
        } else {
            M = b;
            m = a;
        }

        if (c > M) {
            M = c;
        } else if (c < m) {
            m = c;
        }

        if (d > M) {
            M = d;
        } else if (d < m) {
            m = d;
        }

        if (e > M) {
            M = e;
        } else if (e < m) {
            m = e;
        }
        System.out.println("El mayor es " + M);
        System.out.println("El menor es " + m);
    }
}
