package app;
import java.util.ArrayList;

public abstract class Pessoa {
    protected String nome;
    protected String  endere�o;
    
    public Pessoa() {
    	
    }
	public Pessoa(String nome, String endere�o) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
	}
	public String getNome() {
		return nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endere�o=" + endere�o + "]";
	}

}