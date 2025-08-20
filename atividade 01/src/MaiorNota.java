public class MaiorNota {
    public static void main(String[] args) {
        // Exemplo de notas definidas diretamente
        double[] notas = {8.5, 9.0, 7.5, 10.0, 6.0, 8.0, 9.5, 7.0, 8.2, 9.8}; // 10 notas
        double maior = notas[0]; // Inicializa com a primeira nota

        for (int i = 1; i < notas.length; i++) { // Começa do índice 1
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }

        System.out.println("A maior nota foi: " + maior);
    }
}
