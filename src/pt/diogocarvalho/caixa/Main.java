package pt.diogocarvalho.caixa;

public class Main {

	public static void main(String[] args) {
		Caixa caixa = new Caixa(4, 4, '-');
		caixa.print();
		
		Caixa caixa2 = new Caixa(6, 6, 'W');
		caixa2.print();
	}
}
