package app;
import java.util.ArrayList;

public abstract class Pessoa {
    protected String nome;
    protected String  endereço;
    
    public Pessoa() {
    	
    }
	public Pessoa(String nome, String endereço) {
		super();
		this.nome = nome;
		this.endereço = endereço;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereço() {
		return endereço;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereço=" + endereço + "]";
	}

}