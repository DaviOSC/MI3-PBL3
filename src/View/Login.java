package View;

import java.awt.Component;
import javax.swing.*;


public class Login extends JDialog
{
    private MainJFrame mainframe;

    public Login(MainJFrame mainframe)
    {
        this.mainframe = mainframe;
        initComponents();
    }
    public void addNotify()
    {
        super.addNotify();
        
        rbDono.setSelected(true);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        loginField = new javax.swing.JTextField();
        senhaField = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        rbDono = new javax.swing.JRadioButton();
        rbComprador = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblLogin.setText("Login:");

        lblSenha.setText("Senha:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDono);
        rbDono.setText("Dono");

        buttonGroup1.add(rbComprador);
        rbComprador.setText("Comprador");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rbDono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbComprador))
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaField)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDono)
                    .addComponent(rbComprador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnCadastrar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        dispose();    
        new Cadastro(mainframe).setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       
    }//GEN-LAST:event_btnEntrarActionPerformed
    //limpa os campos de entrada 
    private void limparCampos()
    {
        Component[] components = jPanel.getComponents();
        for (Component component : components)
        {
            
            if (component instanceof JTextField)
            {
                ((JTextField) component).setText(null);
            }
            if (component instanceof JPasswordField)
            {
                ((JPasswordField) component).setText(null);
            }
        }
        
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField loginField;
    private javax.swing.JRadioButton rbComprador;
    private javax.swing.JRadioButton rbDono;
    private javax.swing.JPasswordField senhaField;
    // End of variables declaration//GEN-END:variables
}
