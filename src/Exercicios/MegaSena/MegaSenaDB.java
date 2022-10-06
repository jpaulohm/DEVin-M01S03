package Exercicios.MegaSena;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.nio.file.Files.readAllLines;

public class MegaSenaDB {
    String nomeArquivo;
    Path arquivo;
    List<Concurso> todosConcursos;
    HashMap<Integer,Integer> mapaNumerosRepeticoes = new HashMap<>();

    public void PreencheMapa(){
        for (int i = 1; i < 61; i++) {
            mapaNumerosRepeticoes.put(i,0);
        }
        for (int i = 0; i < todosConcursos.size(); i++) {
            for (Integer j = 0; j < 6; j++) {
                mapaNumerosRepeticoes.replace(todosConcursos.get(i).getSorteados()[j],mapaNumerosRepeticoes.get(todosConcursos.get(i).getSorteados()[j])+1);
            }
        }
        System.out.println(mapaNumerosRepeticoes);
    }
    public Integer MaisSorteado(){
        Integer maisSorteado = 0;
        Integer repeticoes = 0;
        for (int i = 1; i <= mapaNumerosRepeticoes.size(); i++) {
            if (mapaNumerosRepeticoes.get(i) > repeticoes){
                maisSorteado= i;
                repeticoes=mapaNumerosRepeticoes.get(i);
            }
        }
        System.out.println("O numero mais sorteado e " + maisSorteado + ", foi sorteado " + repeticoes +"vezes");
        return maisSorteado;
    }
    public Integer MenosSorteado(){
        Integer menosSorteado = 0;
        Integer repeticoes = mapaNumerosRepeticoes.get(1);
        for (int i = 1; i <= mapaNumerosRepeticoes.size(); i++) {
            if (mapaNumerosRepeticoes.get(i) < repeticoes){
                menosSorteado= i;
                repeticoes=mapaNumerosRepeticoes.get(i);
            }
        }
        System.out.println("O numero mais sorteado e " + menosSorteado + ", foi sorteado " + repeticoes +"vezes");
        return menosSorteado;
    }
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
