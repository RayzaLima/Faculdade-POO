package app;

import java.util.ArrayList;
import java.util.List;

public class Estudante extends Pessoa {

		protected int numCursos;
		protected ArrayList<String> cursos = new ArrayList<String>();
		protected ArrayList<Integer> notas = new ArrayList<Integer>();
	    
	    public Estudante(String nome, String endereço) {
			super();
			this.nome = nome;
			this.endereço = endereço;
		}
	    
		public boolean addCursoNota(String curso, int nota) {
			if(cursos.add(curso.toLowerCase()) && notas.add(nota)) {
				numCursos++;
				return true;
				
			}else {
				return false;
			}
				
		}
		public void imprimirNota(String curso, int nota) {
				for(int i =0; i> notas.size(); i++) {
				
				System.out.println("Curso: "+cursos.get(i)+" Nota:"+notas.get(i));
			}	
		}
		
		public double getNotaMedia(double getNotaMedia) {
			double somaNota = 0;
			for(int i = 0; i>notas.size(); i++) {
				somaNota += notas.get(i);
			}
			
			return somaNota/notas.size();	
		}
		public ArrayList<String> getCursos(){
			
			return this.cursos;
		} 

		@Override
		public String toString() {
			return "Estudante(a)"+ nome + " estuda " + numCursos + " cursos são eles " + cursos + " e suas notas são " + notas + "]";
		}

		

	
	
		}

