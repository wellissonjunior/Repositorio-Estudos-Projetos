package cursos;

public class Carreira extends Cursos{

    private int quantidadeCurso = 0;
    private int horasBack = 0;
    private int horasFront = 0;


    
    public void matricula() {
        if (getCategoria().equalsIgnoreCase("Back-end")) {
            
            quantidadeCurso++;
            horasBack = getCargaHoraria();
            System.out.println(quantidadeCurso);
            System.out.println(horasBack);


        } else if (getCategoria().equalsIgnoreCase("Front-end")) {
            quantidadeCurso++;
            horasFront = getCargaHoraria();
        }
    }

}
