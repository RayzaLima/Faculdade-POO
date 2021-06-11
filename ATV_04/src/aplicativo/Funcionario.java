package aplicativo;

public class Funcionario extends Pessoa {
    protected String funcao;
    protected double salario;

    public Funcionario(String funcao, double salario) {
        this.funcao = funcao;
        this.salario = salario;
    }

    public Funcionario(int idade, String nome, String cargo, double salario) {
        super(idade, nome);
        this.funcao = funcao;
        this.salario = salario;
    }

    public Funcionario(int idade, String nome, String cpf, String funcao, double salario) {
        super(idade, nome, cpf);
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + funcao + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
