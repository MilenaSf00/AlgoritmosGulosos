/**
 * Classe TestSolution responsável por testar o método decentNumber da classe
 * Result.
 */
public class TestSolution {

    /**
     * @Método principal que inicia o teste do método decentNumber para vários casos.
     */
    public static void main(String[] args) {
        testDecentNumber();
    }

    /**
     * @Método que realiza testes do método decentNumber para diferentes casos.
     */
    private static void testDecentNumber() {
        System.out.println("Testando decentNumber...");

        System.out.println("Teste 1:");
        testSingleCase(1);

        System.out.println("Teste 2:");
        testSingleCase(3);

        System.out.println("Teste 3:");
        testSingleCase(5);

        System.out.println("Teste 4:");
        testSingleCase(11);

        System.out.println("Testes concluídos.");
    }

    /**
     * @Método que realiza um teste específico do método decentNumber com um valor
     *         de entrada específico.
     * @param n O valor de entrada para o teste.
     */
    private static void testSingleCase(int n) {
        System.out.println("Entrada: " + n);
        System.out.print("Saída: ");
        Result.decentNumber(n);
        System.out.println();
        System.out.println("----------------------");
    }
}
