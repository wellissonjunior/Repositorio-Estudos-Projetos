package cursos;

public class Carreira extends Cursos{

    public Carreira(String titulo, String categoria, String plataforma, int cargaHoraria, Aluno aluno) {
        super(titulo, categoria, plataforma, cargaHoraria);
        
    }

          
    public void matricula() {
        if (getCategoria().equalsIgnoreCase("Back-end")) {
            
            System.out.println("Voce escolheu seguir a carreira " + getCategoria() + ". Bons estudos!!!");
            System.out.println("Aproveite o curso de " + getTitulo() + " para alavancar sua formação.");
            System.out.println("Bons estudos!!!");


        } else if (getCategoria().equalsIgnoreCase("Front-end")){
            System.out.println("Voce escolheu seguir a carreira " + getCategoria() + ".");
            System.out.println("Aproveite o curso de " + getTitulo() + " para alavancar sua formação.");
            System.out.println("Bons estudos!!!");
        }
    }

}



