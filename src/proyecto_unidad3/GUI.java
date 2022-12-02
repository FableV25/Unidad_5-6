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
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;
import java.io.IOException;
import javax.swing.tree.*;

public class GUI extends JFrame implements ActionListener {

    static String readString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JPanel principal, arbol, botones, h, pad, n;
    private JButton añadir, eliminar, guardar, imprimir, salir;
    private JFrame addHijo, clearNodo;
    private JButton add, clear;
    private JComboBox padres, nodos;//para crear un desplegable
    private JTextArea area;
    private JTextField hijo, nodo;
    private JLabel lh, lp, ln;
    int res;
    private String nombreH;
    private String nombreP;
    private String nombreN;
    private String command = null;
    private Tree tree;
    private Leaf root;
//constructor por defecto

    public GUI() {
        super("Árbol Genealógico ");
        initialize();
    }

    public void ejecutar() {
        GUI frame = new GUI();
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initialize() {
//se obtiene el contenedor asociado a la ventana
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
//se crean los paneles
        principal = new JPanel();
        arbol = new JPanel();
//se crea el bordeado del área de texto
        Box cuadro = Box.createHorizontalBox();
        area = new JTextArea(25, 50);
        area.setEditable(false);
        cuadro.add(new JScrollPane(area));
        arbol.add(cuadro);
//se crean los botones y se añaden a los escuchadores
        botones = new JPanel(new GridLayout(4, 1));
        añadir = new JButton("Añadir");
        añadir.addActionListener(this);
//guardar = new JButton("Guardar");
//guardar.addActionListener(this); 
        eliminar = new JButton("Eliminar");
        eliminar.addActionListener(this);
//imprimir = new JButton("Imprimir");
//imprimir.addActionListener(this); 
        salir = new JButton("Salir");
        salir.addActionListener(this);
        botones.add(añadir);
        botones.add(eliminar);
//botones.add(imprimir);
//botones.add(guardar);
        botones.add(salir);
        principal.add(arbol);
        principal.add(botones);
        c.add(principal);
        tree = new Tree();
        root = tree.sendRootNode();
    }//cierra método inicializa
//método añadir nodo

    public void añadir() {
        addHijo = new JFrame("Añadir Hijo");
        addHijo.setSize(350, 150);
        addHijo.setDefaultCloseOperation(addHijo.EXIT_ON_CLOSE);
        addHijo.setVisible(true);
        addHijo.setVisible(true);
        addHijo.setLayout(new GridLayout(3, 1));
        h = new JPanel();
        lh = new JLabel("Nombre Hijo");
        hijo = new JTextField(20);
        h.add(lh);
        h.add(hijo);
//Obtener los padres existentes 
//se coge un array con todos los nodos que cuelgan de la raíz
        ArrayList<String> p = root.getChildren2();
//se crea un iterador para poder ir recorriendo todos los 
//elementos del array
        Iterator pi = p.iterator();
        String[] ps = new String[p.size() + 1];
        ps[0] = "Root";
        int i = 1;
//se pasa al siguiente
        while (pi.hasNext()) {
            ps[i] = ((String) pi.next());
            i++;
        }
        pad = new JPanel();
        padres = new JComboBox(ps);
        lp = new JLabel("Nombre Padre");
        pad.add(lp);
        pad.add(padres);
        addHijo.add(h);
        addHijo.add(pad);
        add = new JButton("Añadir");
        add.addActionListener(this);
        addHijo.add(add);
    }
//método eliminar nodo

    public void eliminar() {
        clearNodo = new JFrame("Borrar nodo");
        clearNodo.setSize(350, 150);
        clearNodo.setDefaultCloseOperation(clearNodo.EXIT_ON_CLOSE);
        clearNodo.setVisible(true);
        clearNodo.setVisible(true);
        clearNodo.setLayout(new GridLayout(2, 1));
        n = new JPanel();
//se obtienen los padres existentes
//se coge un array con todos los nodos que cuelgan de la raíz
        ArrayList<String> p = root.getChildren2();
//se crea un iterador para poder ir recorriendo todos los 
//elementos del array
        Iterator pi = p.iterator();
        String[] ps = new String[p.size() + 1];
        ps[0] = "Root";
        int i = 1;
//se pasa al siguiente
        while (pi.hasNext()) {
            ps[i] = ((String) pi.next());
            i++;
        }
        nodos = new JComboBox(ps);
        ln = new JLabel("Nombre Nodo");
        n.add(ln);
        n.add(nodos);
        clearNodo.add(n);
        clear = new JButton("Clear");
        clear.addActionListener(this);
        clearNodo.add(clear);
    }
//método imprimir en la clase Tree.java

    public void crearArbol(Leaf root, Boolean command) {
        String tab = "";
        for (int i = 0; i < root.getChildren().size(); i++) {
            tab = "";
//con este bucle se puede ver la cantidad de nivel 
//de profundidad que hay.
            for (int j = 0; j < root.rowofChild(root); j++) {
//el programa añade una nueva tabulación para 
//cada nivel
                tab += '\t';
            }
            String str = tab
                    + root.getChildren().get(i).getName();
//si comando es “true” actualiza el búfer que luego 
//se utiliza para imprimir el archivo out.txt
            if (command) {
//el programa añade las líneas al búfer que 
//escribe el árbol
                tree.getTextFile().append(str + " "
                        + System.getProperty("line.separator"));
//si el comando es “false” el programa actualiza el 
//búfer que más tarde muestra el árbol
            } else {
//para que te muestre el árbol sin que se 
//pueda modificar
                area.append(str + "\n");
            }
//si el nodo tiene hijos, el programa llama de nuevo 
//al método recursivo
            if (root.getChildren().get(i).getChildren().size()
                    != 0) {
                crearArbol(root.getChildren().
                        get(i), command);
            } else {
//el programa obtiene la línea para añadir en el 
//búfer del archivo readText.txt
                tree.getFirstFile().append(tree.setLineOfFirstFile(root.getChildren().get(i))
                        + System.getProperty("line.separator"));
            }
        }//for
    }//cierra método crearArbol()

    public void guardar() {
        System.out.println("guardando");
        tree.getTextFile().setLength(0);
        tree.getFirstFile().setLength(0);
        tree.printChildren(root, true);
//se escribe el árbol estructura en el archivo out.txt
        tree.saveTreeStructureToFile(root, "out.txt",
                tree.getTextFile());
//se escribe el árbol estructura en el archivo readText.txt
        tree.saveTreeStructureToFile(root, "readText.txt",
                tree.getFirstFile());
    }

    public void salir() {
        interfaz v1 = new interfaz();
        v1.setVisible(true);
        this.dispose();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == añadir) {
            añadir();
        }
//este boton es el "OK" de la segunda ventana
        if (ae.getSource() == add) {
            nombreH = hijo.getText();
            nombreP = padres.getSelectedItem().toString();

            if (nombreP == "Root") {
                root.insertChild(new Leaf(nombreH, root));
            } else {
                root = tree.addNewChild(nombreH, nombreP, root);
            }

            guardar();
            crearArbol(root, false);
//cuando se pulsa el boton "OK" se guarda el hijo en 
//el padre seleccionado y se borra lo que
            //haya en la ventana para poder introducir un nuevo 
//hijo
            addHijo.dispose();
            JOptionPane.showMessageDialog(addHijo,"Elemento insertado correctamente ");
 
 }
 
 if (ae.getSource() == eliminar) {
            eliminar();
        }
//este boton es el "OK" de la segunda ventana
        if (ae.getSource() == clear) {

            nombreN = nodos.getSelectedItem().toString();
            tree.removeChild(nombreN, root);
            guardar();
            crearArbol(root, false);
//cuando se pulsa el boton "OK" se elimina el nodo 
//introducido y se borra lo que haya en la ventana para 
//poder introducir un nuevo nodo a eliminar
            clearNodo.dispose();
            JOptionPane.showMessageDialog(clearNodo,"Elemento eliminado correctamente");
 
 }
 
 /*
if (ae.getSource() == guardar){
guardar();//este boton se quitara de la interfaz
}
*/
 
 /*
if (ae.getSource() == imprimir){
//area.setText("Arbol Genealogico\n");
crearArbol(root,false);
}
*/
 
if (ae.getSource() == salir) {
            salir();//este boton se quitara de la interfaz
        }
    }//cierra metodo actionPerformed
}//cierra clas

