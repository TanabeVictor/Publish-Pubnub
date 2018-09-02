package Views;

import Controle.ctrRede;
import Entidade.Sensor;
import java.util.Random;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    ctrRede rede = new ctrRede();

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
        autogerarCheckbox = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        redeButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Publisher / Sensor Adder");

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Publisher");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, 44));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(51, 255, 102));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 344, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sensor MAC:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        sensorIDLabel.setBackground(new java.awt.Color(51, 0, 102));
        sensorIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sensorIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        sensorIDLabel.setToolTipText("Digite o ID do Sensor");
        sensorIDLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sensorIDLabel.setCaretColor(new java.awt.Color(0, 204, 204));
        sensorIDLabel.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(sensorIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 216, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        tipoCombobox.setBackground(new java.awt.Color(51, 0, 102));
        tipoCombobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipoCombobox.setForeground(new java.awt.Color(255, 255, 255));
        tipoCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Temperatura", "Presença", "Umidade" }));
        tipoCombobox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(tipoCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 216, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rede:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        redeCombobox.setBackground(new java.awt.Color(51, 0, 102));
        redeCombobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        redeCombobox.setForeground(new java.awt.Color(255, 255, 255));
        redeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rede 1", "Rede 2" }));
        jPanel3.add(redeCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 216, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mensagem:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        msgLabel.setBackground(new java.awt.Color(51, 0, 102));
        msgLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        msgLabel.setForeground(new java.awt.Color(255, 255, 255));
        msgLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(msgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 216, -1));

        sendButton.setBackground(new java.awt.Color(51, 0, 102));
        sendButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendButton.setForeground(new java.awt.Color(51, 255, 102));
        sendButton.setText("Enviar");
        sendButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        jPanel3.add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 99, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dados:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        valueLabel.setBackground(new java.awt.Color(51, 0, 102));
        valueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 216, -1));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(51, 255, 102));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 344, 10));

        autogerarCheckbox.setBackground(new java.awt.Color(51, 0, 102));
        autogerarCheckbox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        autogerarCheckbox.setForeground(new java.awt.Color(255, 255, 255));
        autogerarCheckbox.setText("Autogerar");
        autogerarCheckbox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        autogerarCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autogerarCheckboxActionPerformed(evt);
            }
        });
        jPanel3.add(autogerarCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pub / Sub");

        redeButton.setBackground(new java.awt.Color(0, 0, 51));
        redeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redeButton.setForeground(new java.awt.Color(51, 255, 102));
        redeButton.setText("Publicar Rede");
        redeButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        redeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(redeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(redeButton)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 540));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 102));
        jLabel8.setText("© 2018, VictorTanabe");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        int valorRede = 0, valorDado;
        String auxID, auxTipo, auxRede, auxMsg, auxValue;

        try {
            auxID = sensorIDLabel.getText();
            auxTipo = tipoCombobox.getSelectedItem().toString();
            auxRede = redeCombobox.getSelectedItem().toString();

            valorRede = retornaRede(auxRede);

            auxMsg = msgLabel.getText();
            auxValue = valueLabel.getText();

            valorDado = Integer.parseInt(auxValue);

            //registra novo Sensor
            rede.addSensor(new Sensor(auxID, auxTipo, valorRede, auxMsg, valorDado));

        } catch (Exception e) {
            System.out.println("Erro de Inserção do Sensor");
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void autogerarCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autogerarCheckboxActionPerformed
        valueLabel.setText(Integer.toString(gerarValor()));
    }//GEN-LAST:event_autogerarCheckboxActionPerformed

    private void redeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redeButtonActionPerformed
        String aux = JOptionPane.showInputDialog(null, "Informe qual rede deseja selecionar: \n1 - Rede 1 \n2 - Rede 2");
        rede.retornaSensores(Integer.parseInt(aux));
    }//GEN-LAST:event_redeButtonActionPerformed

    private int retornaRede(String redeID) {
        if (redeID == "Rede 1") {
            return 1;
        } else {
            return 2;
        }
    }

    private int gerarValor() {
        Random gerador = new Random();
        int valorLido;
        valorLido = gerador.nextInt(100);
        return valorLido;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autogerarCheckbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField msgLabel;
    private javax.swing.JButton redeButton;
    private javax.swing.JComboBox<String> redeCombobox;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField sensorIDLabel;
    private javax.swing.JComboBox<String> tipoCombobox;
    private javax.swing.JTextField valueLabel;
    // End of variables declaration//GEN-END:variables
}
