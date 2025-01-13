import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Desde donde: ");
        int a = sc.nextInt();
        System.out.print("Hasta donde: ");
        int b = sc.nextInt();
        int f1 = -1, f2 = 1, fibo = f1 + f2;
        for (int i = 1; i <= b; i++) {
            if (fibo >= a && fibo <= b) {
                System.out.print(fibo + ", ");
            }
            f1 = f2;
            f2 = fibo;
            fibo = f1 + f2;
        }
    }
}
