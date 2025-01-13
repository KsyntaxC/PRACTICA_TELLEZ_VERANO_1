import java.util.Scanner;
public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce n:");
		int n=leer.nextInt();
		System.out.println("Introduce un k <= n");
		int k=leer.nextInt();
		int nd=(int)Math.log10(n)+1;
		System.out.print(nd+" ,");
		System.out.println(((int)(n/Math.pow(10, nd-k)))%10);
	}
}