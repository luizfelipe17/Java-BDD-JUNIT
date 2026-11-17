package avaliacao;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoTest {

    private final Avaliacao avaliacao = new Avaliacao();

    @Test
    void deveCalcularMediaDeOitoESeis() {
        double media = avaliacao.calcularMedia(8, 6);

        assertEquals(7.0, media, 0.001);
    }

    @Test
    void deveRetornarRecuperacaoParaMediaSeis() {
        String situacao = avaliacao.verificarSituacao(6);

        assertEquals("RECUPERACAO", situacao);
    }

    @Test
    void deveLancarExcecaoParaNotaOnze() {
        assertThrows(
            IllegalArgumentException.class,
            () -> avaliacao.calcularMedia(11, 8)
        );
    }
}