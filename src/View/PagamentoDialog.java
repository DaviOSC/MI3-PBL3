package View;

import java.awt.Component;
import java.util.Iterator;
import java.util.Map;
import javax.swing.*;
import model.Pagamento;


public class PagamentoDialog extends JDialog
{
    private MainJFrame mainframe;

    public PagamentoDialog(MainJFrame mainframe, Double valor)
    {
        this.mainframe = mainframe;
        initComponents();
        lblValor.setText("Valor: R$" + valor);
        setSelection();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblValor1 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        cbPagamento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setModal(true);
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(6, 0));

        lblValor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor1.setText("Pagamento");
        jPanel1.add(lblValor1);

        lblValor.setText("Valor: ");
        jPanel1.add(lblValor);

        lblLogin.setText("Selecione o Método de Pagamento");
        jPanel1.add(lblLogin);

        jPanel1.add(cbPagamento);
        jPanel1.add(jLabel2);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar);

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
            .addGap(0, 228, Short.MAX_VALUE)
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
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jPanel.add(jPanel7, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel, java.awt.BorderLayout.CENTER);
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Pagamento pagamento = (Pagamento)cbPagamento.getSelectedItem();
        if (pagamento != null)
        {
            mainframe.facade.pagarPedido(pagamento);
            JOptionPane.showMessageDialog(null, "Pagamento realizado com Sucesso.", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Pagamento não realizado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed
    public void setSelection()
    {
        DefaultComboBoxModel<Pagamento> modelPagamento = new DefaultComboBoxModel<>();

        Iterator<Map.Entry<String,Pagamento>> iterator = mainframe.getFacade().listarMetodosPagamento();
        while (iterator.hasNext()) {
            Map.Entry<String, Pagamento> entrada = iterator.next();
            modelPagamento.addElement(entrada.getValue());  

        }

        cbPagamento.setModel(modelPagamento);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Pagamento> cbPagamento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor1;
    // End of variables declaration//GEN-END:variables
}
