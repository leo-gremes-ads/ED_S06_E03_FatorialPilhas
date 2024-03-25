package view;

import controller.FatController;
import java.util.Scanner;

public class Principal 
{
	public static void main(String[] args)
	{
		FatController fc = new FatController();
		int n = inteiroValido();
		System.out.println("Fatorial de " + n + ": " + fc.fatorial(n));
	}
	
	private static int inteiroValido()
	{
		Scanner s = new Scanner(System.in);
		String txt;
		int n;
		
		while (true) {
			System.out.print("Digite um n�mero entre 0 e 10: ");
			txt = s.nextLine();
			try {
				n = Integer.parseInt(txt);
			} catch (Exception e) {
				System.out.println("N�o � uma entrada v�lida. Digite novamente!");
				continue;
			}
			if (n >= 0 && n <= 10)
				break;
			System.out.println("N�mero fora do intervalo. Digite novamente!");
		}
		s.close();
		return n;
	}
}