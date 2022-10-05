package Exercicios.MegaSena;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class MegaSenaDB {
    String nomeArquivo;
    Path arquivo;
    List<Concurso> todosConcursos;

    public void ProcuraPorDataString(String dataDoConcurso){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate data = LocalDate.parse(dataDoConcurso, formatter);

        for (int i = 0; i < todosConcursos.size(); i++) {
            if(data.equals( todosConcursos.get(i).getData())){
                System.out.println("Nessa data houve sorteio:");
                System.out.println(todosConcursos.get(i));
                return;
            }
        }
        System.out.println("Não houve sorteio neste dia");
        return;
    }


    public MegaSenaDB(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        todosConcursos = new ArrayList<>();
    }
    public void RecebeInfosDoArquivo()  throws IOException{
        arquivo = Paths.get(nomeArquivo);
        List<String> linhasDoArquivo;
        linhasDoArquivo = readAllLines(arquivo);

        for (int i = 0; i < linhasDoArquivo.size(); i++) {
            todosConcursos.add(new Concurso(linhasDoArquivo.get(i)));
        }
    }
    public void ImprimeConcurso(Integer numero){
        System.out.println(todosConcursos.get(numero));
    }
    public Integer NumeroDeConcursos(){
        return todosConcursos.size();
    }
    public void OrdenarPorId(){
        todosConcursos.sort(new Comparator<Concurso>() {
            @Override
            public int compare(Concurso o1, Concurso o2) {
                if (o1.getNumero()<o2.getNumero()){
                    return -1;
                } else if (o1.getNumero() > o2.getNumero()) {
                    return 1;
                }
                return 0;
            }
        });
    }

    public void OrdenarNumerosSorteados(){
        for (int i = 0; i < todosConcursos.size(); i++) {
            todosConcursos.get(i).OrdenarNumerosSorteados();
        }
    }
    public void ProcurarSeJaFOiSorteado(Integer[] meusNumeros){
        Arrays.sort(meusNumeros);
        for (int i = 0; i < todosConcursos.size(); i++) {
            if (Arrays.equals(todosConcursos.get(i).getSorteados(), meusNumeros)){
                System.out.println("Numeros ja foram sorteados:\n" + todosConcursos.get(i));
                return;
            }
        }
        System.out.println("Numeros nunca sorteados");
        return;
    }


}
