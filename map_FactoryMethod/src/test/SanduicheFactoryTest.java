package test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import factory.SanduicheFactory;
import factoryConcreto.SanduicheFit;
import factoryConcreto.SanduicheQueijo;
import factoryConcreto.SanduicheTradicional;
import produto.Sanduiche;
import produtoConcreto.OvoCapoeira;
import produtoConcreto.OvoGranja;
import produtoConcreto.PaoBola;
import produtoConcreto.PaoFrances;
import produtoConcreto.PaoIntegral;
import produtoConcreto.PresuntoFrango;
import produtoConcreto.QueijoCheddar;
import produtoConcreto.QueijoMussarela;
import produtoConcreto.TomateNormal;

//valida a criação/montagem de cada tipo de sanduíche pelas fábricas.
public class SanduicheFactoryTest {

    @Test
    void deveCriarSanduicheTradicionalComIngredientesCorretos() {
        SanduicheFactory factory = new SanduicheTradicional();
        Sanduiche sanduiche = factory.criarSanduiche();

        assertNotNull(sanduiche);
        assertInstanceOf(PaoBola.class, sanduiche.getPaoFatia1());
        assertInstanceOf(QueijoCheddar.class, sanduiche.getQueijo());
        assertInstanceOf(PresuntoFrango.class, sanduiche.getPresunto());
        assertInstanceOf(OvoCapoeira.class, sanduiche.getOvo());
        assertInstanceOf(TomateNormal.class, sanduiche.getTomate());
        assertInstanceOf(PaoBola.class, sanduiche.getPaoFatia2());
    }

    @Test
    void deveCriarSanduicheFitComIngredientesCorretos() {
        SanduicheFactory factory = new SanduicheFit();
        Sanduiche sanduiche = factory.criarSanduiche();

        assertNotNull(sanduiche);
        assertInstanceOf(PaoIntegral.class, sanduiche.getPaoFatia1());
        assertInstanceOf(QueijoMussarela.class, sanduiche.getQueijo());
        assertNull(sanduiche.getPresunto());
        assertInstanceOf(OvoGranja.class, sanduiche.getOvo());
        assertInstanceOf(TomateNormal.class, sanduiche.getTomate());
        assertInstanceOf(PaoIntegral.class, sanduiche.getPaoFatia2());
    }

    @Test
    void deveCriarSanduicheQueijoComIngredientesCorretos() {
        SanduicheFactory factory = new SanduicheQueijo();
        Sanduiche sanduiche = factory.criarSanduiche();

        assertNotNull(sanduiche);
        assertInstanceOf(PaoFrances.class, sanduiche.getPaoFatia1());
        assertInstanceOf(QueijoCheddar.class, sanduiche.getQueijo());
        assertNull(sanduiche.getPresunto());
        assertNull(sanduiche.getOvo());
        assertInstanceOf(TomateNormal.class, sanduiche.getTomate());
        assertInstanceOf(PaoFrances.class, sanduiche.getPaoFatia2());
    }
}