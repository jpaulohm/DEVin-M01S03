package Exercicios.MegaSena;

import java.io.IOException;
import java.sql.Array;
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
        todasMegaSenas.OrdenarPorId();

//EX 08
        /*
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Qual data voce esta procurando?");
        String dataConcurso = scanner.nextLine();
        */
        String dataConcurso = "14/04/2021";
        todasMegaSenas.ProcuraPorDataString(dataConcurso);

//EX 09
        todasMegaSenas.OrdenarNumerosSorteados();
        Integer[] teste = {4,5,30,33,41,52};
        todasMegaSenas.ProcurarSeJaFOiSorteado(teste);

        //EX 10
        todasMegaSenas.PreencheMapa();

        todasMegaSenas.MaisSorteado();
        todasMegaSenas.MenosSorteado();
    }
}
