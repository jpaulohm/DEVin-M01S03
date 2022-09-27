package Exercicios;

//Crie uma classe 'Funcionario' para representar um empregado de uma empresa, contendo os atributos cpf, nome completo e salário.
//Implemente também um método 'promover' que recebe como parâmetro um percentual (float), devendo o salário ser aumentado pelo percentual indicado no argumento do método.
//Crie e utilize um objeto desta classe para testar a implementação.

public class Funcionario {
    Long cpf;
    String nomeCompleto;
    Float salario;
    public Funcionario(String NomeCompleto){
        nomeCompleto=NomeCompleto;
    }
    public Funcionario( String NomeCompleto, Long CPF){
        cpf=CPF;
        nomeCompleto=NomeCompleto;
    }
    public Funcionario(Float Salario, String NomeCompleto, Long CPF){
        cpf=CPF;
        nomeCompleto=NomeCompleto;
        salario=Salario;

    }
    public Float Promover(Float percentual){
      this.salario = this.salario * (1 + (percentual/100));
      return this.salario;
    }

    public Float Aumentar(Float valor, Float comissao){
        this.salario = this.salario + valor + comissao;
        return this.salario;
    }
    public Float Aumentar(Float valor){
        this.salario = this.salario + valor;
        return this.salario;
    }
    @Override
    public String toString(){
    return "Nome: " + nomeCompleto +"\nCPF: " + cpf + "\nSalario: " + salario;
    }
}
