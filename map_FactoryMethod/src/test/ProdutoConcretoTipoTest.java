package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import ingrediente.Ovo;
import ingrediente.Pao;
import ingrediente.Presunto;
import ingrediente.Queijo;
import ingrediente.Tomate;
import produtoConcreto.OvoCapoeira;
import produtoConcreto.OvoGranja;
import produtoConcreto.PaoBola;
import produtoConcreto.PaoFrances;
import produtoConcreto.PaoIntegral;
import produtoConcreto.PresuntoFrango;
import produtoConcreto.PresuntoPeru;
import produtoConcreto.QueijoCheddar;
import produtoConcreto.QueijoMussarela;
import produtoConcreto.QueijoPrato;
import produtoConcreto.TomateNormal;

//testa se cada ingrediente concreto se identifica corretamente com o seu tipo correspodente.
public class ProdutoConcretoTipoTest {

    @ParameterizedTest
    @MethodSource("paes")
    void paoDeveRetornarTipoEsperado(Pao pao, String esperado) {
        String tipo = pao.tipo();

        assertNotNull(tipo);
        assertFalse(tipo.isBlank());
        assertEquals(esperado, tipo);
    }

    @ParameterizedTest
    @MethodSource("queijos")
    void queijoDeveRetornarTipoEsperado(Queijo queijo, String esperado) {
        String tipo = queijo.tipo();

        assertNotNull(tipo);
        assertFalse(tipo.isBlank());
        assertEquals(esperado, tipo);
    }

    @ParameterizedTest
    @MethodSource("presuntos")
    void presuntoDeveRetornarTipoEsperado(Presunto presunto, String esperado) {
        String tipo = presunto.tipo();

        assertNotNull(tipo);
        assertFalse(tipo.isBlank());
        assertEquals(esperado, tipo);
    }

    @ParameterizedTest
    @MethodSource("ovos")
    void ovoDeveRetornarTipoEsperado(Ovo ovo, String esperado) {
        String tipo = ovo.tipo();

        assertNotNull(tipo);
        assertFalse(tipo.isBlank());
        assertEquals(esperado, tipo);
    }

    @ParameterizedTest
    @MethodSource("tomates")
    void tomateDeveRetornarTipoEsperado(Tomate tomate, String esperado) {
        String tipo = tomate.tipo();

        assertNotNull(tipo);
        assertFalse(tipo.isBlank());
        assertEquals(esperado, tipo);
    }

    private static Stream<Arguments> paes() {
        return Stream.of(
                Arguments.of(new PaoBola(), "Pao bola"),
                Arguments.of(new PaoFrances(), "Pao bola"),
                Arguments.of(new PaoIntegral(), "Pão integral"));
    }

    private static Stream<Arguments> queijos() {
        return Stream.of(
                Arguments.of(new QueijoCheddar(), "queijo cheddar"),
                Arguments.of(new QueijoMussarela(), "queijo mussarela"),
                Arguments.of(new QueijoPrato(), "queijo prato"));
    }

    private static Stream<Arguments> presuntos() {
        return Stream.of(
                Arguments.of(new PresuntoFrango(), "Presunto de frango"),
                Arguments.of(new PresuntoPeru(), "Presunto de Peru"));
    }

    private static Stream<Arguments> ovos() {
        return Stream.of(
                Arguments.of(new OvoCapoeira(), "Ovo de capoeira"),
                Arguments.of(new OvoGranja(), "Ovo de granja"));
    }

    private static Stream<Arguments> tomates() {
        return Stream.of(Arguments.of(new TomateNormal(), "Tomate"));
    }
}