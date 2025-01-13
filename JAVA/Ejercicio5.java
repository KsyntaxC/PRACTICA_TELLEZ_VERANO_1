import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int n = sc.nextInt();
        if (n % 3 == 0 || n % 5 == 0) {
            if (n % 3 == 0) {
                System.out.println("Es múltiplo de 3");
            }
            if (n % 5 == 0) {
                System.out.println("Es múltiplo de 5");
            }
        } else {
            System.out.println("No es múltiplo de 3 ni de 5");
        }
    }
}
