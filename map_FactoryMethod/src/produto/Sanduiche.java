package produto;

import ingrediente.*;

public class Sanduiche {
	//2 fatias de pao
	Pao paoFatia1;
	
	Queijo queijo;
	Presunto presunto;
	Ovo ovo;
	Tomate tomate;
	//String tomate = "Tomate";
	Pao paoFatia2;
	
	public Sanduiche (Pao paoFatia1, Queijo queijo, Presunto presunto, Ovo ovo, Tomate tomate, Pao paoFatia2) {
		this.paoFatia1 = paoFatia1;
		this.paoFatia2 = paoFatia2;

		this.queijo = queijo;
	
		this.presunto = presunto;
		this.ovo = ovo;
		this.tomate = tomate;
	}
	
	//getters:
	 public Pao getPaoFatia1() { return paoFatia1; }
	 public Pao getPaoFatia2() { return paoFatia2; }
	 public Queijo getQueijo() { return queijo; }
	 public Presunto getPresunto() { return presunto; }
	 public Ovo getOvo() { return ovo; }
	 public Tomate getTomate() { return tomate; }
	
}
