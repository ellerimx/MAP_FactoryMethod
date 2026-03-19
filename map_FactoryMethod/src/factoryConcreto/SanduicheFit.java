package factoryConcreto;

import factory.SanduicheFactory;
import produto.Sanduiche;
import produtoConcreto.*;
import ingrediente.*;

public class SanduicheFit extends SanduicheFactory{
	// queijo mussarela + salada + ovo granja 
	
	@Override
    public Sanduiche criarSanduiche() {

        Pao paoFatia1 = new PaoIntegral();

        Queijo queijo = new QueijoMussarela();

        Presunto presunto = null;

        Ovo ovo = new OvoGranja();

        Tomate tomate = new TomateNormal();
        Pao paoFatia2 = new PaoIntegral();

        return new Sanduiche(paoFatia1,queijo,presunto,ovo,tomate,paoFatia2);
	}
}
