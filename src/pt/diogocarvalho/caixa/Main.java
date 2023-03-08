package pt.diogocarvalho.caixa;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //throws Exception
		Scanner in = new Scanner(System.in);
		
		System.out.println("Width: ");
		int width = in.nextInt();
		
		System.out.println("Height: ");
		int height = in.nextInt();
		
		Caixa caixa = new Caixa(width, height, '-');
		
		try {
			caixa.print();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao desenhar a caixa!");
			System.out.println(e.getMessage());
		}
	}
}
