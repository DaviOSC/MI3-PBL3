package View;

import java.awt.*;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donoPanel = new javax.swing.JPanel();
        menuItensPanel = new javax.swing.JPanel();
        btnCadastrarProduto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnConta = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        produtosPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        pedidosPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        estoquePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        compradorPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        donoPanel.setLayout(new java.awt.BorderLayout());

        menuItensPanel.setLayout(new java.awt.GridLayout(5, 0));

        btnCadastrarProduto.setText("Novo Produto");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        menuItensPanel.add(btnCadastrarProduto);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menuItensPanel.add(jButton1);

        btnEstoque.setText("Ver Estoque");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        menuItensPanel.add(btnEstoque);

        btnConta.setText("Minha Conta");
        menuItensPanel.add(btnConta);

        btnPedidos.setText("Ver Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        menuItensPanel.add(btnPedidos);

        donoPanel.add(menuItensPanel, java.awt.BorderLayout.LINE_START);

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel6.setText("Criar um novo produto");

        jPanel9.setPreferredSize(new java.awt.Dimension(471, 104));
        jPanel9.setLayout(new java.awt.GridLayout(8, 0));

        jLabel9.setText("Descrição do Produto");
        jPanel9.add(jLabel9);

        jTextField2.setText("jTextField1");
        jPanel9.add(jTextField2);

        jLabel8.setText("Nome do Produto");
        jPanel9.add(jLabel8);

        jTextField1.setText("jTextField1");
        jPanel9.add(jTextField1);

        jLabel4.setText("Tipo");
        jPanel9.add(jLabel4);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel9.add(jComboBox1);

        jLabel5.setText("Preço");
        jPanel9.add(jLabel5);
        jPanel9.add(jSpinner1);

        javax.swing.GroupLayout produtosPanelLayout = new javax.swing.GroupLayout(produtosPanel);
        produtosPanel.setLayout(produtosPanelLayout);
        produtosPanelLayout.setHorizontalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        produtosPanelLayout.setVerticalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        mainPanel.add(produtosPanel, "produtos");

        jLabel3.setText("PEDIDOS PANEL");

        javax.swing.GroupLayout pedidosPanelLayout = new javax.swing.GroupLayout(pedidosPanel);
        pedidosPanel.setLayout(pedidosPanelLayout);
        pedidosPanelLayout.setHorizontalGroup(
            pedidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosPanelLayout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        pedidosPanelLayout.setVerticalGroup(
            pedidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosPanelLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        mainPanel.add(pedidosPanel, "pedidos");

        estoquePanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("ESTOQUE PANEL");
        estoquePanel.add(jLabel2, java.awt.BorderLayout.CENTER);

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
        jScrollPane1.setViewportView(jTable1);

        estoquePanel.add(jScrollPane1, java.awt.BorderLayout.PAGE_START);

        mainPanel.add(estoquePanel, "estoque");

        donoPanel.add(mainPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(donoPanel, "donopanel");

        javax.swing.GroupLayout compradorPanelLayout = new javax.swing.GroupLayout(compradorPanel);
        compradorPanel.setLayout(compradorPanelLayout);
        compradorPanelLayout.setHorizontalGroup(
            compradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
        );
        compradorPanelLayout.setVerticalGroup(
            compradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        getContentPane().add(compradorPanel, "compradorpanel");

        jMenu1.setText("File");

        jMenuItem1.setText("Dono");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Comprador");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        changePanel("produtos");
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        changePanel("estoque");
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        changePanel("pedidos");
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Login(this).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        changeScreen("donopanel");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        changeScreen("compradorpanel");
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    private void changePanel(String nome)
    {
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.show(mainPanel, nome);
    }
    public void changeScreen(String nome)
    {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), nome);
    }
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnConta;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JPanel compradorPanel;
    private javax.swing.JPanel donoPanel;
    private javax.swing.JPanel estoquePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuItensPanel;
    private javax.swing.JPanel pedidosPanel;
    private javax.swing.JPanel produtosPanel;
    // End of variables declaration//GEN-END:variables
}
