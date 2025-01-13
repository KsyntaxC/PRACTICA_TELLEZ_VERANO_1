import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres números enteros separados por espacios: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 % 2 == 0 || n2 % 2 == 0 || n3 % 2 == 0) {
            System.out.println("Hay un número par");
        } else {
            System.out.println("No hay números pares");
        }
    }
}
