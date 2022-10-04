package Exercicios.Contador;

public class Contador {
    public static Integer contaPalavras(String frase){
        Integer contador = 1;
        for (char letra:frase.toCharArray()) {
            if (letra == ' '){
                contador++;
            }
        }
        return contador;
    }
}
