import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese grados Fahrenheit: ");
        int f = sc.nextInt();
        double c = (f - 32) / 1.8;
        System.out.println(f + " grados Fahrenheit equivalen a " + c + " grados Celsius.");
    }
}
