package tarefa;

public class Aluno {
	// Propriedades do aluno
    private String nome;
    private int idade;
    private String curso;
    private double nota1;
    private double nota2;

    

    // Método para calcular a média do aluno
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para verificar se o aluno foi aprovado
    public boolean verificarAprovacao() {
        double media = calcularMedia();
        return media >= 6.0;
    }
}


