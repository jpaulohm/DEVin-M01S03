package tech.devinhouse.model;

import java.time.LocalDate;

/*
Representa uma tarefa dentro do sistema
@autor joaomanfredini
 */

public class Tarefa {
    Boolean concluida;
    Long id;
    String tarefa;
    LocalDate deadline;

    @Override
    public String toString() {
        return "Tarefa{" +
                "concluida=" + concluida +
                ", id=" + id +
                ", tarefa='" + tarefa + '\'' +
                ", deadline=" + deadline +
                '}';
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
