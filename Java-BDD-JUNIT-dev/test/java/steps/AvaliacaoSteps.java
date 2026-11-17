

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.E;

import static org.junit.jupiter.api.Assertions.*;



public class AvaliacaoSteps {

    private final Avaliacao avaliacao = new Avaliacao();

    private double nota1;
    private double nota2;
    private double media;
    private IllegalArgumentException erro;

    @Dado("que as notas são {double} e {double}")
    public void definirNotas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.erro = null;
    }

    @Quando("calcular a média")
    public void calcularMedia() {
        try {
            media = avaliacao.calcularMedia(nota1, nota2);
        } catch (IllegalArgumentException exception) {
            erro = exception;
        }
    }

    @Então("a média deve ser {double}")
    public void verificarMedia(double esperada) {
        assertNull(erro, "O cálculo não deveria lançar uma exceção.");
        assertEquals(esperada, media, 0.001);
    }

    @E("a situação deve ser {string}")
    public void verificarSituacao(String esperada) {
        assertNull(erro, "O cálculo não deveria lançar uma exceção.");
        assertEquals(esperada, avaliacao.verificarSituacao(media));
    }

    @Então("deve ocorrer um erro de nota inválida")
    public void verificarErro() {
        assertNotNull(erro, "Deveria lançar IllegalArgumentException.");
    }
}