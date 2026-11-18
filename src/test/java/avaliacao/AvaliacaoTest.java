package avaliacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoTest {

    private final Avaliacao avaliacao = new Avaliacao();

    @Test
    void deveCalcularMedia() {
        assertEquals(7.0, avaliacao.calcularMedia(8, 6), 0.001);
    }

    @Test
    void deveRetornarRecuperacao() {
        assertEquals("RECUPERACAO", avaliacao.verificarSituacao(6));
    }

    @Test
    void deveRejeitarNotaInvalida() {
        assertThrows(
            IllegalArgumentException.class,
            () -> avaliacao.calcularMedia(11, 8)
        );
    }
}