
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;



 public class Main {
    public static void main(String[] args) throws IOException {
        int[] inputs = {1, 3, 5, 11}; 

        for (int n : inputs) {
            Resultado.decentNumber(n);
        }
    } 
}