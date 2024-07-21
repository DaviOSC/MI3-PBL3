package View;

import java.awt.Component;
import javax.swing.*;
import model.Cliente;
import model.Usuario;


public class Login extends JDialog
{
    private MainJFrame mainframe;

    public Login(MainJFrame mainframe)
    {
        this.mainframe = mainframe;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        senhaField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnCadastrarM = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(400, 450));
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(5, 0));

        lblLogin.setText("Login:");
        jPanel1.add(lblLogin);
        jPanel1.add(loginField);

        lblSenha.setText("Senha:");
        jPanel1.add(lblSenha);
        jPanel1.add(senhaField);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEntrar);

        jPanel1.add(jPanel3);

        jPanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(403, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        jPanel.add(jPanel6, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        jPanel.add(jPanel7, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel, java.awt.BorderLayout.CENTER);

        btnCadastrarM.setText("Menu");

        jMenuItem1.setText("Carregar Dados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnCadastrarM.add(jMenuItem1);

        jMenuItem2.setText("Cadastrar Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnCadastrarM.add(jMenuItem2);

        jMenuBar1.add(btnCadastrarM);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try
        {
            Usuario usuario = mainframe.fazerLogin(loginField.getText(), new String(senhaField.getPassword()));
            JOptionPane.showMessageDialog(null, "Usuário Logado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            mainframe.setVisible(true);
           if (usuario instanceof Cliente)
           {
            mainframe.preencherListaPagamentos();
            mainframe.preencherTabelaCarrinho();
           }


            mainframe.preencherTabelaEstoque();
            mainframe.preencherTabelaPedidos();
            dispose();

        }
        catch (IllegalArgumentException  | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        mainframe.carregarArquivo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();    
        new Cadastro(mainframe).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCadastrarM;
    private javax.swing.JButton btnEntrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField loginField;
    private javax.swing.JPasswordField senhaField;
    // End of variables declaration//GEN-END:variables
}
