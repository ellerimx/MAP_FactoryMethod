package test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import ingrediente.Ovo;
import ingrediente.Pao;
import ingrediente.Presunto;
import ingrediente.Queijo;
import ingrediente.Tomate;
import produto.Sanduiche;
import produtoConcreto.OvoCapoeira;
import produtoConcreto.PaoBola;
import produtoConcreto.PresuntoFrango;
import produtoConcreto.QueijoCheddar;
import produtoConcreto.TomateNormal;

// testa se o objeto sanduíche guarda corretamente os ingredientes recebidos
public class SanduicheTest {

    @Test
    void deveRetornarMesmasInstanciasInformadasNoConstrutor() {
        Pao paoFatia1 = new PaoBola();
        Queijo queijo = new QueijoCheddar();
        Presunto presunto = new PresuntoFrango();
        Ovo ovo = new OvoCapoeira();
        Tomate tomate = new TomateNormal();
        Pao paoFatia2 = new PaoBola();

        Sanduiche sanduiche = new Sanduiche(paoFatia1, queijo, presunto, ovo, tomate, paoFatia2);

        assertSame(paoFatia1, sanduiche.getPaoFatia1());
        assertSame(queijo, sanduiche.getQueijo());
        assertSame(presunto, sanduiche.getPresunto());
        assertSame(ovo, sanduiche.getOvo());
        assertSame(tomate, sanduiche.getTomate());
        assertSame(paoFatia2, sanduiche.getPaoFatia2());
    }

    @Test
    void devePermitirIngredientesOpcionaisNulos() {
        Pao paoFatia1 = new PaoBola();
        Queijo queijo = new QueijoCheddar();
        Tomate tomate = new TomateNormal();
        Pao paoFatia2 = new PaoBola();

        Sanduiche sanduiche = new Sanduiche(paoFatia1, queijo, null, null, tomate, paoFatia2);

        assertSame(paoFatia1, sanduiche.getPaoFatia1());
        assertSame(queijo, sanduiche.getQueijo());
        assertNull(sanduiche.getPresunto());
        assertNull(sanduiche.getOvo());
        assertSame(tomate, sanduiche.getTomate());
        assertSame(paoFatia2, sanduiche.getPaoFatia2());
    }
}