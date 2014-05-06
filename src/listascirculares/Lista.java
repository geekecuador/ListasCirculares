/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listascirculares;

/**
 *
 * @author GeekEcuador
 */
public class Lista {

    NodosListaCircular PrimerNodo;
    String Nombre;

    //Constructor construye una lista vacia con un nombre s
    public boolean VaciaLista() {
        return PrimerNodo == null;
    }

    //Imprime el contenido de la lista
    public void Imprimir() {
        if (VaciaLista()) {
            System.out.println("Vacia" + Nombre);
        } else {
            System.out.print("La " + Nombre + " es: ");
            NodosListaCircular Actual = PrimerNodo.siguiente;
            System.out.print(PrimerNodo.datos.toString() + " ");
            while (Actual != PrimerNodo) {
                System.out.print(Actual.datos.toString() + " ");
                Actual = Actual.siguiente;
            }
            System.out.println();
            System.out.println();
        }
    }

    //Constructor
    public Lista(String s) {
        Nombre = s;
        PrimerNodo = null;
    }

    //Constructor
    public Lista() {
        this("Lista");
    }

    //Inserta un elemento al frente de la lista
    void InsertaInicio(Object ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = new NodosListaCircular(ElemInser);
            PrimerNodo.siguiente = PrimerNodo;
        } else {
            NodosListaCircular aux = PrimerNodo;
            while (aux.siguiente != PrimerNodo) {
                aux = aux.siguiente;
            }
            NodosListaCircular tempo = new NodosListaCircular(ElemInser);
            aux.siguiente = tempo;
            tempo.siguiente = PrimerNodo;
            PrimerNodo = tempo;
        }
    }

    //Inserta al final de la lista
    public void InsertaFinal(Object ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = new NodosListaCircular(ElemInser);
            PrimerNodo.siguiente = PrimerNodo;
        } else {
            NodosListaCircular aux = PrimerNodo;
            while (aux.siguiente != PrimerNodo) {
                aux = aux.siguiente;
            }
            NodosListaCircular tempo = new NodosListaCircular(ElemInser);
            aux.siguiente = tempo;
            tempo.siguiente = PrimerNodo;
        }
    }

    //Inserta elemento en posicion dada
    public void InsertaMedio(Object ElemInser, int Posicion) {
        if (VaciaLista()) {
            PrimerNodo = new NodosListaCircular(ElemInser);
            PrimerNodo.siguiente = PrimerNodo;
        } else {
            if (Posicion <= 1) {
                NodosListaCircular Nuevo = new NodosListaCircular(ElemInser);
                Nuevo.siguiente = PrimerNodo;
                PrimerNodo = Nuevo;
            } else {
                NodosListaCircular Aux = PrimerNodo;
                int i = 2;
                while ((i != Posicion) & (Aux.siguiente != PrimerNodo)) {
                    i++;
                    Aux = Aux.siguiente;
                }
                NodosListaCircular Nuevo = new NodosListaCircular(ElemInser);
                Nuevo.siguiente = Aux.siguiente;
                Aux.siguiente = Nuevo;
            }
        }
    }

    //Elimina al Inicio
    public void EliminaInicio() {
        if (VaciaLista()) {
            System.out.println("No hay elementos");
        } else {
            NodosListaCircular aux = PrimerNodo;
            while (aux.siguiente != PrimerNodo) {
                aux = aux.siguiente;
            }
            PrimerNodo = PrimerNodo.siguiente;
            aux.siguiente = PrimerNodo;
        }
    }

    //Elimina al Final
    public void EliminaFinal() {
        if (VaciaLista()) {
            System.out.println("No hay elementos");
        } else {
            NodosListaCircular aux = PrimerNodo;
            NodosListaCircular ac = null;
            if (PrimerNodo == PrimerNodo.siguiente) {
                PrimerNodo = null;
            } else {
                while (aux.siguiente != PrimerNodo) {
                    ac = aux;
                    aux = aux.siguiente;
                }
                ac.siguiente = PrimerNodo;
            }
        }
    }

    //Retorna si un elemento es miembro
    public boolean Miembro(Object ele) {
        boolean enc = false;
        if (!VaciaLista()) {
            NodosListaCircular aux = PrimerNodo.siguiente;
            if (ele.equals(PrimerNodo.datos)) {
                enc = true;
            } else {
                while ((aux != PrimerNodo) && (enc == false)) {
                    if (ele.equals(aux.datos)) {
                        enc = true;
                    } else {
                        aux = aux.siguiente;
                    }
                }
            }
        }
        return enc;
    }

}
