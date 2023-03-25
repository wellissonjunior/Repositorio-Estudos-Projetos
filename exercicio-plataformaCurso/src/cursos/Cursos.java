package cursos;



/**
 * Cursos
 */
public class Cursos {
    private String titulo;
    private String categoria;
    private String plataforma;
    private int cargaHoraria;


    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Cursos: titulo = " + titulo + ", categoria = " + categoria + ", plataforma = " + plataforma
                + " , cargaHoraria = " + cargaHoraria +  " horas";
    }

    
    
}