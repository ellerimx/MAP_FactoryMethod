package factoryConcreto;

import factory.SanduicheFactory;
import produto.Sanduiche;
import produtoConcreto.*;
import ingrediente.*;

public class SanduicheTradicional extends SanduicheFactory {

	// pao bola + queijo prato + presunto frango + ovo capo + tomate
	
    @Override
    public Sanduiche criarSanduiche() {

        Pao paoFatia1 = new PaoBola();
        Queijo queijo = new QueijoCheddar();

        Presunto presunto = new PresuntoFrango();

        Ovo ovo = new OvoCapoeira();
        Tomate tomate = new TomateNormal();
        
        Pao paoFatia2 = new PaoBola();

        return new Sanduiche(paoFatia1,queijo,presunto,ovo,tomate, paoFatia2);
    }
}