package pt.diogocarvalho.caixa;
import java.util.Scanner;

import pt.diogocarvalho.caixa.errors.NotEnoughWidthException;
import pt.diogocarvalho.caixa.errors.NotEnoughHeightException;


public class Main {

	public static void main(String[] args) { //throws Exception
		Scanner in = new Scanner(System.in);
		
		System.out.println("Largura: ");
		int width = in.nextInt();
		
		System.out.println("Altura: ");
		int height = in.nextInt();
		
		Caixa caixa = new Caixa(width, height, '-');
		
		try {
			caixa.print();
		} catch (NotEnoughWidthException e) {
			System.out.println("Ocorreu um erro ao desenhar a caixa! A largura tem de ser superior a 3");
			//System.out.println(e.getMessage());
		} catch (NotEnoughHeightException e) {
			System.out.println("Ocorreu um erro ao desenhar a caixa! A altura tem de ser superior a 3");

		}
	}
}
