package Programa;


public class Nodo {
    private  Paciente dato;
    private Nodo back,next;

    public Nodo(Paciente dato) {
        this.dato = dato;
    }

    public Paciente getDato() {
        return dato;
    }

    public void setDato(Paciente dato) {
        this.dato = dato;
    }

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  dato + "\n";
    }
    
    
   
}
