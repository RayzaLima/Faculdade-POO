package app;
import java.util.ArrayList;
public class Professor extends Pessoa {
	protected int numCursos;
	protected ArrayList<String> cursos = new ArrayList<String>();
	
    public Professor(String nome, String endere�o) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
	}
public boolean addCurso(String curso) {
		
		if(cursos.add(curso.toLowerCase())) {			
			numCursos++;
			return true;
		}else {
			return false;
		}
	}
public boolean remmoverCurso(String curso) {
	
	  for(int i = 0; i< cursos.size(); i++) {
		  
		  if(cursos.get(i).compareTo(curso.toLowerCase()) == 0) {
			  cursos.remove(i);
			  return true;
		  }
	  }
	  return false;
	}
    public ArrayList<String> getCursos() {
		return this.cursos;
	}
	@Override
	public String toString() {
		return "Professor(a) "+ nome + " ensina " + numCursos + " cursos S�o eles " + cursos;
	}

    
}