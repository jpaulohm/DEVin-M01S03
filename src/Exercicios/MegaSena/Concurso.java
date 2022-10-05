package Exercicios.MegaSena;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Concurso {
    private Integer numero;
    private LocalDate data;
    private Integer[] sorteados;

    public Concurso(@NotNull String linha) {
        List<String> infosConcurso = Arrays.asList(linha.split(","));
        numero = Integer.valueOf(infosConcurso.get(0));
        sorteados = new Integer[6];

        for (int i = 0; i <6 ; i++) {
            sorteados[i] = Integer.valueOf(infosConcurso.get(i+2));
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

        data = LocalDate.parse(infosConcurso.get(1), formatter);
    }

    public void OrdenarNumerosSorteados(){
        Arrays.sort(sorteados);
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "numero=" + numero +
                ", data=" + data +
                ", sorteados=" + Arrays.toString(sorteados) +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer[] getSorteados() {
        return sorteados;
    }

    public void setSorteados(Integer[] sorteados) {
        this.sorteados = sorteados;
    }
}
