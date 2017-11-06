
package Programa;

/**
 *
 * @author andrey
 */
public class Paciente {
    String Nombre, especialista;
    int ficha, prioridad;

    public Paciente(String Nombre, String especialista, int ficha, int prioridad) {
        this.Nombre = Nombre;
        this.especialista = especialista;
        this.ficha = ficha;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Paciente{" + "Nombre=" + Nombre + ", especialista=" + especialista + ", ficha=" + ficha + ", prioridad=" + prioridad + '}';
    }
    
    
    
    
}
