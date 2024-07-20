package View;

import facade.Facade;
import java.awt.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import model.*;

public class MainJFrame extends javax.swing.JFrame {
    
    Facade facade = new Facade();
    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donoPanel = new javax.swing.JPanel();
        menuItensPanel = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        btnCadastrarProduto = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnConta = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        produtosPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        descriçãoField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipoCb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        precoSpinner = new javax.swing.JSpinner();
        criarProdutoBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        estoquePanel = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaEstoqueDono = new javax.swing.JTable();
        jPanel49 = new javax.swing.JPanel();
        btnSubProdEstoque = new javax.swing.JButton();
        btnAddProdEstoque = new javax.swing.JButton();
        btnRmvProdEstoque = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        pedidosPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPedidos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        compradorPanel = new javax.swing.JPanel();
        menuItensPanel1 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        btnProdutos = new javax.swing.JButton();
        btnCarrinho = new javax.swing.JButton();
        btnConta1 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        mainPanel1 = new javax.swing.JPanel();
        produtosPanel1 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaEstoqueCliente = new javax.swing.JTable();
        bntAddCarrinho = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        carrinhoPanel = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        jPanel42 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        btnSubProdCarrinho = new javax.swing.JButton();
        btnAddProdCarrinho = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        btnCriarPedido = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        contaPanel = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        salvarMenuItem = new javax.swing.JMenuItem();
        carregarMenuItem = new javax.swing.JMenuItem();
        loginMenuItem = new javax.swing.JMenuItem();
        cadastroMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new java.awt.CardLayout());

        donoPanel.setLayout(new java.awt.BorderLayout());

        menuItensPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuItensPanel.setLayout(new java.awt.GridLayout(3, 0));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        menuItensPanel.add(jPanel19);

        jPanel22.setLayout(new java.awt.GridLayout(4, 0));

        btnCadastrarProduto.setText("Novo Produto");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        jPanel22.add(btnCadastrarProduto);

        btnEstoque.setText("Ver Estoque");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        jPanel22.add(btnEstoque);

        btnConta.setText("Minha Conta");
        jPanel22.add(btnConta);

        btnPedidos.setText("Ver Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jPanel22.add(btnPedidos);

        menuItensPanel.add(jPanel22);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        menuItensPanel.add(jPanel6);

        donoPanel.add(menuItensPanel, java.awt.BorderLayout.LINE_START);

        mainPanel.setLayout(new java.awt.CardLayout());

        produtosPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        produtosPanel.setLayout(new java.awt.GridLayout(3, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel4);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel13);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel12);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel11);

        infoPanel.setPreferredSize(new java.awt.Dimension(471, 104));
        infoPanel.setLayout(new java.awt.GridLayout(9, 0));

        jLabel8.setText("Nome do Produto");
        infoPanel.add(jLabel8);

        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });
        infoPanel.add(nomeField);

        jLabel9.setText("Descrição do Produto");
        infoPanel.add(jLabel9);
        infoPanel.add(descriçãoField);

        jLabel4.setText("Tipo");
        infoPanel.add(jLabel4);

        tipoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eletrônico", "Roupa", "Alimento" }));
        infoPanel.add(tipoCb);

        jLabel5.setText("Preço");
        infoPanel.add(jLabel5);

        precoSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        infoPanel.add(precoSpinner);

        criarProdutoBtn.setText("Confirmar");
        criarProdutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarProdutoBtnActionPerformed(evt);
            }
        });
        infoPanel.add(criarProdutoBtn);

        produtosPanel.add(infoPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel2);

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

        produtosPanel.add(jPanel5);

        mainPanel.add(produtosPanel, "produtos");

        estoquePanel.setLayout(new java.awt.BorderLayout());

        jPanel14.setPreferredSize(new java.awt.Dimension(471, 104));
        jPanel14.setLayout(new java.awt.BorderLayout());

        tabelaEstoqueDono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEstoqueDono.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabelaEstoqueDono);
        if (tabelaEstoqueDono.getColumnModel().getColumnCount() > 0) {
            tabelaEstoqueDono.getColumnModel().getColumn(0).setResizable(false);
            tabelaEstoqueDono.getColumnModel().getColumn(1).setResizable(false);
            tabelaEstoqueDono.getColumnModel().getColumn(2).setResizable(false);
            tabelaEstoqueDono.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel14.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel49.setLayout(new java.awt.GridLayout(3, 0));

        btnSubProdEstoque.setText("Quantidade-");
        btnSubProdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubProdEstoqueActionPerformed(evt);
            }
        });
        jPanel49.add(btnSubProdEstoque);

        btnAddProdEstoque.setText("Quantidade+");
        btnAddProdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdEstoqueActionPerformed(evt);
            }
        });
        jPanel49.add(btnAddProdEstoque);

        btnRmvProdEstoque.setText("Remover");
        btnRmvProdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvProdEstoqueActionPerformed(evt);
            }
        });
        jPanel49.add(btnRmvProdEstoque);

        jPanel14.add(jPanel49, java.awt.BorderLayout.SOUTH);

        estoquePanel.add(jPanel14, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        estoquePanel.add(jPanel3, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        estoquePanel.add(jPanel15, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        estoquePanel.add(jPanel17, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        estoquePanel.add(jPanel18, java.awt.BorderLayout.WEST);

        mainPanel.add(estoquePanel, "estoque");

        pedidosPanel.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(471, 104));
        jPanel10.setLayout(new java.awt.BorderLayout());

        tabelaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Produtos", "Valor", "Forma de pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPedidos.setDragEnabled(true);
        tabelaPedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaPedidos);

        jPanel10.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pedidosPanel.add(jPanel10, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pedidosPanel.add(jPanel1, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pedidosPanel.add(jPanel7, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        pedidosPanel.add(jPanel8, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        pedidosPanel.add(jPanel16, java.awt.BorderLayout.WEST);

        mainPanel.add(pedidosPanel, "pedidos");

        donoPanel.add(mainPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(donoPanel, "donopanel");

        compradorPanel.setLayout(new java.awt.BorderLayout());

        menuItensPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuItensPanel1.setLayout(new java.awt.GridLayout(3, 0));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        menuItensPanel1.add(jPanel20);

        jPanel23.setLayout(new java.awt.GridLayout(3, 0));

        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        jPanel23.add(btnProdutos);

        btnCarrinho.setText("Carrinho");
        btnCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoActionPerformed(evt);
            }
        });
        jPanel23.add(btnCarrinho);

        btnConta1.setText("Minha Conta");
        btnConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConta1ActionPerformed(evt);
            }
        });
        jPanel23.add(btnConta1);

        menuItensPanel1.add(jPanel23);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        menuItensPanel1.add(jPanel21);

        compradorPanel.add(menuItensPanel1, java.awt.BorderLayout.WEST);

        mainPanel1.setLayout(new java.awt.CardLayout());

        produtosPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        produtosPanel1.setLayout(new java.awt.BorderLayout());

        jPanel45.setPreferredSize(new java.awt.Dimension(471, 104));
        jPanel45.setLayout(new java.awt.BorderLayout());

        tabelaEstoqueCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEstoqueCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabelaEstoqueCliente);

        jPanel45.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        bntAddCarrinho.setText("Adicionar no Carrinho");
        bntAddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddCarrinhoActionPerformed(evt);
            }
        });
        jPanel45.add(bntAddCarrinho, java.awt.BorderLayout.PAGE_END);

        produtosPanel1.add(jPanel45, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        produtosPanel1.add(jPanel9, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        produtosPanel1.add(jPanel46, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        produtosPanel1.add(jPanel47, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        produtosPanel1.add(jPanel48, java.awt.BorderLayout.WEST);

        mainPanel1.add(produtosPanel1, "produtos1");

        carrinhoPanel.setLayout(new java.awt.BorderLayout());

        jPanel29.setPreferredSize(new java.awt.Dimension(471, 104));
        jPanel29.setLayout(new java.awt.BorderLayout());

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Produto", "Tipo", "Quantidade", "Preço unitário", "Preço total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCarrinho.setDragEnabled(true);
        tabelaCarrinho.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabelaCarrinho);

        jPanel29.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel42.setLayout(new java.awt.GridLayout(1, 0));

        jPanel44.setLayout(new java.awt.GridLayout(2, 0));

        btnSubProdCarrinho.setText("Quantidade-");
        btnSubProdCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubProdCarrinhoActionPerformed(evt);
            }
        });
        jPanel44.add(btnSubProdCarrinho);

        btnAddProdCarrinho.setText("Quantidade+");
        btnAddProdCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdCarrinhoActionPerformed(evt);
            }
        });
        jPanel44.add(btnAddProdCarrinho);

        jPanel42.add(jPanel44);

        jPanel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel43.setLayout(new java.awt.GridLayout(1, 0));

        lblTotal.setText("Total:");
        jPanel43.add(lblTotal);

        btnCriarPedido.setText("Criar Pedido");
        btnCriarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarPedidoActionPerformed(evt);
            }
        });
        jPanel43.add(btnCriarPedido);

        jPanel42.add(jPanel43);

        jPanel29.add(jPanel42, java.awt.BorderLayout.SOUTH);

        carrinhoPanel.add(jPanel29, java.awt.BorderLayout.CENTER);

        jPanel30.setPreferredSize(new java.awt.Dimension(800, 100));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        carrinhoPanel.add(jPanel30, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        carrinhoPanel.add(jPanel31, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        carrinhoPanel.add(jPanel32, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        carrinhoPanel.add(jPanel33, java.awt.BorderLayout.WEST);

        mainPanel1.add(carrinhoPanel, "carrinho");

        contaPanel.setLayout(new java.awt.BorderLayout());

        jPanel34.setPreferredSize(new java.awt.Dimension(471, 104));
        jPanel34.setLayout(new java.awt.GridLayout(1, 0));

        jPanel40.setLayout(new java.awt.GridLayout(1, 0));

        jPanel41.setPreferredSize(new java.awt.Dimension(471, 104));
        jPanel41.setLayout(new java.awt.GridLayout(8, 0));

        jLabel12.setText("Descrição do Produto");
        jPanel41.add(jLabel12);
        jPanel41.add(jTextField5);

        jLabel13.setText("Nome do Produto");
        jPanel41.add(jLabel13);
        jPanel41.add(jTextField6);

        jLabel14.setText("Tipo");
        jPanel41.add(jLabel14);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel41.add(jComboBox3);

        jLabel15.setText("Preço");
        jPanel41.add(jLabel15);
        jPanel41.add(jSpinner3);

        jPanel40.add(jPanel41);

        jPanel34.add(jPanel40);

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

        jPanel39.add(jScrollPane1);

        jPanel34.add(jPanel39);

        contaPanel.add(jPanel34, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        contaPanel.add(jPanel35, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        contaPanel.add(jPanel36, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        contaPanel.add(jPanel37, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        contaPanel.add(jPanel38, java.awt.BorderLayout.WEST);

        mainPanel1.add(contaPanel, "conta");

        compradorPanel.add(mainPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(compradorPanel, "compradorpanel");

        jMenu.setText("File");

        salvarMenuItem.setText("Salvar Dados");
        salvarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarMenuItemActionPerformed(evt);
            }
        });
        jMenu.add(salvarMenuItem);

        carregarMenuItem.setText("Carregar Dados");
        carregarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarMenuItemActionPerformed(evt);
            }
        });
        jMenu.add(carregarMenuItem);

        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemActionPerformed(evt);
            }
        });
        jMenu.add(loginMenuItem);

        cadastroMenuItem.setText("Cadastrar Usuario");
        cadastroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroMenuItemActionPerformed(evt);
            }
        });
        jMenu.add(cadastroMenuItem);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        changePanel("produtos");
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        changePanel("estoque");
        preencherTabelaEstoque();
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        changePanel("pedidos");
        preencherTabelaPedidos();
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        changePanelC("produtos1");
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoActionPerformed
        changePanelC("carrinho");
        preencherTabelaCarrinho();
    }//GEN-LAST:event_btnCarrinhoActionPerformed

    private void btnConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConta1ActionPerformed
        changePanelC("conta");
    }//GEN-LAST:event_btnConta1ActionPerformed

    private void btnCriarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarPedidoActionPerformed
        try {
            facade.criarPedido();
            JOptionPane.showMessageDialog(null, "Pedido criado.", "Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCriarPedidoActionPerformed

    private void criarProdutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarProdutoBtnActionPerformed
        facade.adicionarProdutoEmEstoque(criarProduto(), 0);
        JOptionPane.showMessageDialog(null, "Produto criado no estoque", "Sistema", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_criarProdutoBtnActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void bntAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddCarrinhoActionPerformed
        try
        {
           facade.adicionarProdutoAoCarrinho((Produto) tabelaEstoqueCliente.getValueAt(tabelaEstoqueCliente.getSelectedRow(), 0), 1);
            preencherTabelaEstoque();
            preencherTabelaCarrinho();
            setPreco(facade.getPreçoCarrinho());
            JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho", "Sistema", JOptionPane.INFORMATION_MESSAGE); 
        }
        catch (IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_bntAddCarrinhoActionPerformed

    private void btnSubProdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubProdEstoqueActionPerformed
        facade.removerProdutoDoEstoque((Produto) tabelaEstoqueDono.getValueAt(tabelaEstoqueDono.getSelectedRow(), 0), 1);
        preencherTabelaEstoque();
    }//GEN-LAST:event_btnSubProdEstoqueActionPerformed

    private void btnAddProdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdEstoqueActionPerformed
        facade.adicionarProdutoEmEstoque((Produto) tabelaEstoqueDono.getValueAt(tabelaEstoqueDono.getSelectedRow(), 0), 1);
        preencherTabelaEstoque();
    }//GEN-LAST:event_btnAddProdEstoqueActionPerformed

    private void btnRmvProdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvProdEstoqueActionPerformed
        facade.removerTipoProdutoDoEstoque((Produto) tabelaEstoqueDono.getValueAt(tabelaEstoqueDono.getSelectedRow(), 0));
        preencherTabelaEstoque();
        JOptionPane.showMessageDialog(null, "Produto removido do estoque", "Sistema", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnRmvProdEstoqueActionPerformed

    private void btnSubProdCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubProdCarrinhoActionPerformed
        if(tabelaCarrinho.getValueAt(tabelaCarrinho.getSelectedRow(), 0) != null)
            {
                facade.removerProdutoDoCarrinho((Produto) tabelaCarrinho.getValueAt(tabelaCarrinho.getSelectedRow(), 0), 1);
                preencherTabelaCarrinho();
                preencherTabelaEstoque();
            }
        setPreco(facade.getPreçoCarrinho());
       
    }//GEN-LAST:event_btnSubProdCarrinhoActionPerformed

    private void btnAddProdCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdCarrinhoActionPerformed
        try
        {
            facade.adicionarProdutoAoCarrinho((Produto) tabelaCarrinho.getValueAt(tabelaCarrinho.getSelectedRow(), 0), 1);
            preencherTabelaCarrinho();
            preencherTabelaEstoque();
            setPreco(facade.getPreçoCarrinho());   
        }
        catch (IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddProdCarrinhoActionPerformed

    private void loginMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemActionPerformed
        new Login(this).setVisible(true);
    }//GEN-LAST:event_loginMenuItemActionPerformed

    private void carregarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarMenuItemActionPerformed
        carregarArquivo();

    }//GEN-LAST:event_carregarMenuItemActionPerformed

    private void salvarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarMenuItemActionPerformed
        try
        {
            //opção para selecionar o arquivo para salvar
            JFileChooser chooser = new JFileChooser();
            //filtro para escolher apenas o tipo de arquivo especifico
            FileNameExtensionFilter filter = new FileNameExtensionFilter("pblFiles", "pbl");
            chooser.setFileFilter(filter);
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                facade.salvarDados(chooser.getSelectedFile().getName());
                JOptionPane.showMessageDialog(null, "Informações salvas.", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_salvarMenuItemActionPerformed

    private void cadastroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroMenuItemActionPerformed
        new Cadastro(this).setVisible(true);
    }//GEN-LAST:event_cadastroMenuItemActionPerformed
    
    private void changePanel(String nome)
    {
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.show(mainPanel, nome);
    }
    private void changePanelC(String nome)
    {
        CardLayout layout = (CardLayout) mainPanel1.getLayout();
        layout.show(mainPanel1, nome);
    }
    public void changeScreen(String nome)
    {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), nome);
    }
    private void preencherTabelaPedidos()
    {
        DefaultTableModel modeloTabela = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };

        String[] colunas = {"Cliente", "Produtos", "Valor", "Estado", "Forma de Pagamento"};
        modeloTabela.setColumnIdentifiers(colunas);

        modeloTabela.setRowCount(0);
        Iterator<Pedido> iterator = facade.listarPedidos();

        while (iterator.hasNext()) {
            Pedido pedido = iterator.next();

            // Cria um StringBuilder para formatar a lista de itens
            StringBuilder produtosFormatados = new StringBuilder();
            Iterator<Map.Entry<Produto, Integer>> itensIterator = pedido.listarItens();

            while (itensIterator.hasNext()) {
                Map.Entry<Produto, Integer> entrada = itensIterator.next();
                Produto produto = entrada.getKey();
                int quantidade = entrada.getValue();
                produtosFormatados.append(produto.getNome())
                    .append(" (")
                    .append(quantidade)
                    .append("), ");
            }

            if (produtosFormatados.length() > 0) {
                produtosFormatados.setLength(produtosFormatados.length() - 2);
            }
            
            String estadoFormatado;
                switch (pedido.getEstado()) {
                case Pedido.NOVO:
                    estadoFormatado = "Novo";
                    break;
                case Pedido.PROCESSANDO:
                    estadoFormatado = "Processando";
                    break;
                case Pedido.ENVIADO:
                    estadoFormatado = "Enviado";
                    break;
                case Pedido.ENTREGUE:
                    estadoFormatado = "Entregue";
                    break;
                default:
                    estadoFormatado = "Desconhecido";
                    break;
                }


            Object[] linha = {
                pedido.getCliente().getNome(),
                produtosFormatados.toString(),
                pedido.getPrecoTotal(),
                estadoFormatado,
                pedido.getPagamento()
            };
            modeloTabela.addRow(linha);
        }
        tabelaPedidos.setModel(modeloTabela);
    }

    private void preencherTabelaCarrinho() {
 
        DefaultTableModel modeloTabela = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }};
        
        String[] colunas = {"Produto", "Tipo", "Quantidade", "Preço unitário", "Preço total"};
        modeloTabela.setColumnIdentifiers(colunas);
        
        modeloTabela.setRowCount(0);
        Iterator<Map.Entry<Produto, Integer>> iterator = facade.listarProdutosCarrinhoIterator();

        while (iterator.hasNext()) {
            Map.Entry<Produto, Integer> entrada = iterator.next();
            Produto produto = entrada.getKey();
            int quantidade = entrada.getValue();
            Object[] linha = {
                produto,
                produto.getTipoProduto(),
                quantidade,
                produto.getPreco(),
                (produto.getPreco()*quantidade)
                
            };
            modeloTabela.addRow(linha);
        }
        tabelaCarrinho.setModel(modeloTabela);
    }
    private void preencherTabelaEstoque() {
        DefaultTableModel modeloTabela = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }};
        
        String[] colunas = {"Nome", "Tipo", "Quantidade", "Valor"};
        modeloTabela.setColumnIdentifiers(colunas);

        modeloTabela.setRowCount(0);
        Iterator<Map.Entry<Produto, Integer>> iterator = facade.listarProdutosEstoqueIterator();

        while (iterator.hasNext()) {
            Map.Entry<Produto, Integer> entrada = iterator.next();
            Produto produto = entrada.getKey();
            int quantidade = entrada.getValue();
            Object[] linha = {
                produto,
                produto.getTipoProduto(),
                quantidade,
                produto.getPreco()
                
            };
            modeloTabela.addRow(linha);
        }
        tabelaEstoqueDono.setModel(modeloTabela);
        tabelaEstoqueCliente.setModel(modeloTabela);
    }
    public Produto criarProduto()
    {
        return ProdutoFactory.criarProduto(tipoCb.getSelectedItem().toString(), nomeField.getText(), (double)precoSpinner.getValue(), descriçãoField.getText());
    }
    
    public void setPreco(double preco)
    {
        lblTotal.setText("Total:"+preco);
    }
    
    public Facade getFacade()
    {
        return facade;
    }
    public void fazerLogin(String login, String senha) throws IllegalArgumentException, IllegalAccessException
    {
        Usuario usuario = facade.fazerLogin(login,senha);
        jMenu.setText(usuario.getTipoUsuario());
        setVisible(true);
        if (usuario instanceof Dono)
            changeScreen("donopanel");
        else if (usuario instanceof  Cliente)
            changeScreen("compradorpanel");
            
    }
    
    public void cadastro(String usuario, String senha, String tipo) throws IllegalAccessException, IllegalArgumentException
    {
        facade.cadastrarUsuario(tipo, usuario, senha);
    }
    
    public void carregarArquivo()
    {
        try
        {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("pblFiles", "pbl");
            chooser.setFileFilter(filter);
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                facade.carregarDados(chooser.getSelectedFile().getName());
                System.out.print(chooser.getSelectedFile().getName());
                JOptionPane.showMessageDialog(null, "Informações carredadas.", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(IOException | ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
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

                MainJFrame mainframe = new MainJFrame();
                new Login(mainframe).setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAddCarrinho;
    private javax.swing.JButton btnAddProdCarrinho;
    private javax.swing.JButton btnAddProdEstoque;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JButton btnConta;
    private javax.swing.JButton btnConta1;
    private javax.swing.JButton btnCriarPedido;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRmvProdEstoque;
    private javax.swing.JButton btnSubProdCarrinho;
    private javax.swing.JButton btnSubProdEstoque;
    private javax.swing.JMenuItem cadastroMenuItem;
    private javax.swing.JMenuItem carregarMenuItem;
    private javax.swing.JPanel carrinhoPanel;
    private javax.swing.JPanel compradorPanel;
    private javax.swing.JPanel contaPanel;
    private javax.swing.JButton criarProdutoBtn;
    private javax.swing.JTextField descriçãoField;
    private javax.swing.JPanel donoPanel;
    private javax.swing.JPanel estoquePanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainPanel1;
    private javax.swing.JPanel menuItensPanel;
    private javax.swing.JPanel menuItensPanel1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JPanel pedidosPanel;
    private javax.swing.JSpinner precoSpinner;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JPanel produtosPanel1;
    private javax.swing.JMenuItem salvarMenuItem;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JTable tabelaEstoqueCliente;
    private javax.swing.JTable tabelaEstoqueDono;
    private javax.swing.JTable tabelaPedidos;
    private javax.swing.JComboBox<String> tipoCb;
    // End of variables declaration//GEN-END:variables
}
