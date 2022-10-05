package Exercicios.MegaSena;

import java.io.IOException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException {
    //EX 5 e 6
        MegaSenaDB todasMegaSenas = new MegaSenaDB("megasena.txt");
        todasMegaSenas.RecebeInfosDoArquivo();

        for (int i = todasMegaSenas.NumeroDeConcursos()-1; i >=0; i--) {
            todasMegaSenas.ImprimeConcurso(i);

        }
//EX 07
        todasMegaSenas.Ordenar();

//EX 08
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Qual data voce esta procurando?");
        String dataConcurso = scanner.nextLine();

        todasMegaSenas.ProcuraPorDataString(dataConcurso);


    }
}
