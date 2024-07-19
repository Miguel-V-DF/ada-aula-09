public class exe01 {

    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'c', 'd', 'e'};

        char[] letrasInvertido = new char[letras.length];

        for (int i = 0; i < letras.length ; i++) {
            letrasInvertido[letras.length - i - 1] = letras[i];
        }

        for (int i = 0; i < letrasInvertido.length ; i++) {
            System.out.println(letrasInvertido[i]);
        }
    }
}
