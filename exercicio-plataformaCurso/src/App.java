import cursos.Aluno;
import cursos.Carreira;
import cursos.Cursos;

public class App {
    public static void main(String[] args) throws Exception {
       

        Cursos novoCurso = new Cursos();
        novoCurso.setTitulo("Escola de programação em Java");
        novoCurso.setCategoria("Back-end");
        novoCurso.setPlataforma("Alura");
        novoCurso.setCargaHoraria(36);
        

        System.out.println(novoCurso.toString());

        Aluno novoAluno = new Aluno();
        novoAluno.setNome("José Junior");
        novoAluno.setIdade(39);
        novoAluno.setEmail("teste@teste.com");

        System.out.println(novoAluno.toString());
        System.out.println("========================");
        Carreira cursos = new Carreira();
        cursos.setCategoria("Back-end");
        cursos.matricula();
        Carreira cursos1 = new Carreira();
        cursos1.setCategoria("Back-end");
        cursos1.matricula();
        
        
    }
}
