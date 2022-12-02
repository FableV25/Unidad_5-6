/*
Se crea java class  Hoja 
 */
package proyecto_unidad3;

/**
 *
 * @author Juana García
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String child = null;
        String parent = null;
        String node = null;
//las opciones pueden se añadir,guardar,imprimir y salir
        String command = null;
        System.out.println("Bienvenido\n\n");
        Tree tree = new Tree();
        Leaf root = tree.sendRootNode();
        do {
            System.out.println("Introduce el comando(añadir, eliminar, imprimir, guardar, salir : ");
            command = GUI.readString();
            if (command.equals("añadir")) {
                System.out.println("Inserta el nombre del hijo: "
                );
                child = GUI.readString();
                System.out.println("Inserta el nombre del padre: "
                );
                parent = GUI.readString();
//si el archivo readText.txt esta vacio
                if (parent.equals("null")) {
//se inserta nuevo hijo
                    root.insertChild(new Leaf(child, root));
                    tree.setControl(true);
//si el archivo readText.txt no está vacío el 
//programa ha de buscar al padre e insertar al hijo
                } else {
                    root = tree.addNewChild(child, parent, root);
                }
                if (tree.isControl()) {
                    System.out.println("El nodo ha sido añadido satisfactoriamente ...");
                    tree.setControl(false);
                } else {
                    System.out.println("El padre no ha sido encontrado !!!");
                }
            } else if (command.equals("imprimir")) {
// se va a la primera línea
                tree.getTextFile().setLength(0);
                tree.getFirstFile().setLength(0);
                tree.printChildren(root, false);
            } else if (command.equals("guardar")) {
                tree.getTextFile().setLength(0);
                tree.getFirstFile().setLength(0);
                tree.printChildren(root, true);
//se escribe el árbol estructura en el archivo 
//out.txt
                tree.saveTreeStructureToFile(root, "out.txt",
                        tree.getTextFile());
//se escribe el árbol estructura en el archivo 
//readText.txt
                tree.saveTreeStructureToFile(root, "readText.txt",
                        tree.getFirstFile());
            } else if (command.equals("eliminar")) {
                System.out.println("Inserta el nombre del nodo a borrar: ");
                node = GUI.readString();
                tree.removeChild(node, root);
                if (tree.isControl()) {
                    System.out.println("El nodo ha sido eliminado ...");
                    tree.setControl(false);
                } else {
                    System.out.println("El nodo no ha sido encontrado  !!!");
                }
            }
        } while ((!command.equals("salir")) && (!command.equals("" + "")));
        System.out.println("El programa ha sido cerrado. Vuelva a ejcutarlo");
    }//cierra do
}
