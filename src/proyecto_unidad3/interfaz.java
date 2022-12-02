/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_unidad3;

import java.awt.Image;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class interfaz extends javax.swing.JFrame {

    List<String> miLista = new ArrayList<>();//Se declara una lista simple
    Vector<String> vectorLista = new Vector<>();//Declaración de un vector, el cual difiere de Lista, sin embargo, Java lo tomo como obsoleto ya que puede ser reemplazado con ArrayList
    Queue<String> miCola = new LinkedList<>();//Declaración de una cola simple
    AbstractQueue<String> abstractCola = new LinkedBlockingQueue<>();//Declaración de una Cola Abstracta, la cual difiere de cola, sin embargo, no permite elementos de tipo nulo
    Stack<String> miPila = new Stack<>();//Declaración de una pila simple
    Deque<String> deque = new ArrayDeque<>();//Declaración de una cola de dos extremos, la cual es una combinación entre una pila y una cola, ya que comparte métodos de las dos clases.
    String[] arreglo = {"Al inicio", "En medio", "Al final"};
    String opcion = "Selección la posición en la cual se ubicará el elemento.";

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setImageLabel(image, "src/Imagenes/LOGO.jpg");
        bg.add(pilas);
        bg.add(colas);
        bg.add(listas);
        bg.add(vector);
        bg.add(cola2);
        bg.add(deq);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        listas = new javax.swing.JRadioButton();
        colas = new javax.swing.JRadioButton();
        pilas = new javax.swing.JRadioButton();
        vector = new javax.swing.JRadioButton();
        cola2 = new javax.swing.JRadioButton();
        deq = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        lista = new javax.swing.JLabel();
        lbldes = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aq.png"))); // NOI18N
        image.setText("jLabel2");
        image.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresa el elemento que quieras añadir");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        listas.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        listas.setText("Listas");
        listas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listasActionPerformed(evt);
            }
        });

        colas.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        colas.setText("Colas");
        colas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colasActionPerformed(evt);
            }
        });

        pilas.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        pilas.setText("Pilas");
        pilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilasActionPerformed(evt);
            }
        });

        vector.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        vector.setText("Vector");
        vector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vectorActionPerformed(evt);
            }
        });

        cola2.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        cola2.setText("Cola abstracta");
        cola2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cola2ActionPerformed(evt);
            }
        });

        deq.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        deq.setText("Deque");
        deq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(listas))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(vector)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(colas))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cola2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pilas)
                    .addComponent(deq))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilas)
                    .addComponent(colas)
                    .addComponent(listas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deq)
                    .addComponent(cola2)
                    .addComponent(vector))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lista.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 14)); // NOI18N
        lista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lista.setText("Aquí se mostrará la cadena");
        lista.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lista)
                .addGap(39, 39, 39))
        );

        lbldes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        lbldes.setText("<html>Este programa prueba de manera práctica el uso de estrucutra de datos. Consiste en agregar un elemento cualquiera, el programa se encargará de colocarlo en las posiciones: inicio, en medio, o al final.<html>");
        lbldes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbldes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Concepto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 14))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbldes, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jMenu1.setText("Unidades");

        jMenuItem1.setText("UNIDAD 3");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("UNIDAD 4");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("UNIDAD 5 Y 6");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (listas.isSelected()) {
            try {
                switch (JOptionPane.showInputDialog(null, opcion,
                        "Clase", JOptionPane.PLAIN_MESSAGE, null, arreglo, arreglo[0]).toString()) {
                    case "Al inicio":
                        miLista.add(0, campo.getText());
                        break;
                    case "En medio":
                        miLista.add(miLista.size() / 2, campo.getText());
                        break;
                    case "Al final":
                        miLista.add(miLista.size(), campo.getText());
                        break;
                }
                lista.setText(miLista.toString());
            } catch (Exception e) {

            }

        } else if (colas.isSelected()) {
            try {
                switch (JOptionPane.showInputDialog(null, opcion,
                        "Clase", JOptionPane.PLAIN_MESSAGE, null, arreglo, arreglo[0]).toString()) {
                    case "Al inicio":
                        miCola.add(campo.getText());
                        int ni = miCola.size() - 1;
                        for (int i = 0; i < ni; i++) {
                            miCola.add(miCola.peek());
                            miCola.remove();
                        }
                        break;
                    case "En medio":
                        int ne = 0;
                        String[] guardar = new String[20];
                        int tamaño = miCola.size() / 2;
                        for (int i = 0; i < tamaño; i++) {
                            guardar[i] = miCola.peek();
                            miCola.remove();
                            ne++;
                        }
                        miCola.add(campo.getText());
                        int tamaño2 = miCola.size();
                        for (int i = 0; i < tamaño2 - 1; i++) {
                            miCola.add(miCola.peek());
                            miCola.remove();
                        }
                        for (int i = 0; i < ne; i++) {
                            miCola.add(guardar[i]);
                        }
                        for (int i = 0; i < tamaño2; i++) {
                            miCola.add(miCola.peek());
                            miCola.remove();
                        }
                        break;
                    case "Al final":
                        miCola.add(campo.getText());
                        break;
                }
                lista.setText(miCola.toString());
            } catch (Exception e) {

            }
        } else if (pilas.isSelected()) {
            try {
                switch (JOptionPane.showInputDialog(null, opcion,
                        "Clase", JOptionPane.PLAIN_MESSAGE, null, arreglo, arreglo[0]).toString()) {
                    case "Al inicio":
                        miPila.add(0, campo.getText());
                        break;
                    case "En medio":
                        miPila.add(miPila.size() / 2, campo.getText());
                        break;
                    case "Al final":
                        miPila.add(miPila.size(), campo.getText());
                        break;
                }
                lista.setText(miPila.toString());
            } catch (Exception e) {

            }
        } else if (vector.isSelected()) {
            try {
                switch (JOptionPane.showInputDialog(null, opcion,
                        "Clase", JOptionPane.PLAIN_MESSAGE, null, arreglo, arreglo[0]).toString()) {
                    case "Al inicio":
                        vectorLista.add(0, campo.getText());
                        break;
                    case "En medio":
                        vectorLista.add(vectorLista.size() / 2, campo.getText());
                        break;
                    case "Al final":
                        vectorLista.add(vectorLista.size(), campo.getText());
                        break;
                }
                lista.setText(vectorLista.toString());
            } catch (Exception e) {

            }
        } else if (cola2.isSelected()) {
            try {
                switch (JOptionPane.showInputDialog(null, opcion,
                        "Clase", JOptionPane.PLAIN_MESSAGE, null, arreglo, arreglo[0]).toString()) {
                    case "Al inicio":
                        String[] guardar = new String[abstractCola.size()];
                        int n = abstractCola.size();
                        for (int i = 0; i < n; i++) {
                            guardar[i] = abstractCola.peek();
                            abstractCola.remove();
                        }
                        abstractCola.add(campo.getText());
                        int n2 = guardar.length;
                        for (int i = 0; i < n2; i++) {
                            abstractCola.add(guardar[i]);
                        }
                        break;
                    case "En medio":
                        int ne = 0;
                        String[] guardar2 = new String[50];
                        int tamaño = abstractCola.size() / 2;
                        for (int i = 0; i < tamaño; i++) {
                            guardar2[i] = abstractCola.peek();
                            abstractCola.remove();
                            ne++;
                        }
                        abstractCola.add(campo.getText());
                        int tamaño2 = abstractCola.size();
                        for (int i = 0; i < tamaño2 - 1; i++) {
                            abstractCola.add(abstractCola.peek());
                            abstractCola.remove();
                        }
                        for (int i = 0; i < ne; i++) {
                            abstractCola.add(guardar2[i]);
                        }
                        for (int i = 0; i < tamaño2; i++) {
                            abstractCola.add(abstractCola.peek());
                            abstractCola.remove();
                        }
                        break;
                    case "Al final":
                        abstractCola.add(campo.getText());
                        break;
                }
                lista.setText(abstractCola.toString());
            } catch (Exception e) {

            }
        } else if (deq.isSelected()) {
            try {
                switch (JOptionPane.showInputDialog(null, opcion,
                        "Clase", JOptionPane.PLAIN_MESSAGE, null, arreglo, arreglo[0]).toString()) {
                    case "Al inicio":
                        deque.addFirst(campo.getText());
                        break;
                    case "En medio":
                        Deque<String> deque2 = new ArrayDeque<>();
                        int tamaño = deque.size() / 2;
                        for (int i = 0; i < tamaño; i++) {
                            deque2.add(deque.pollLast());
                        }
                        deque.add(campo.getText());
                        int tamaño2 = deque2.size();
                        for (int i = 0; i < tamaño2; i++) {
                            deque.add(deque2.pollLast());
                        }
                        break;
                    case "Al final":
                        deque.addLast(campo.getText());
                        break;
                }
                lista.setText(deque.toString());
            } catch (Exception e) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una opción", "Error", JOptionPane.ERROR_MESSAGE);
        }
        campo.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void vectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vectorActionPerformed
        setImageLabel(image, "src/Imagenes/vector.png");
        lbldes.setText("<html>Un Vector guarda objetos (referencias) de cualquier tipo y crece dinámicamente, sin necesidad de tener que programar operaciones adicionales. El array donde almacena los elementos es de tipo Object.<html>");

    }//GEN-LAST:event_vectorActionPerformed

    private void listasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listasActionPerformed
        setImageLabel(image, "src/Imagenes/lista.png");
        lbldes.setText("<html>Una lista es una secuencia de elementos dispuesto en un cierto orden, en la que cada elemento tiene como mucho un predecesor y un sucesor. El número de elementos de la lista no suele estar fijado, ni suele estar limitado por anticipado.<html>");

    }//GEN-LAST:event_listasActionPerformed

    private void colasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colasActionPerformed
        setImageLabel(image, "src/Imagenes/cola.png");
        lbldes.setText("<html>Una cola es una estructura de datos lineal o una colección en Java que almacena elementos en un orden FIFO (primero en entrar, primero en salir). La colección de la cola tiene dos extremos, es decir, delantero y trasero. Los elementos se agregan en la parte trasera y se eliminan por la parte delantera.<html>");

    }//GEN-LAST:event_colasActionPerformed

    private void pilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilasActionPerformed
        setImageLabel(image, "src/Imagenes/stack.jpg");
        lbldes.setText("<html>Una pila es una estructura que nos permite apilar elementos y recopilarlos en el orden inverso al cual los apilamos mediante operaciones de desapilar. Esto es lo que se conoce como estructuras LIFO (Last In First Out).<html>");

    }//GEN-LAST:event_pilasActionPerformed

    private void cola2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cola2ActionPerformed
        setImageLabel(image, "src/Imagenes/aq.png");
        lbldes.setText("<html>La clase AbstractQueue en Java proporciona implementaciones esqueléticas de algunas operaciones de cola, arrojan excepciones en lugar de indicar un error mediante devoluciones falsas o nulas. <html>");
    }//GEN-LAST:event_cola2ActionPerformed

    private void deqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deqActionPerformed
        setImageLabel(image, "src/Imagenes/deque.png");
        lbldes.setText("<html>La interfaz Deque está relacionada con la cola de dos extremos que admite la adición o eliminación de elementos de cualquier extremo de la estructura de datos. Puede usarse como una cola (primero en entrar , primero en salir / FIFO) o como una pila (último en entrar, primero en salir / LIFO) .<html>");
    }//GEN-LAST:event_deqActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        interfaz v1 = new interfaz();
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        GUI v2 = new GUI();
        v2.ejecutar();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        unidad5y6 v3 = new unidad5y6();
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    private void setImageLabel(JLabel label, String ruta) {
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JTextField campo;
    private javax.swing.JRadioButton cola2;
    private javax.swing.JRadioButton colas;
    private javax.swing.JRadioButton deq;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbldes;
    private javax.swing.JLabel lista;
    private javax.swing.JRadioButton listas;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton pilas;
    private javax.swing.JRadioButton vector;
    // End of variables declaration//GEN-END:variables
}
