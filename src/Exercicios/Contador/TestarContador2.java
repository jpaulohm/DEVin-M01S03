package Exercicios.Contador;

public class TestarContador2 {
    public static void main(String[] args) {
        Contador2 teste = new Contador2("Essa frase e um teste e deve conter 10 palavras");
        System.out.println(teste);
        System.out.println("numero de palavras = " + teste.contaPalavras());
        System.out.println("numero de palavras = " + teste.contaPalavrasUsandoReplaceAll());

    }
}
