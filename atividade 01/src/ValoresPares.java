public class ValoresPares {
    public static void main(String[] args) {
        // Exemplo de números definidos diretamente
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 10 números

        System.out.println("Números pares digitados:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
