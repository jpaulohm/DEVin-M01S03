package Desafios.Funcionarios;

public interface Autenticavel {
    public default boolean autenticaver(String nome, String senha){

        return false;

    }
}
