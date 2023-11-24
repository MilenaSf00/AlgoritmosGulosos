import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe Result é responsável por gerar o maior número decente com base em
 * propriedades específicas.
 */

public class Result {
 
    /**
     * O logger para registrar informações.
     */
  private static final Logger LOGGER = Logger.getLogger(Result.class.getName());

  /**
     * Gera e imprime o maior número decente com o comprimento especificado.
     *
     * @param n O comprimento do número decente a ser criado.
     */
    public static void decentNumber(int n) {
        long startTime = System.currentTimeMillis();
        int total_threes = n;
        int total_fives = 0;

        while (total_threes % 3 != 0) {
            total_threes -= 5;
            total_fives += 5;
        }

        if (total_threes < 0) {
            System.out.println("-1");
             LOGGER.log(Level.INFO, "-1");
        } else {
            StringBuilder decentNum = new StringBuilder(total_threes + total_fives);

            for (int i = 0; i < total_threes; i++) {
                decentNum.append("5");
            }

            for (int i = 0; i < total_fives; i++) {
                decentNum.append("3");
            }

            System.out.println(decentNum);
            LOGGER.log(Level.INFO, decentNum.toString());
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        LOGGER.log(Level.INFO, "Tempo de execução: " + executionTime + " milissegundos");
    }
}
