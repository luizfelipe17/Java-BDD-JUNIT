package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotasTest {
    private Avaliacao avaliacao = new Avaliacao();

    @Test
    void deveCalcularMedia() {
        double resultado = avaliacao.calcularMedia();
        assertEquals(7.0, resultado);
    }

    @Test
    void deveValidarRecuperacao() {
        String resultado = avaliacao.validarRecuperacao();
        assertEquals("RECUPERACAO", resultado);
    }  

    @Test
    void deveLancarUmaExcecaoAoInserirNotaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            avaliacao.inserirNota(11);
        });
    }

}