import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        int a = -1, b = 1, c = 0, d = 0, e = 0, s;
        for (int i = 1; i <= N; i++) {
            s = a + b + c + d + e;
            System.out.print(s + ", ");
            a = b;
            b = c;
            c = d;
            d = e;
            e = s;
        }
    }
}