import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Introduce un número entero positivo: ");
            n = sc.nextInt();
        }
        while (n != 1) {
            System.out.print(n + ", ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.println(n);
    }
}
