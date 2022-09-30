package Desafios;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Personagem> personagens = new ArrayList<Personagem>();
        personagens.add(0,new Personagem("Jerry Seinfeld", Referencia.SERIE,30) );

        System.out.println(personagens.get(0));

        System.out.println(personagens.get(0).obterTresPrimeirasLetrasDoNome());
        System.out.println(personagens.get(0).getNome().toUpperCase());

    }
}
