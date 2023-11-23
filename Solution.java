import java.io.*;
import java.util.stream.IntStream;

/**
 * Classe Solution lida com a entrada do usuário e chamar o método decentNumber
 * da classe Result.
 * 
 */
public class Solution {

    /**
     * @Método principal que solicita ao usuário o número de casos de teste e os
     * valores de n, e chama o método decentNumber da classe Result para cada caso de teste
     * @throws IOException Se ocorrer um erro de entrada ou saída ao ler a entrada do usuário.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insira o número de casos de teste:");
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                System.out.println("Insira o valor de n para o caso de teste " + (tItr + 1) + ":");
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                Result.decentNumber(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}