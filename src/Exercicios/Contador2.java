package Exercicios;

public class Contador2 {
    String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return "Contador2{" +
                "frase='" + frase + '\'' +
                '}';
    }

    public Integer contaPalavras(){
        Integer contador = 1;
        for (char ch :
                frase.toCharArray()) {
            if (ch == ' '){
                contador++;
            }
        }
        return contador;
    }
    public Integer contaPalavrasUsandoReplaceAll(){
        String espacos = frase. replaceAll(" ","");
        return frase.length() - espacos.length() + 1;
    }
}
