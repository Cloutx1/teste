public class Exercicio05 {
    
    public static void main(String[] args) {
        
        String palavra = "Target Sistemas";
        String palavraInvertida = "";

        for(int i = 0; i < palavra.length(); i++){
            palavraInvertida = palavra.charAt(i) + palavraInvertida;
        }

        System.out.println("Palavra invertida: " + palavraInvertida);
    }
}
