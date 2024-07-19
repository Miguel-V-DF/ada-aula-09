import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas desejadas: ");
        int linhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas desejadas: ");
        int colunas = sc.nextInt();
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor %d da linha %d: ", j + 1, i + 1);
                matriz[i][j] = sc.nextInt();
            }
        }
        int maiorValor = 0;

        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
            }
        }
        System.out.println("Maior valor: " + maiorValor);

    }
}
