/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.jtabla;

/**
 *
 * @author adam
 */
public class DatosPasaje extends javax.swing.JPanel {

    /**
     * Creates new form DatosPasaje
     */
    public DatosPasaje() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosPasaje = new javax.swing.JPanel();
        comboFecha = new javax.swing.JComboBox<>();
        comboHorario = new javax.swing.JComboBox<>();
        lblComboFecha = new javax.swing.JLabel();
        lblComboHorario = new javax.swing.JLabel();
        jdFechaViaje = new com.toedter.calendar.JDateChooser();
        comboHoraViaje = new javax.swing.JComboBox<>();
        txtAsiento = new javax.swing.JTextField();
        lblAsiento = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblDatosPasaje = new javax.swing.JLabel();

        panelDatosPasaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblComboFecha.setText("comboFecha");

        lblComboHorario.setText("comboHorario");

        lblAsiento.setText("Asiento");

        lblPrecio.setText("Precio");

        lblDatosPasaje.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lblDatosPasaje.setText("Datos Pasaje");

        javax.swing.GroupLayout panelDatosPasajeLayout = new javax.swing.GroupLayout(panelDatosPasaje);
        panelDatosPasaje.setLayout(panelDatosPasajeLayout);
        panelDatosPasajeLayout.setHorizontalGroup(
            panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPasajeLayout.createSequentialGroup()
                .addGroup(panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosPasajeLayout.createSequentialGroup()
                        .addGroup(panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelDatosPasajeLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblComboFecha)
                                .addGap(78, 78, 78)
                                .addComponent(lblComboHorario)
                                .addGap(13, 13, 13))
                            .addGroup(panelDatosPasajeLayout.createSequentialGroup()
                                .addGroup(panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDatosPasajeLayout.createSequentialGroup()
                                        .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosPasajeLayout.createSequentialGroup()
                                        .addComponent(jdFechaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)))
                                .addGroup(panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboHorario, 0, 112, Short.MAX_VALUE)
                                    .addComponent(comboHoraViaje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosPasajeLayout.createSequentialGroup()
                                .addComponent(txtAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosPasajeLayout.createSequentialGroup()
                                .addComponent(lblAsiento)
                                .addGap(39, 39, 39)
                                .addComponent(lblPrecio))))
                    .addGroup(panelDatosPasajeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDatosPasaje)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelDatosPasajeLayout.setVerticalGroup(
            panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPasajeLayout.createSequentialGroup()
                .addComponent(lblDatosPasaje)
                .addGap(27, 27, 27)
                .addGroup(panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComboHorario)
                    .addComponent(lblComboFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsiento)
                    .addComponent(lblPrecio))
                .addGap(11, 11, 11)
                .addGroup(panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFechaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboHoraViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboFecha;
    private javax.swing.JComboBox<String> comboHoraViaje;
    private javax.swing.JComboBox<String> comboHorario;
    private com.toedter.calendar.JDateChooser jdFechaViaje;
    private javax.swing.JLabel lblAsiento;
    private javax.swing.JLabel lblComboFecha;
    private javax.swing.JLabel lblComboHorario;
    private javax.swing.JLabel lblDatosPasaje;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel panelDatosPasaje;
    private javax.swing.JTextField txtAsiento;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
