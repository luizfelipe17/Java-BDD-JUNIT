
public class Avaliacao {

    // Verifica se a nota está dentro do intervalo permitido
    public static boolean notaValida(double nota) {
        return nota >= 0 && nota <= 10;
    }

    // Calcula a média de duas notas
    public static double calcularMedia(double nota1, double nota2) {

        if (!notaValida(nota1) || !notaValida(nota2)) {
            throw new IllegalArgumentException(
                "Nota inválida! As notas devem estar entre 0 e 10."
            );
        }

        return (nota1 + nota2) / 2.0;
    }

    // Verifica a situação acadêmica do aluno
    public static String verificarSituacao(double media) {

        if (media < 0 || media > 10) {
            throw new IllegalArgumentException("Média inválida!");
        }

        if (media >= 7) {
            return "APROVADO";
        } else if (media >= 5) {
            return "RECUPERACAO";
        } else {
            return "REPROVADO";
        }
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {

        double media1 = calcularMedia(8, 6);
        System.out.println("Média: " + media1);
        System.out.println("Situação: " + verificarSituacao(media1));

        double media2 = calcularMedia(6, 6);
        System.out.println("Média: " + media2);
        System.out.println("Situação: " + verificarSituacao(media2));

        try {
            calcularMedia(11, 8);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
