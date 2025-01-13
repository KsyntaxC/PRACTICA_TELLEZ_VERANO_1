import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las 4 notas de las prácticas separadas por espacios: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int m;
        if (a < b) {
            m = a;
        } else {
            m = b;
        }
        if (c < m) {
            m = c;
        }
        if (d < m) {
            m = d;
        }
        double P = (a + b + c + d - m) / 3.0;
        System.out.println("Nota eliminada: " + m + ", Promedio: " + P);
    }
}
