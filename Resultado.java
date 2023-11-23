import java.util.logging.Level;
import java.util.logging.Logger;

class Resultado {

   private static final Logger logger = Logger.getLogger(Resultado.class.getName());

    public static void decentNumber(int n) {
       
        if (n < 3) {
            logger.log(Level.INFO, "-1");
            return;
        }

        if (n % 3 == 0) {
            // Se n for divisível por 3, atribui todos os dígitos a 5
            printDecentNumber(n, n, 0);
            return;
        }

        // Enquanto n não for divisível por 3, diminui n por 5
        while (n % 3 != 0 && n >= 0) {
            n -= 5;
        }

        // Se n for menor que 0, imprime -1
        if (n < 0) {
            logger.log(Level.INFO, "-1");
        } else {
            // Caso contrário, imprime o número decente
            printDecentNumber(n, n, n);
        }
    }

    private static void printDecentNumber(int numFives, int numThrees, int totalLength) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numFives; i++) {
            result.append("5");
        }
        for (int i = 0; i < numThrees; i++) {
            result.append("3");
        }
        logger.log(Level.INFO, result.toString());
    }
}

