import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Facultad> facultades;
    private List<Oficina> oficinas;
    private Oficina oficinaDeRectoria;

    public Universidad() {
        this.facultades = new ArrayList<>();
        this.oficinas = new ArrayList<>();
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

    public Oficina getOficinaDeRectoria() {
        return oficinaDeRectoria;
    }

    public void añadirFacultad(int numeroFacultad) {
        for(Facultad facultad : this.facultades) {
            if(facultad.getNumeroDeFacultad() != numeroFacultad) {
                this.facultades.add(facultad);
            }
        }
    }

    public void removerFacultad(int numeroFacultad) throws FacultadNoEcontradaException{
        for(Facultad facultad : this.facultades) {
            if(facultad.getNumeroDeFacultad() == numeroFacultad) {
                this.facultades.remove(facultad);
                return;
            }
        }
        throw new FacultadNoEcontradaException();
    }

    public void añadirOficina(int numeroOficina) {
        for(Oficina oficina : this.oficinas) {
            if(oficina.getNumeroOficina() != numeroOficina) {
                this.oficinas.add(oficina);
            }
        }
    }

    public void removerOficina(int numeroOficina) throws OficinaNoEncontradaException{
        for(Oficina oficina : this.oficinas) {
            if(oficina.getNumeroOficina() == numeroOficina) {
                this.oficinas.remove(oficina);
                return;
            }
        }
        throw new OficinaNoEncontradaException();
    }

    public void setOficinaDeRectoria(int numeroOficina) {
        oficinaDeRectoria.setNumeroOficina(numeroOficina);
    }

    public String toString() {


    }
}
