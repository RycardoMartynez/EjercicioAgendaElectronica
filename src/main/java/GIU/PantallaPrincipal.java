
package GIU;

public class PantallaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName());
        
        String[] dnis = new String[10];
        String[] nombres = new String[10];
        String[] apellidos = new String[10];
        String[] direcciones = new String[10];
        String[] telefonos = new String[10];
        String[] fechaDeNacimientos = new String[10];
        
    
    public PantallaPrincipal() {
        initComponents();
         
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtIndice = new javax.swing.JTextField();
        Borrar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("-----------------------------------------------------------------------------------------------------------------------------------");

        jLabel3.setText("----------------------------------------------------------------------------------------------------------------------------------");

        jLabel4.setText("DNI  :");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Apellido:");

        txtDNI.addActionListener(this::txtDNIActionPerformed);

        txtApellido.addActionListener(this::txtApellidoActionPerformed);

        jLabel7.setText("Direccion:");

        jLabel8.setText("Telefono:");

        jLabel9.setText("Fecha de Nacimiento:");

        txtDireccion.addActionListener(this::txtDireccionActionPerformed);

        txtFecha.addActionListener(this::txtFechaActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Agenda Electronica");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(this::btnSiguienteActionPerformed);

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(this::btnAnteriorActionPerformed);

        jLabel10.setText("Indice:");

        txtIndice.setEditable(false);
        txtIndice.setText("0");
        txtIndice.addActionListener(this::txtIndiceActionPerformed);

        Borrar.setActionCommand("Borrar");
        Borrar.setLabel("Borrar");
        Borrar.setName("Borrar"); // NOI18N
        Borrar.addActionListener(this::BorrarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido)
                                    .addComponent(txtNombre))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono)
                            .addComponent(txtDireccion)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel10)
                        .addGap(36, 36, 36)
                        .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnAnterior)
                        .addGap(115, 115, 115)
                        .addComponent(btnGuardar)
                        .addGap(140, 140, 140)
                        .addComponent(btnSiguiente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Borrar.getAccessibleContext().setAccessibleName("Borrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndiceActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // 1. Obtener el índice actual
        String indiceStr = txtIndice.getText();
        int indi = Integer.parseInt(indiceStr);

        // 2. Aumentar solo si no hemos llegado al límite (suponiendo 10 registros, del 0 al 9)
        if (indi>0) {
            indi--;
            txtIndice.setText(String.valueOf(indi));
            txtDNI.setText(dnis[indi]);
            txtNombre.setText(nombres[indi]);
            txtApellido.setText(apellidos[indi]);
            txtDireccion.setText(direcciones[indi]);
            txtTelefono.setText(telefonos[indi]);
            txtFecha.setText(fechaDeNacimientos[indi]);

            // 3. AQUÍ deberías llamar a una función que cargue los datos del nuevo índice
            // cargarDatos(indi);
        } else {
            txtIndice.setText("9");
            indiceStr = txtIndice.getText();
            indi = Integer.parseInt(indiceStr);
            txtDNI.setText(dnis[indi]);
            txtNombre.setText(nombres[indi]);
            txtApellido.setText(apellidos[indi]);
            txtDireccion.setText(direcciones[indi]);
            txtTelefono.setText(telefonos[indi]);
            txtFecha.setText(fechaDeNacimientos[indi]);
            // Opcional: Mandar un aviso de que ya es el último
            // JOptionPane.showMessageDialog(null, "Fin de la agenda");
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        // 1. Obtener el índice actual
        String indiceStr = txtIndice.getText();
        int indi = Integer.parseInt(indiceStr);

        // 2. Aumentar solo si no hemos llegado al límite (suponiendo 10 registros, del 0 al 9)
        if (indi < 9) {
            indi++;
            txtIndice.setText(String.valueOf(indi));

            // 3. AQUÍ deberías llamar a una función que cargue los datos del nuevo índice
            txtDNI.setText(dnis[indi]);
            txtNombre.setText(nombres[indi]);
            txtApellido.setText(apellidos[indi]);
            txtDireccion.setText(direcciones[indi]);
            txtTelefono.setText(telefonos[indi]);
            txtFecha.setText(fechaDeNacimientos[indi]);

        } else {
            txtIndice.setText("0");
            indiceStr = txtIndice.getText();
            indi = Integer.parseInt(indiceStr);
            txtDNI.setText(dnis[indi]);
            txtNombre.setText(nombres[indi]);
            txtApellido.setText(apellidos[indi]);
            txtDireccion.setText(direcciones[indi]);
            txtTelefono.setText(telefonos[indi]);
            txtFecha.setText(fechaDeNacimientos[indi]);

            // Opcional: Mandar un aviso de que ya es el último
            // JOptionPane.showMessageDialog(null, "Fin de la agenda");
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String indiceStr = txtIndice.getText();
        int indi = Integer.parseInt(indiceStr);
        dnis[indi]= txtDNI.getText();
        nombres[indi]= txtNombre.getText();
        apellidos[indi]= txtApellido.getText();
        direcciones[indi]= txtDireccion.getText();
        telefonos[indi]= txtTelefono.getText();
        fechaDeNacimientos[indi]= txtFecha.getText();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed

    }//GEN-LAST:event_txtDNIActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        String indiceStr = txtIndice.getText();
        int indi = Integer.parseInt(indiceStr);
        dnis[indi]= "";
        nombres[indi]= "";
        apellidos[indi]= "";
        direcciones[indi]= "";
        telefonos[indi]= "";
        fechaDeNacimientos[indi]= ""; 
        
        txtDNI.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtFecha.setText("");
        
    }//GEN-LAST:event_BorrarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Borrar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
