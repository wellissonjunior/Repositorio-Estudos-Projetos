package cursos;


public abstract class Cursos {
    private String titulo;
    private String categoria;
    private String plataforma;
    private int cargaHoraria;
    private Aluno aluno;

    
    
   


    public Cursos(String titulo, String categoria, String plataforma, int cargaHoraria) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.plataforma = plataforma;
        this.cargaHoraria = cargaHoraria;
    }


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

    public Aluno getAluno() {
            return aluno;
    }


    public void setAluno(Aluno aluno) {
            this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Cursos: titulo = " + titulo + ", categoria = " + categoria + ", plataforma = " + plataforma
                + " , cargaHoraria = " + cargaHoraria +  " horas";
    }

    
    
}