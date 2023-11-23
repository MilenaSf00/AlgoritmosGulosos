public class TestSolution {

    public static void main(String[] args) {
        testDecentNumber();
    }

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

    private static void testSingleCase(int n) {
        System.out.println("Entrada: " + n);
        System.out.print("Saída: ");
        Result.decentNumber(n);
        System.out.println();
        System.out.println("----------------------");
    }
}
