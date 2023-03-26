import cursos.Aluno;
import cursos.Carreira;


public class App {
    public static void main(String[] args) throws Exception {
       
        Aluno novoAluno = new Aluno("José Junior", 39, "teste@teste.com");
        Carreira novoCurso = new Carreira("Escola de programação em Java", "Back-end", "Alura", 36, novoAluno);
        System.out.println(novoAluno.getNome());
        novoCurso.matricula();
        


        

        

        
        
        
        
        
        
    }
}
