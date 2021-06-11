package app;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
			Estudante estudante1 = new Estudante("Pedro", "Recife");
			estudante1.addCursoNota("Matemática", 9);
			estudante1.addCursoNota("Informatica", 8);
			
			Estudante estudante2 = new Estudante("João", "São Paulo");
			estudante2.addCursoNota("Português", 7);
			estudante2.addCursoNota("Informática", 9);
			
			pessoas.add(estudante1);
			pessoas.add(estudante2);
			

			Professor  professor1 = new Professor("Marta", "Recife");
			professor1.addCurso("matemática");
			professor1.addCurso("biologia");
			
			Professor professor2 = new Professor("Jose", "Rio de Janeiro");
			professor2.addCurso("informática");
			professor2.addCurso("Português");
			
			pessoas.add(professor1);
			pessoas.add(professor2);
			
	
			for(int i = 0; i<pessoas.size(); i++) {
				String str = pessoas.get(i).toString();
				System.out.println(str);
			}
			
			String teste = pessoasData(pessoas);
			System.out.println(teste);
	}
	
	private static String pessoasData(ArrayList<Pessoa> pessoas) {
		
		Professor professor = new Professor(null, null);
		Estudante estudante = new Estudante(null, null);
		String linhas = "";
		
			
			for(int i = 0; i< pessoas.size(); i++) {
					
				 if(professor.getClass() == pessoas.get(i).getClass()) {
					 Professor prof = (Professor) pessoas.get(i);
					 
					 for(int y = 0; y < prof.getCursos().size(); y++) {
						linhas += "\nCurso: "+ prof.getCursos().get(y)+"\n";
						linhas += "Professor: " + prof.getNome()+"\n";
						linhas += "Alunos: ";
								
							for(int z = 0; z < pessoas.size(); z++) {
								
								if(estudante.getClass() == pessoas.get(z).getClass()) {
									Estudante student = (Estudante) pessoas.get(z);
									
									for(int x = 0; x < student.getCursos().size(); x++) {
										
										if(student.getCursos().get(x).equals(prof.getCursos().get(y))) {
											linhas += student.getNome()+"\n";
										}
									}
								}
							}
							linhas +="\n";
					 }
				 }
			}
			
			return linhas;
	}

}
