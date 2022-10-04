package Exercicios.MegaSena;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class MegaSenaDB {
    String nomeArquivo;
    Path arquivo;
    List<Concurso> todosConcursos;
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

}
