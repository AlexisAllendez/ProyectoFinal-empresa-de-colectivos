/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import EmpresaDeColectivo.Entidades.Ruta;
import accesoADatos.RutaData;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adam
 */
public class Rutas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
         public boolean isCellEditable(int row, int column) {
                return false;
        }
    };

    /**
     * Creates new form Rutas
     */
    public Rutas() {
        initComponents();
        ArrayList<String> columnas = new ArrayList<>();

        columnas.add("idRuta");
        columnas.add("origen");
        columnas.add("destino");
        columnas.add("duracion estimada");
        columnas.add("estado");

        armarJTable(columnas.toArray(String[]::new));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnModificarRuta = new javax.swing.JButton();
        btnEliminarRuta = new javax.swing.JButton();
        btnMostrarRutas = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jBModifi = new javax.swing.JButton();
        jBIInactivas = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jBDarAlta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDuracionHora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDuracionMin = new javax.swing.JTextField();
        jBLimpiarTabla = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Rutas", "Origen", "Destino", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        btnModificarRuta.setText("Modificar ruta");
        btnModificarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRutaActionPerformed(evt);
            }
        });

        btnEliminarRuta.setText("Eliminar ruta");
        btnEliminarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRutaActionPerformed(evt);
            }
        });

        btnMostrarRutas.setText("Mostar rutas");
        btnMostrarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRutasActionPerformed(evt);
            }
        });

        btnNuevo.setText("Agregar ruta");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jBModifi.setText("modificar");
        jBModifi.setEnabled(false);
        jBModifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifiActionPerformed(evt);
            }
        });

        jBIInactivas.setText("Mostrar inactivas");
        jBIInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIInactivasActionPerformed(evt);
            }
        });

        jLimpiar.setText("Limpiar campos");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jBDarAlta.setText("Dar Alta");
        jBDarAlta.setEnabled(false);
        jBDarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDarAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLimpiar)
                        .addGap(100, 100, 100)
                        .addComponent(jBModifi)
                        .addGap(128, 128, 128)
                        .addComponent(jBDarAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBIInactivas)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnModificarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnEliminarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btnMostrarRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarRutas)
                    .addComponent(btnEliminarRuta)
                    .addComponent(btnModificarRuta)
                    .addComponent(btnNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModifi)
                    .addComponent(jBIInactivas)
                    .addComponent(jLimpiar)
                    .addComponent(jBDarAlta))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setText("Origen");

        jLabel3.setText("Destino");

        jLabel4.setText("Duración Estimada");

        txtDuracionHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionHoraKeyTyped(evt);
            }
        });

        jLabel5.setText(":");

        txtDuracionMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionMinKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtDuracionHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDuracionMin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtDuracionHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuracionMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jBLimpiarTabla.setText("Limpiar tabla");
        jBLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jBLimpiarTabla)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLimpiarTabla)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Rutas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRutaActionPerformed
        int selectedRow = jtTabla.getSelectedRow();
        if (selectedRow != -1) {
            llenarCamposConDatosRuta(selectedRow);
            jBModifi.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un pasajero de la tabla.");
        }

    }//GEN-LAST:event_btnModificarRutaActionPerformed

    private void btnEliminarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRutaActionPerformed
        RutaData rutaData = new RutaData();
        int filaSeleccionada = jtTabla.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una ruta de la tabla.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        int idRuta = (int) modelo.getValueAt(filaSeleccionada, 0);

        Ruta rutaSeleccionada = rutaData.buscarRuta(idRuta);

        if (rutaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de la ruta seleccionada.");
            return;
        }

        Object[] opciones = {"Confirmar", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Está seguro que desea eliminar la ruta seleccionada?",
                "Confirmar eliminación", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcion != JOptionPane.YES_OPTION) {
            return;
        }

        boolean eliminada = rutaData.borrarRuta(rutaSeleccionada);

        if (eliminada) {
            cargarDatosEnTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar la ruta.");
        }
    }//GEN-LAST:event_btnEliminarRutaActionPerformed

    private void btnMostrarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRutasActionPerformed
        cargarDatosEnTabla();

    }//GEN-LAST:event_btnMostrarRutasActionPerformed

    private void txtDuracionHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionHoraKeyTyped
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDuracionHoraKeyTyped

    private void txtDuracionMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionMinKeyTyped
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDuracionMinKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        RutaData rutaData = new RutaData();
        Ruta ruta = new Ruta();

        if (txtOrigen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un Origen");
            return;
        }
        if (txtDestino.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un Destino");
            return;
        }
        if (txtDuracionHora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una duracion de viaje en horas");
            return;
        }
        if (txtDuracionMin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una duracion de viaje en minutos");
            return;
        }

        String origen = txtOrigen.getText();
        String destino = txtDestino.getText();
        int duracionHoras = Integer.parseInt(txtDuracionHora.getText());
        int duracionMinutos = Integer.parseInt(txtDuracionMin.getText());

        Duration duracionEstimada = Duration.ofHours(duracionHoras).plusMinutes(duracionMinutos);

        ruta.setOrigen(origen);
        ruta.setDestino(destino);
        ruta.setDuracionEstimada(duracionEstimada);
        ruta.setEstado(true);

        rutaData.guardarRuta(ruta);
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jBModifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifiActionPerformed
        RutaData rutaData = new RutaData();
        String origen = txtOrigen.getText();
        String destino = txtDestino.getText();
        String duracionHoraStr = txtDuracionHora.getText();
        String duracionMinStr = txtDuracionMin.getText();

        if (origen.isEmpty() || destino.isEmpty() || duracionHoraStr.isEmpty() || duracionMinStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

        int duracionHoras = Integer.parseInt(duracionHoraStr);
        int duracionMinutos = Integer.parseInt(duracionMinStr);

        int filaSeleccionada = jtTabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una ruta de la tabla.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        int idRuta = (int) modelo.getValueAt(filaSeleccionada, 0);
        Ruta rutaSeleccionada = rutaData.buscarRuta(idRuta);

        if (rutaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de la ruta seleccionada.");
            return;
        }

        if (origen.equals(rutaSeleccionada.getOrigen())
                && destino.equals(rutaSeleccionada.getDestino())
                && duracionHoras == rutaSeleccionada.getDuracionEstimada().toHoursPart()
                && duracionMinutos == rutaSeleccionada.getDuracionEstimada().toMinutesPart()) {

            JOptionPane.showMessageDialog(null, "No se han realizado cambios.");
            return;
        }

        rutaSeleccionada.setOrigen(origen);
        rutaSeleccionada.setDestino(destino);
        rutaSeleccionada.setDuracionEstimada(Duration.ofHours(duracionHoras).plusMinutes(duracionMinutos));

        boolean modificada = rutaData.modificarRuta(rutaSeleccionada);

        if (modificada) {
            JOptionPane.showMessageDialog(null, "Ruta modificada exitosamente.");
            cargarDatosEnTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar la ruta.");
        }

        limpiarCampos();
        cargarDatosEnTabla();
        jBModifi.setEnabled(false);
    }//GEN-LAST:event_jBModifiActionPerformed

    private void jBIInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIInactivasActionPerformed
        mostrarRutasInactivas();
        jBDarAlta.setEnabled(true);
    }//GEN-LAST:event_jBIInactivasActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jBLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarTablaActionPerformed
        limpiarJTabla();
        jBDarAlta.setEnabled(true);
    }//GEN-LAST:event_jBLimpiarTablaActionPerformed

    private void jBDarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDarAltaActionPerformed
        int filaSeleccionada = jtTabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una ruta de la tabla.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        int idRuta = (int) modelo.getValueAt(filaSeleccionada, 0);

        RutaData rutaData = new RutaData();
        Ruta rutaSeleccionada = rutaData.buscRutaInactiva(idRuta);

        if (rutaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de la ruta seleccionada.");
            return;
        }

        boolean activada = rutaData.darAltaRuta(rutaSeleccionada);

        if (activada) {
            cargarDatosEnTabla();
        } else {

        }
        limpiarJTabla();
        jBDarAlta.setEnabled(false);
    }//GEN-LAST:event_jBDarAltaActionPerformed

    private void mostrarRutasInactivas() {
        RutaData rutaData = new RutaData();
        List<Ruta> rutas = rutaData.listarRutasInactivas();

        limpiarJTabla();

        DefaultTableModel modeloTabla = (DefaultTableModel) jtTabla.getModel();

        for (Ruta ruta : rutas) {
            long horas = ruta.getDuracionEstimada().toHours();
            long minutos = ruta.getDuracionEstimada().toMinutes() % 60;

            String duracionFormateada = String.format("%02d:%02d", horas, minutos);

            Object[] fila = {
                ruta.getIdRuta(),
                ruta.getOrigen(),
                ruta.getDestino(),
                duracionFormateada,
                ruta.estaActivo() ? "Activo" : "Inactivo"
            };
            modeloTabla.addRow(fila);
        }

        jtTabla.setModel(modeloTabla);
    }

    private void armarJTable(String[] columnas) {

        limpiarJTabla();

        for (String columna : columnas) {
            modelo.addColumn(columna);
        }

        jtTabla.setModel(modelo);
        jtTabla.setCellSelectionEnabled(false);
        jtTabla.setRowSelectionAllowed(true);
    }

    private void limpiarCampos() {
        txtDestino.setText("");
        txtDuracionHora.setText("");
        txtDuracionMin.setText("");
        txtOrigen.setText("");

    }

    private void llenarCamposConDatosRuta(int selectedRow) {
        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        int filaSeleccionada = jtTabla.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idRuta = (int) modelo.getValueAt(filaSeleccionada, 0);
            String origen = (String) modelo.getValueAt(filaSeleccionada, 1);
            String destino = (String) modelo.getValueAt(filaSeleccionada, 2);

            String duracionEstimadaStr = (String) modelo.getValueAt(filaSeleccionada, 3);
            String[] duracionEstimadaParts = duracionEstimadaStr.split(":");
            int horas = Integer.parseInt(duracionEstimadaParts[0]);
            int minutos = Integer.parseInt(duracionEstimadaParts[1]);
            Duration duracionEstimada = Duration.ofHours(horas).plusMinutes(minutos);

            String estadoStr = (String) modelo.getValueAt(filaSeleccionada, 4);
            boolean estado = "Activo".equals(estadoStr);

            txtOrigen.setText(origen);
            txtDestino.setText(destino);
            txtDuracionHora.setText(String.valueOf(horas));
            txtDuracionMin.setText(String.valueOf(minutos));

        }
    }

    private void cargarDatosEnTabla() {
        RutaData rutaData = new RutaData();
        List<Ruta> rutas = rutaData.listarRutas();

        limpiarJTabla();

        DefaultTableModel modeloTabla = (DefaultTableModel) jtTabla.getModel();

        for (Ruta ruta : rutas) {
            long horas = ruta.getDuracionEstimada().toHours();
            long minutos = ruta.getDuracionEstimada().toMinutes() % 60;

            String duracionFormateada = String.format("%02d:%02d", horas, minutos);

            Object[] fila = {
                ruta.getIdRuta(),
                ruta.getOrigen(),
                ruta.getDestino(),
                duracionFormateada,
                ruta.estaActivo() ? "Activo" : "Inactivo"
            };
            modeloTabla.addRow(fila);
        }

        jtTabla.setModel(modeloTabla);
    }

    private void limpiarJTabla() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
        jtTabla.repaint();

    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarRuta;
    private javax.swing.JButton btnModificarRuta;
    private javax.swing.JButton btnMostrarRutas;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jBDarAlta;
    private javax.swing.JButton jBIInactivas;
    private javax.swing.JButton jBLimpiarTabla;
    private javax.swing.JButton jBModifi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDuracionHora;
    private javax.swing.JTextField txtDuracionMin;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables

 
  
 
}
