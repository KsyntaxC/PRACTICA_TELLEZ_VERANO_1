import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la distancia en kilometros: ");
        int d=sc.nextInt();
        System.out.print("Introduce la velocidad en kilometros por hora: ");
        int v=sc.nextInt();
        int t=d/v;
        System.out.println("El tiempo total es de: "+t+" horas");
    }
}