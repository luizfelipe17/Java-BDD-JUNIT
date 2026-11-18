package avaliacao;

public class Avaliacao {

    public double calcularMedia(double nota1, double nota2) {
        validarNota(nota1);
        validarNota(nota2);

        return (nota1 + nota2) / 2.0;
    }

    public String verificarSituacao(double media) {
        validarNota(media);

        if (media >= 7) {
            return "APROVADO";
        }

        if (media >= 5) {
            return "RECUPERACAO";
        }

        return "REPROVADO";
    }

    private void validarNota(double nota) {
        if (!Double.isFinite(nota) || nota < 0 || nota > 10) {
            throw new IllegalArgumentException(
                "A nota deve estar entre 0 e 10."
            );
        }
    }
}