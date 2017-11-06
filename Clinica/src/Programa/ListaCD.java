
package Programa;

/**
 *
 * @author andrey
 */
public class ListaCD {
    
    private Nodo cabeza, ultimo;
    
    public void inserta(Paciente p){
    if (cabeza == null) {
            cabeza = new Nodo(p);
            ultimo = cabeza;
        } else {
            if (p.getPrioridad() < cabeza.getDato().getPrioridad()) {
                Nodo aux = new Nodo(p);
                aux.setNext(cabeza);
                cabeza.setBack(aux);
                cabeza = aux;
            } else if (p.getPrioridad() > ultimo.getDato().getPrioridad()) {
                Nodo aux = new Nodo(p);
                ultimo.setNext(aux);
                aux.setBack(ultimo);
                ultimo = aux;
            } else {
                Nodo aux = cabeza;
                while (p.getPrioridad() > aux.getNext().getDato().getPrioridad()) {
                    aux = aux.getNext();
                }
                Nodo temp = new Nodo(p);
                temp.setNext(aux.getNext());
                aux.setNext(temp);
                temp.setBack(aux);
                temp.getNext().setBack(temp);
            }
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }
    }
    
    
    @Override
    public String toString() {
        String msj = "";
        if (cabeza == null) {
            msj = "Lista vacía";
        } else {
            Nodo aux = cabeza;
            msj += aux;
            aux = aux.getNext();
            while (aux != cabeza) {
                msj += aux;
                aux = aux.getNext();
            }
        }
        return msj;
    }
    
    public boolean existe(int edad){
        boolean existe=false;
        Nodo aux = cabeza;
        if (edad == aux.getDato().getPrioridad()) {
            existe = true;
        }
        aux = aux.getNext();
        while (aux != cabeza) {
            if (edad == aux.getDato().getPrioridad()) {
                existe = true;
            }
            aux = aux.getNext();
        }
        return existe;
    }
    
     public boolean existeEspecialista(String especialista){
        boolean existe=false;
        Nodo aux = cabeza;
        if (especialista == aux.getDato().getEspecialista()) {
            System.out.println(aux);
        }
        aux = aux.getNext();
        while (aux != cabeza) {
            if (especialista == aux.getDato().getEspecialista()) {
                System.out.println(aux);
            }
            aux = aux.getNext();
        }
        return existe;
    }
     
     
     
     public void modifica(String especialista, String nombre) {
        Nodo aux = cabeza;
        if (nombre == aux.getDato().getNombre()) {
            aux.getDato().setEspecialista(especialista);
        }
        aux = aux.getNext();
        while (aux != cabeza) {
            if (nombre == aux.getDato().getNombre()) {
                aux.getDato().setEspecialista(especialista);
            }
            aux = aux.getNext();
        }   
    }
     
     
     
     
     
}
