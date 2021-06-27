/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vgc;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila
 */
public class Ventas extends javax.swing.JFrame {

    
    ArrayList<Figura> figuras;
    ArrayList<String> franquicias;
     ArrayList<Figura> ventas;
    public Ventas(ArrayList<Figura> f,ArrayList<String> fr) {
         ventas= new ArrayList<Figura>(); 
        figuras=f;
        franquicias=fr;
        initComponents();
        franquiciaB.addItem("Seleccione una franquicia");
        mostrarLista();
        nombreB.setEnabled(false);
        precioB.setEnabled(false);
        descripcionB.setEnabled(false);
        cantidadB.setEnabled(false);
        agregarB.setEnabled(false);
        quitarB.setEnabled(false);
        modificarB.setEnabled(false);
        jButton1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        franquiciaB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        nombreB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        precioB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionB = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cantidadB = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        totalL = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        agregarB = new javax.swing.JButton();
        quitarB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cantidadDisponibleL = new javax.swing.JLabel();
        modificarB = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        franquiciaB.setToolTipText("");
        franquiciaB.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                franquiciaBCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        franquiciaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                franquiciaBActionPerformed(evt);
            }
        });

        jLabel1.setText("Franquicia");

        nombreB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreBActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        descripcionB.setColumns(20);
        descripcionB.setRows(5);
        jScrollPane1.setViewportView(descripcionB);

        jLabel4.setText("Descripcion:");

        jLabel5.setText("Cantidad a comprar");

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel7.setText("Ventas");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Nombre", "Cantidad", "Subtotales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setText("Total:");

        totalL.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        totalL.setText("0.00");

        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Finalizar Compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        agregarB.setText("Agregar a la compra");
        agregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBActionPerformed(evt);
            }
        });

        quitarB.setText("Quitar");
        quitarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarBActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad Maxima Disponible: ");

        cantidadDisponibleL.setText("0");

        modificarB.setText("Modificar");
        modificarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(208, 208, 208)
                                .addComponent(jButton4))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(franquiciaB, 0, 184, Short.MAX_VALUE)
                                    .addComponent(nombreB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(cantidadB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cantidadDisponibleL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(quitarB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(modificarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(agregarB)))))
                                .addGap(0, 76, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(69, 69, 69)
                                .addComponent(totalL)))))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jButton4))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(precioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(franquiciaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(agregarB)
                        .addGap(18, 18, 18)
                        .addComponent(modificarB)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cantidadB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cantidadDisponibleL))
                        .addGap(7, 7, 7)))
                .addComponent(quitarB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu menu= new Menu(figuras,franquicias);
        menu.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<ventas.size();i++){
            for(int j=0;j<figuras.size();j++){
                Figura tem=figuras.get(i);
                String nombre = tem.getNombre();
                String franquicia=tem.getFranquicia();
                if(nombre.equals(ventas.get(i).getNombre())& franquicia.equals(ventas.get(i).getFranquicia())){
                  tem.cambiarExistencia(ventas.get(i).getExistencias());
                  
                }
            }
                
         }
        ventas.clear();
        limpiar();
        String matriz[][]= new String [4][4];
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
               new String [] {
                   "#", "Nombre", "Cantidad", "Subtotales"
               }
        ));
         JOptionPane.showMessageDialog(null, "Venta Realizada con exito");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void franquiciaBCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_franquiciaBCaretPositionChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_franquiciaBCaretPositionChanged

    private void agregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBActionPerformed
        // TODO add your handling code here:
        
        int cantidad= (Integer) cantidadB.getValue();
        int cantidadMaxima = Integer.parseInt(cantidadDisponibleL.getText());
        if(cantidadMaxima>=cantidad & cantidad>0){
            String nombre=nombreB.getSelectedItem().toString();
            double precio = Double.parseDouble(precioB.getText());
            String franquicia= franquiciaB.getSelectedItem().toString();
            boolean previo=true;
            for(int i=0;i<ventas.size();i++){
                if(nombre.equals(ventas.get(i).getNombre())& franquicia.equals(ventas.get(i).getFranquicia())){
                  previo=false;
                  if((ventas.get(i).getExistencias()+cantidad)<=cantidadMaxima){
                      ventas.get(i).setExistencias(ventas.get(i).getExistencias()+cantidad);
                  }else{
                      JOptionPane.showMessageDialog(null, "No hau suficientes existencias");
                  }
                }
            }
            if(previo){
                Figura nueva= new Figura(franquicia, nombre, descripcionB.getText(), precio, cantidad);
                ventas.add(nueva);
                jButton1.setEnabled(true);
            }
            actualizarVenta();
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Error en la cantidad no hay suficientes existencias o el numero no es valido.");
        }
        
        
    }//GEN-LAST:event_agregarBActionPerformed

    private void franquiciaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_franquiciaBActionPerformed
        // TODO add your handling code here:
        
        String opcion= franquiciaB.getSelectedItem().toString();
        //nombreB.removeAllItems();
        int itemCount = nombreB.getItemCount();

        for(int i=itemCount-1;i>0;i--){
            nombreB.removeItemAt(i);
         }
        nombreB.addItem("Figura");
         for(int i=0; i<figuras.size();i++){
             if(opcion.equals(figuras.get(i).getFranquicia())){
                 nombreB.addItem(figuras.get(i).getNombre());
             }
         }
         nombreB.setEnabled(true);
    }//GEN-LAST:event_franquiciaBActionPerformed

    private void nombreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreBActionPerformed
        // TODO add your handling code here:
         String nombre= nombreB.getSelectedItem().toString();
         for(int i=0; i<figuras.size();i++){
             if(nombre.equals(figuras.get(i).getNombre())){
                Figura tem = figuras.get(i);
                String descripcion=tem.getDescripcion();
                String precio=Double.toString(tem.getPrecio()) ;
                int cantDisponible= tem.getExistencias();
                descripcionB.setText(descripcion);
                precioB.setText(precio);
                cantidadDisponibleL.setText(Integer.toString(cantDisponible));
                if(cantDisponible>1){
                    cantidadB.setEnabled(true);
                    cantidadB.setValue(0);
                    agregarB.setEnabled(true);
                }
             }
         }
    }//GEN-LAST:event_nombreBActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)tabla.getModel();
        int selected=tabla.getSelectedRow();
        Figura tem= ventas.get(selected);
        String franquicia=tem.getFranquicia();
        String descripcion=tem.getDescripcion();
        String nombre=tem.getNombre();
        String precio=Double.toString(tem.getPrecio()) ;
        int cantDisponible= tem.getExistencias();
        franquiciaB.getModel().setSelectedItem(franquicia);
        nombreB.getModel().setSelectedItem(nombre);
        descripcionB.setText(descripcion);
        precioB.setText(precio);
        cantidadDisponibleL.setText(Integer.toString(cantDisponible));
        cantidadB.setValue(cantDisponible);
        agregarB.setEnabled(false);
        modificarB.setEnabled(true);
        quitarB.setEnabled(true);
    }//GEN-LAST:event_tablaMouseClicked

    private void modificarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBActionPerformed
        // TODO add your handling code here:
        int cantidad= (Integer) cantidadB.getValue();
        int cantidadMaxima = Integer.parseInt(cantidadDisponibleL.getText());
        if(cantidadMaxima>=cantidad & cantidad>0){
            String nombre=nombreB.getSelectedItem().toString();
            double precio = Double.parseDouble(precioB.getText());
            String franquicia= franquiciaB.getSelectedItem().toString();
            boolean previo=true;
            for(int i=0;i<ventas.size();i++){
                if(nombre.equals(ventas.get(i).getNombre())& franquicia.equals(ventas.get(i).getFranquicia())){
                  previo=false;
                  if(cantidad<=cantidadMaxima){
                      ventas.get(i).setExistencias(cantidad);
                  }else{
                      JOptionPane.showMessageDialog(null, "No hau suficientes existencias");
                  }
                  break;
                }
            }
            actualizarVenta();
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Error en la cantidad no hay suficientes existencias o el numero no es valido.");
        }
    }//GEN-LAST:event_modificarBActionPerformed

    private void quitarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarBActionPerformed
        // TODO add your handling code here:
        String nombre=nombreB.getSelectedItem().toString();
        String franquicia= franquiciaB.getSelectedItem().toString();
        int valor=0;
        for(int i=0;i<ventas.size();i++){
                if(nombre.equals(ventas.get(i).getNombre())& franquicia.equals(ventas.get(i).getFranquicia())){
                  valor=i;
                  break;
                }
        }
        ventas.remove(valor);
        if(ventas.size()==0){
            jButton1.setEnabled(false);
        }
         actualizarVenta();
         limpiar();
                
        
    }//GEN-LAST:event_quitarBActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarB;
    private javax.swing.JSpinner cantidadB;
    private javax.swing.JLabel cantidadDisponibleL;
    private javax.swing.JTextArea descripcionB;
    private javax.swing.JComboBox franquiciaB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificarB;
    private javax.swing.JComboBox nombreB;
    private javax.swing.JTextField precioB;
    private javax.swing.JButton quitarB;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel totalL;
    // End of variables declaration//GEN-END:variables

    private void mostrarLista() {
        for(int i=0;i<franquicias.size();i++){
           franquiciaB.addItem(franquicias.get(i));
        }
    }

    private void actualizarVenta() {
         //To change body of generated methods, choose Tools | Templates.
    double total=0;
    String matriz[][]= new String [ventas.size()][4];
           for (int i = 0; i < ventas.size(); i++) {
           double s=ventas.get(i).getExistencias()* ventas.get(i).getPrecio();
           String subtotal= Double.toString(s);
           total+=s;
           matriz [i][0]=Integer.toString(i+1);
           matriz [i][1]= ventas.get(i).getNombre();
           matriz [i][2] = Integer.toString(ventas.get(i).getExistencias());
           matriz [i][3]= subtotal;
           
           
       }
           tabla.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
               new String [] {
                   "#", "Nombre", "Cantidad", "Subtotales"
               }
           ));
        
        String res=Double.toString(total);
        totalL.setText(res);
        cantidadB.setValue(0);
    }

    private void limpiar() {
        franquiciaB.getModel().setSelectedItem("Seleccione una franquicia");
        nombreB.setEnabled(false);
        precioB.setEnabled(false);
        precioB.setText("");
        descripcionB.setEnabled(false);
        descripcionB.setText("");
        cantidadB.setEnabled(false);
        cantidadB.setValue(0);
        agregarB.setEnabled(false);
        quitarB.setEnabled(false);
        modificarB.setEnabled(false);
        cantidadDisponibleL.setText("0");
        
    }
    
   
  
    
  
}