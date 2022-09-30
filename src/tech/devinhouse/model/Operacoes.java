package tech.devinhouse.model;

public enum Operacoes {
    DELETAR,
    CRIAR,
    MARCAR_FINALIZADA,
    MARCAR_NAO_FINALIZADA;

    public static Operacoes obterPeloCodigo(int codigo){
        Operacoes[] operacoes = Operacoes.values();
        return operacoes[codigo-1];
    }
}
