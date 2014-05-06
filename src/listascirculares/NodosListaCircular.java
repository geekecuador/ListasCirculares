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
public class NodosListaCircular {
    Object datos;
	NodosListaCircular siguiente;
	//Constructor crea un nodo de tipo Object
	NodosListaCircular(Object valor){
		datos=valor;
		siguiente=null;
	}
	//Constructor Crea un nodo de tipo Object y al siguiente nodo de la lista
	NodosListaCircular (Object valor,NodosListaCircular signodo){
		datos=valor;
		siguiente=signodo; //siguiente se refiere al siguiente nodo
	}
	//Retorna el dato que se encuentra en ese nodo
	Object getObject(){
		return datos;
	}
	//Retorna el siguiente nodo
	NodosListaCircular getnext(){
		return siguiente;
	}
}

