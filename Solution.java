import java.io.*;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 * Classe Solution lida com a entrada do usuário e chamar o método decentNumber
 * da classe Result.
 * 
 */
public class Solution {
    private static final Logger LOGGER = Logger.getLogger(Result.class.getName());

    /**
     * @Método principal que solicita ao usuário o número de casos de teste e os
     * valores de n, e chama o método decentNumber da classe Result para cada caso de teste
     * @throws IOException Se ocorrer um erro de entrada ou saída ao ler a entrada do usuário.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        LOGGER.log(Level.INFO, "Insira o número de casos de teste:");
        int t = Integer.parseInt(bufferedReader.readLine().trim());
            
        for (int tItr = 0; tItr < t; tItr++) {
            try {
                System.out.println("---------------------------------");
            
                LOGGER.log(Level.INFO, "Insira o valor de n para o caso de teste " + (tItr + 1) + ":");
                
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                Result.decentNumber(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
 }
        }

        bufferedReader.close();
    }
}