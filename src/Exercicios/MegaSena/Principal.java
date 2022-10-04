package Exercicios.MegaSena;

import java.io.IOException;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) throws IOException {

        MegaSenaDB todasMegaSenas = new MegaSenaDB("megasena.txt");
        todasMegaSenas.RecebeInfosDoArquivo();

        for (int i = 0; i < 2500; i++) {
            todasMegaSenas.ImprimeConcurso(i);

        }


    }
}
