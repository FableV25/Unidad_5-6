/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_unidad3;

/**
 *
 * @author Juana García
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Leaf {

    private String name;
    private Leaf parent;
//array de hijos
    public ArrayList<Leaf> children = null;
//constructor por defecto
//un hijo tiene un nombre y un padre

    public Leaf(String name, Leaf parent) {
        this.name = name;
        this.parent = parent;
        children = new ArrayList<Leaf>();
    }

    //se da el nombre
    public String getName() {
        return name;
    }
//se cambia el nombre

    public void setName(String name) {
        this.name = name;
    }
//se da el padre

    public Leaf getParent() {
        return parent;
    }
//se cambia el nombre del padre

    public void setParent(Leaf parent) {
        this.parent = parent;
    }
//se da la lista de los nombres de los hijos

    public ArrayList<String> getChildren2() {
//se crea una nueva lista con los nombres de los hijos
        ArrayList<String> aux = new ArrayList<String>();
        if (!name.equals("RootNode")) {
            aux.add((String) name);
        }
        if (children == null) {
            return aux;
        } else {
//se crea un iterador para poder ir recorriendo todos los 
//elementos del array
            Iterator pi = children.iterator();
//mientras que ese nodo tenga hijos se pasa al siguiente 
            while (pi.hasNext()) {
// se recorren los hijos que tenga
                ArrayList<String> aux2 = ((Leaf) pi.next()).getChildren2();
//se vuelve a recorrer esa lista
                Iterator pi2 = aux2.iterator();
                while (pi2.hasNext()) {
                    aux.add((String) pi2.next());
                }
            }
            return aux;
        }
    }
//se da la lista de hijos

    public ArrayList<Leaf> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Leaf> children) {
        this.children = children;
    }
//se inserta un hijo en el nodo que se le pasa

    public void insertChild(Leaf node) {
// si este hijo no contiene el nodo que se le está pasando se le 
//añade en la siguiente línea
        if (!this.children.contains(node)) {
            this.children.add(node);
        }
    }
    //se recorre por filas hijo a hijo

    public int rowofChild(Leaf node) {
        int row = 0;
        while (node.name != "RootNode") {
            row += 1;
            node = node.parent;
        }
        return row;
    }
//se da la cantidad de hijos que tiene un nodo

    public int ContainsNode(Leaf node) {
        for (int i = 0; i < this.children.size(); i++) {
//se compara si el nombre de ese hijo es igual al nombre 
//del nodo que te pasa
            if (this.children.get(i).getName().equals(node.getName())) {
                return i;
            }
        }
        return -1;
    }
}
