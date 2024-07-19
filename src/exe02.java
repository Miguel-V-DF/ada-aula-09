import java.util.Random;
import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(10) + 1;
        int numeroUsuario;
        boolean numeroCorreto = false;

        do {
            System.out.println("Digite um numero de 1 a 10");
            numeroUsuario = sc.nextInt();
            if (numeroUsuario > numeroSorteado){
                System.out.println("O numero digitado é maior que o aleatorio");
            } else if(numeroUsuario < numeroSorteado){
                System.out.println("O numero digitado é menor que o aleatorio");
            }else {
                numeroCorreto = true;
                System.out.println("Número Correto!");
            }
        } while(numeroCorreto == false);

        sc.close();
    }
}
