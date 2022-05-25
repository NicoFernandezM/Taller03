public class Academico {
    private String nombreAcademico;

    public Academico(String nombreAcademico) {
        this.nombreAcademico = nombreAcademico;
    }

    public void setNombreAcademico(String nombreAcademico) {
        this.nombreAcademico = nombreAcademico;
    }

    public String getNombreAcademico() {
        return nombreAcademico;
    }

    public String toString() {
        return ("Nombre academico: " + this.nombreAcademico);
    }
}
