/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controle.InformaSensor;
import Entidade.Rede;
import Entidade.Sensor;

/**
 *
 * @author vitau
 */
public class Principal extends javax.swing.JFrame {
    Rede rede = new Rede();
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        sensorIDLabel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tipoCombobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        redeCombobox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        msgLabel = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        autoenviarCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Publisher / Sensor Adder");

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitau\\Documents\\Unifei II\\Sistemas_Distribuidos\\Publisher_Maven\\flash.png")); // NOI18N
        jLabel2.setText("Publisher");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 44));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(51, 255, 102));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 344, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sensor ID:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        sensorIDLabel.setBackground(new java.awt.Color(51, 0, 102));
        sensorIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sensorIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        sensorIDLabel.setToolTipText("Digite o ID do Sensor");
        sensorIDLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sensorIDLabel.setCaretColor(new java.awt.Color(0, 204, 204));
        sensorIDLabel.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(sensorIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 216, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        tipoCombobox.setBackground(new java.awt.Color(51, 0, 102));
        tipoCombobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipoCombobox.setForeground(new java.awt.Color(255, 255, 255));
        tipoCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Temperatura", "Presença", "Umidade" }));
        tipoCombobox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(tipoCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 216, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rede:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        redeCombobox.setBackground(new java.awt.Color(51, 0, 102));
        redeCombobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        redeCombobox.setForeground(new java.awt.Color(255, 255, 255));
        redeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rede 1", "Rede 2" }));
        jPanel3.add(redeCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 216, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mensagem:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        msgLabel.setBackground(new java.awt.Color(51, 0, 102));
        msgLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        msgLabel.setForeground(new java.awt.Color(255, 255, 255));
        msgLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(msgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 216, -1));

        sendButton.setBackground(new java.awt.Color(51, 0, 102));
        sendButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendButton.setForeground(new java.awt.Color(51, 255, 102));
        sendButton.setText("Enviar");
        sendButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        jPanel3.add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 99, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dados:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        valueLabel.setBackground(new java.awt.Color(51, 0, 102));
        valueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 216, -1));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(51, 255, 102));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 344, 10));

        autoenviarCheckbox.setBackground(new java.awt.Color(51, 0, 102));
        autoenviarCheckbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        autoenviarCheckbox.setForeground(new java.awt.Color(255, 255, 255));
        autoenviarCheckbox.setText("Autoenviar ");
        autoenviarCheckbox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        autoenviarCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoenviarCheckboxActionPerformed(evt);
            }
        });
        jPanel3.add(autoenviarCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
       int valorRede = 0;
       int valorDado;
       try{
       String auxID = sensorIDLabel.getText();
       String auxTipo = tipoCombobox.getSelectedItem().toString();
       String auxRede = redeCombobox.getSelectedItem().toString();
       if(auxRede == "Rede 1")
       valorRede = 001;
       String auxMsg = msgLabel.getText();
       String auxValue = valueLabel.getText();
       valorDado = Integer.parseInt(auxValue);
       rede.registerSensorAddedListener(new InformaSensor());
       rede.addSensor(new Sensor(auxID, auxTipo, valorRede, auxMsg, valorDado));
       
       }catch (Exception e) {
	 System.out.println("Erro de Inserção do Sensor");
       }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void autoenviarCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoenviarCheckboxActionPerformed
       
    }//GEN-LAST:event_autoenviarCheckboxActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autoenviarCheckbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField msgLabel;
    private javax.swing.JComboBox<String> redeCombobox;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField sensorIDLabel;
    private javax.swing.JComboBox<String> tipoCombobox;
    private javax.swing.JTextField valueLabel;
    // End of variables declaration//GEN-END:variables
}
