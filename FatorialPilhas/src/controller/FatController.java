package controller;

import lib.model.Pilha;

public class FatController
{
	public FatController()
	{
		super();
	}
	
	//FATORIAL DE 10 CABE EM UM INTEIRO
	public int fatorial(int n)
	{
		Pilha p = new Pilha();
		
		try {
			while (n > 0) {
				if (p.isEmpty())
					p.push(n);
				else
					p.push(n * p.pop());
				n--;
			}
			return p.pop();
		} catch (Exception e) {
			return 1;
		}
	}
}