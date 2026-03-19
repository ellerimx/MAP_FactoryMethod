package factoryConcreto;

import factory.SanduicheFactory;
import produto.Sanduiche;
import produtoConcreto.*;
import ingrediente.*;

public class SanduicheQueijo extends SanduicheFactory{
	
	//sanduiche de queijo + tomate
	@Override
	public Sanduiche criarSanduiche() {
		Pao paoFatia1 = new PaoFrances();
		Queijo queijo = new QueijoCheddar();
		Tomate tomate  = new TomateNormal();
		Pao paoFatia2 = new PaoFrances();
	
		return new Sanduiche(paoFatia1, queijo, null, null, tomate, paoFatia2);
		
	}
	
	

}
