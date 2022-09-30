import Exercicios.Contador;
import Exercicios.Funcionario;

public class Main {
    public static void main(String[] args) {
        System.out.println("1)");
        Funcionario joao = new Funcionario(1000.10F, "Joao Paulo Harger", 5582677933L );
        System.out.println(joao);

        joao.Promover(10.5F);
        System.out.println(joao);

        joao.Aumentar(15F);
        System.out.println(joao);

        joao.Aumentar(15F,20F);
        System.out.println(joao);


        System.out.println("Numero de plavras no nome do joao: " + Contador.contaPalavras(joao.getNomeCompleto()));
    }
}