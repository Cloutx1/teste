public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        int indice = 13;
        int soma = 0;
        int k = 0;
        
        do {
            k = k + 1;
            soma = soma + k;
        } while (k < indice);

        System.out.println(soma);

        
    }
}
