import java.util.Scanner;

public class asteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (n): ");
        int n = entrada.nextInt();

        // LAÇO EXTERNO: Controla as linhas
        for (int i = 0; i < n; i++) {
            
            // LAÇO INTERNO: Controla as colunas (asteriscos na mesma linha)
            for (int j = 0; j < n; j++) {
                System.out.print("* "); // Usamos print() para ficarem lado a lado
            }
            
            // Depois de imprimir todos os asteriscos da linha, pula para a próxima
            System.out.println(); 
        }

        entrada.close();
    }
}