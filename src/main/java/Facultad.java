import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private List<Academico> academicos;
    private Academico decano;
    private int numeroDeFacultad;

    public Facultad(int numeroDeFacultad, String nombreDecano) {
        this.academicos = new ArrayList<>();
        this.decano = new Academico(nombreDecano);
        this.numeroDeFacultad = numeroDeFacultad;
    }

    public int getNumeroDeFacultad() {
        return numeroDeFacultad;
    }
}
