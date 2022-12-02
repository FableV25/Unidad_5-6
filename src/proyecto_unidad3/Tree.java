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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class Tree {
    // se controla si el usuario usa un padre que ya existe

    private boolean control;
// se escribe la estructura árbol en el archivo out.txt
    private StringBuffer textFile = new StringBuffer();
// se escribe la estructura árbol en el archivo readText.txt
    private StringBuffer firstFile = new StringBuffer();
//constructor por defecto

    public Tree() {
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }
//se da el archivo out.txt

    public StringBuffer getTextFile() {
        return textFile;
    }
//se da el archivo read.txt

    public StringBuffer getFirstFile() {
        return firstFile;
    }

    public Leaf addNewChild(String childName, String parentName, Leaf rootNode) {
//se da el número de hijos de ese nodo
        for (int i = 0; i < rootNode.getChildren().size(); i++) {
//se recorren todo los hijos de esa hoja y en la posición
//en la que este en ese momento será el padre
            Leaf parentNode = rootNode.getChildren().get(i);
//se comparan los nombres
            if (parentNode.getName().equals(parentName)) {
// si es el nombre que el programa está buscando, 
//inserta el nodo
                parentNode.insertChild(new Leaf(childName,
                        parentNode));
// se encuentra un nodo con el mismo nombre que el 
//usuario ha introducido
                control = true;
// en el caso de que el usuario ponga más de un nodo 
//con el mismo nombre,el programa solo añade el hijo 
//en el primer nodo. Otra posibilidad es quitar el 
//"break" y el programa añade el nuevo hijo a todos 
//los padres con el mismo nombre.
                break;
            }
//si el nodo tiene hijos, el programa llama al método 
//recursivo
            if (parentNode.getChildren().size() != 0) {
                addNewChild(childName, parentName, parentNode);
            }
        }
        return rootNode;
    }
// método que elimina el nombre de nodo que se le pasa

    public void removeChild(String Node, Leaf rootNode) {
//se da el número de hijos de este subárbol
        for (int i = 0; i < rootNode.getChildren().size(); i++) {
//se recorre uno a uno los nodos del árbol
            Leaf parentNode = rootNode.getChildren().get(i);
// se comparan los nombres
            if (parentNode.getName().equals(Node)) {
// si es el nombre que el programa está buscando, 
//elimina el nodo 
                rootNode.getChildren().remove(i);
// se encuentra un nodo con el mismo nombre que el 
//usuario ha introducido
                control = true;
                break;
            }
//llamada al método recursivo
            removeChild(Node, parentNode);
        }//cierra for
    }//cierra removeChild()
//este método visualiza el árbol

    public void printChildren(Leaf rootNode, Boolean command) {
        String tab = "";
        for (int i = 0; i < rootNode.getChildren().size(); i++) {
            tab = "";
//con este bucle se puede ver la cantidad de nivel de 
//profundidad que hay.
            for (int j = 0; j < rootNode.rowofChild(rootNode); j++) {
//el programa añade una nueva tabulación para cada 
//nivel
                tab += '\t';
            }
            String str = tab + rootNode.getChildren().get(i).getName();
//si command es “true” actualiza el búfer que luego se 
//utiliza para imprimir el archivo out.txt
            if (command) {
//el programa añade las líneas al búfer que escribe 
//el árbol
                textFile.append(str + " "
                        + System.getProperty("line.separator"));
//si command es “false” el programa actualiza el búfer que 
//más tarde muestra el árbol
            } else {
                System.out.println(str);
            }
//si el nodo tiene hijos, el programa llama de nuevo al 
//metodo recursivo
            if (rootNode.getChildren().get(i).getChildren().size() != 0) {

                printChildren(rootNode.getChildren().get(i),
                        command);
            } else {
// el programa obtiene la línea para añadir en el 
//búfer del archivo readText.txt
                firstFile.append(setLineOfFirstFile(rootNode.
                        getChildren().get(i))
                        + System.getProperty("line.separator"));
            }
        }//cierra for
    }//cierra metodo printChildren()
// método para ir guardando en el archivo de texto el árbol

    public void saveTreeStructureToFile(Leaf rootNode, String filename,
            StringBuffer strBuffer) {
        try {
            //se crea el archivo 
            FileWriter fstream = new FileWriter(filename);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(strBuffer.toString());
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
//se obtiene la línea que se añade en el archivo readText.txt con los 
//predecesores del nodo

    public String setLineOfFirstFile(Leaf node) {
        String line = "";
//se crea un objeto ArrayList
        ArrayList<String> lineList = new ArrayList<String>();
//se continua mientras el bucle no obtenga todos los predecesores
        while (node.getName() != "RootNode") {
            lineList.add(node.getName());
            node = node.getParent();
        }
//el bucle obtiene los nombres de los nodos desde el último hasta 
//el primero. Es necesario invertirlo.
        Collections.reverse(lineList);
        for (int i = 0; i < lineList.size(); i++) {
            line += lineList.get(i) + ",";
        }
//se coge la línea sin la última coma
        return line.substring(0, line.length() - 1);
    }
//se devuelve la hoja raíz

    public Leaf sendRootNode() {
        File file = new File("readText.txt");
        BufferedReader reader = null;
//se crea una nueva hoja, que será la raíz
        Leaf root = new Leaf("RootNode", null);

//se hace una copia para ejecutar el árbol
        Leaf broot = root;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            // se repite hasta que todas las líneas son leídas
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                for (int i = 0; i < fields.length; i++) {
//se crea una nueva hoja
                    Leaf leaf = new Leaf(fields[i], broot);
                    //containsIndex = obtiene el índice de la 
//hoja hijo
                    int containsIndex = broot.ContainsNode(leaf);
                    //se comprueba si el padre contiene esta hoja
                    if (containsIndex != -1) {
                        //si el padre contiene este hijo, a
//continuación se busca la fila de ese 
//hijo, y temporalmente hace que sea la 
//nueva raíz 
                        broot
                                = broot.getChildren().get(containsIndex);
                    } else {
//si el padre no contiene esta hoja, 
//entonces se añade esta hoja como hijo 
//de este padre
                        broot.insertChild(leaf);
//esta hoja es el nuevo padre
                        broot = leaf;

                    }
                }//cierra for
//para la nueva línea del archivo, se comienza desde 
//el principio a hacer el mismo proceso
                broot = root;

            }//cierra while
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no ha sido encontrado");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }//cierra primer try
        return root;
    }//cierra método
}//cierra clase

