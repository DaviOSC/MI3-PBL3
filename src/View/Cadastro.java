package View;

import javax.swing.*;

public class Cadastro extends JDialog {
    
    private MainJFrame mainframe;
    
    public Cadastro(MainJFrame mainframe)
    {
        this.mainframe = mainframe;
        initComponents();
        rbDono.setSelected(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        lblSenha1 = new javax.swing.JLabel();
        senhaField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        rbDono = new javax.swing.JRadioButton();
        rbComprador = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnLoginM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro");
        setMinimumSize(new java.awt.Dimension(360, 375));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(400, 450));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(479, 517));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel2.setLayout(new java.awt.GridLayout(6, 0));

        lblLogin.setText("Login:");
        jPanel2.add(lblLogin);
        jPanel2.add(loginField);

        lblSenha1.setText("Senha:");
        jPanel2.add(lblSenha1);
        jPanel2.add(senhaField);

        buttonGroup1.add(rbDono);
        rbDono.setText("Dono");
        jPanel3.add(rbDono);

        buttonGroup1.add(rbComprador);
        rbComprador.setText("Cliente");
        jPanel3.add(rbComprador);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCadastrar);

        jPanel2.add(jPanel4);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel5.setPreferredSize(new java.awt.Dimension(403, 100));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setPreferredSize(new java.awt.Dimension(403, 100));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel7.setPreferredSize(new java.awt.Dimension(100, 210));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel8.setPreferredSize(new java.awt.Dimension(100, 210));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Menu");

        jMenuItem1.setText("Carregar Dados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        btnLoginM.setText("Fazer Login");
        btnLoginM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginMActionPerformed(evt);
            }
        });
        jMenu1.add(btnLoginM);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //metodo chamado ao pressionar o botão de cadastrar
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(rbComprador.isSelected())
        {
            try 
            {
                mainframe.cadastro(loginField.getText(), new String(senhaField.getPassword()),"Cliente");
                JOptionPane.showMessageDialog(null, "Usuario "+loginField.getText()+" Cadastrado. ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IllegalAccessException | IllegalArgumentException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE); 
            }
            
        }
        else if(rbDono.isSelected())
        {
            try 
            {
                mainframe.cadastro(loginField.getText(), new String(senhaField.getPassword()),"Dono");
                JOptionPane.showMessageDialog(null, "Usuario "+loginField.getText()+" Cadastrado. ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IllegalAccessException | IllegalArgumentException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE); 
            }              
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        mainframe.carregarArquivo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnLoginMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginMActionPerformed
        dispose();    
        new Login(mainframe).setVisible(true);
    }//GEN-LAST:event_btnLoginMActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(mainframe.isVisible())
        {
            dispose();
        }
        else
        {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JMenuItem btnLoginM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JTextField loginField;
    private javax.swing.JRadioButton rbComprador;
    private javax.swing.JRadioButton rbDono;
    private javax.swing.JPasswordField senhaField;
    // End of variables declaration//GEN-END:variables
}
