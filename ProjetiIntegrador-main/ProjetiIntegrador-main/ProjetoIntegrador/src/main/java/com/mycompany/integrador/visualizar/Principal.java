package com.mycompany.integrador.visualizar;

import com.mycompany.integrador.Departamento;
import com.mycompany.integrador.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//CLASSE PRINCIPAL
public class Principal extends javax.swing.JFrame {

    //CRIANDO UMA LISTA 
    ArrayList<Departamento> ListaDep;
    String modoDep;

    public void LoadTableDep() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Nome"}, 0);

        for (int i = 0; i < ListaDep.size(); i++) {
            Object linha[] = new Object[]{ListaDep.get(i).getCodigo(),
                ListaDep.get(i).getNome()};
            modelo.addRow(linha);
        }

        TDepartamento.setModel(modelo);
        TDepartamento.getColumnModel().getColumn(0).setPreferredWidth(50);
        TDepartamento.getColumnModel().getColumn(1).setPreferredWidth(200);
        
         //Preenche a lista do combo box
        LoadCBDep();
    }
    

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaDep = new ArrayList();
        modoDep = "Navegar";
        
        ManipulaInterfaceDep();
        ListaDep = new ArrayList();
        btnSalvarD.setEnabled(false);
        btnCancelarD.setEnabled(false);
        txtCodD.setEnabled(false);
        txtNomeD.setEnabled(false);
    }

    public void ManipulaInterfaceDep(){
        switch(modoDep){
            case "Navegar":
                btnSalvarD.setEnabled(false);
                btnCancelarD.setEnabled(false);
                txtCodD.setEnabled(false);
                txtNomeD.setEnabled(false);
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                break;
            
            case "Novo":
                btnSalvarD.setEnabled(true);
                btnCancelarD.setEnabled(true);
                txtCodD.setEnabled(true);
                txtNomeD.setEnabled(true);
                btnNovo.setEnabled(false);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                break;
                
            case "Editar":
                btnSalvarD.setEnabled(true);
                btnCancelarD.setEnabled(true);
                txtCodD.setEnabled(true);
                txtNomeD.setEnabled(true);
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                break;
                
            case "Excluir":
                btnSalvarD.setEnabled(false);
                btnCancelarD.setEnabled(false);
                txtCodD.setEnabled(false);
                txtNomeD.setEnabled(false);
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                break;
                
            case "Selecao":
                btnSalvarD.setEnabled(false);
                btnCancelarD.setEnabled(false);
                txtCodD.setEnabled(false);
                txtNomeD.setEnabled(false);
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
                break;
            default: System.out.println("Modo inválido");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDepartamento = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblCodD = new javax.swing.JLabel();
        lblNomeD = new javax.swing.JLabel();
        txtCodD = new javax.swing.JTextField();
        txtNomeD = new javax.swing.JTextField();
        btnSalvarD = new javax.swing.JButton();
        btnCancelarD = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TFuncionarios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblCodigoF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnSalvarF = new javax.swing.JButton();
        txtCodF = new javax.swing.JTextField();
        txtNomeF = new javax.swing.JTextField();
        cb_funcoes = new javax.swing.JComboBox<>();
        btnCancelarF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Código", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TDepartamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TDepartamento);
        if (TDepartamento.getColumnModel().getColumnCount() > 0) {
            TDepartamento.getColumnModel().getColumn(0).setMinWidth(100);
            TDepartamento.getColumnModel().getColumn(0).setPreferredWidth(200);
            TDepartamento.getColumnModel().getColumn(0).setMaxWidth(200);
            TDepartamento.getColumnModel().getColumn(1).setMinWidth(50);
            TDepartamento.getColumnModel().getColumn(1).setPreferredWidth(50);
            TDepartamento.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btnNovo.setForeground(new java.awt.Color(204, 0, 0));
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setForeground(new java.awt.Color(255, 0, 0));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setForeground(new java.awt.Color(204, 0, 51));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Departamento"));

        lblCodD.setText("Código");

        lblNomeD.setText("Nome");

        btnSalvarD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvarD.setText("Salvar");
        btnSalvarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDActionPerformed(evt);
            }
        });

        btnCancelarD.setText("Cancelar");
        btnCancelarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomeD)
                    .addComponent(lblCodD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodD, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSalvarD, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNomeD, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodD)
                    .addComponent(txtCodD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeD)
                    .addComponent(txtNomeD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarD)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCancelarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Departamentos", jPanel1);

        TFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Matrícula", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TFuncionarios);
        if (TFuncionarios.getColumnModel().getColumnCount() > 0) {
            TFuncionarios.getColumnModel().getColumn(0).setMinWidth(100);
            TFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(200);
            TFuncionarios.getColumnModel().getColumn(0).setMaxWidth(200);
            TFuncionarios.getColumnModel().getColumn(1).setMinWidth(50);
            TFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(50);
            TFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Funcionários"));
        jPanel4.setPreferredSize(new java.awt.Dimension(490, 160));

        lblCodigoF.setText("Código");

        lblNome.setText("Nome");

        btnSalvarF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvarF.setText("Salvar");
        btnSalvarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFActionPerformed(evt);
            }
        });

        txtNomeF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeF.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        cb_funcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Pedagógico", "Financeiro", "RH", "Produção", "Engenharia", "Pintura", "", "" }));
        cb_funcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_funcoesActionPerformed(evt);
            }
        });

        btnCancelarF.setText("Cancelar");
        btnCancelarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel1.setText("Departamentos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigoF)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnSalvarF, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCodF, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_funcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeF))
                .addGap(101, 101, 101))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoF)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_funcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarF)
                    .addComponent(btnCancelarF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionários", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDActionPerformed
        // TODO add your handling code here:
        txtCodD.setText("");
        txtNomeD.setText("");
        
        modoDep = "Navegar";
        ManipulaInterfaceDep();
    }//GEN-LAST:event_btnCancelarDActionPerformed

    private void btnCancelarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarFActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        txtCodD.setText("");
        txtNomeD.setText("");
        
        modoDep = "Novo";
        ManipulaInterfaceDep();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDActionPerformed
        int cod = Integer.parseInt(txtCodD.getText());

        //Testa se foi clicado o botão novo ou editar
        if(modoDep.equals("Novo")){  
            Departamento D = new Departamento(cod, txtNomeD.getText());
            ListaDep.add(D);
        }else if(modoDep.equals("Editar")){
            int index = TDepartamento.getSelectedRow();
            ListaDep.get(index).setCodigo(cod);
            ListaDep.get(index).setNome(txtNomeD.getText());
        }
        
        LoadTableDep();
        modoDep = "Navegar";
        ManipulaInterfaceDep();
        txtCodD.setText("");
        txtNomeD.setText("");
    }//GEN-LAST:event_btnSalvarDActionPerformed

    private void btnSalvarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFActionPerformed
       
    }//GEN-LAST:event_btnSalvarFActionPerformed

    private void cb_funcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_funcoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_funcoesActionPerformed

    private void TDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TDepartamentoMouseClicked
        //Pega a linha selecionada
        int index = TDepartamento.getSelectedRow();

        //Testa a validade da linha selecionada
        if(index>=0 && index<ListaDep.size()){
            //Seleciona a linha e preenche os campos para edição
            Departamento D = ListaDep.get(index);
            txtCodD.setText(String.valueOf(D.getCodigo()));
            txtNomeD.setText(D.getNome());
            //Manipula a interface para o modo seleção
            modoDep = "Selecao";
            ManipulaInterfaceDep();
        }
    
    }//GEN-LAST:event_TDepartamentoMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        modoDep = "Editar";
        ManipulaInterfaceDep();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        
         int index = TDepartamento.getSelectedRow();
        if(index>=0 && index<ListaDep.size()){
            ListaDep.remove(index);
        }
        LoadTableDep();
        modoDep = "Navegar";
        ManipulaInterfaceDep();
    
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void LoadCBDep(){
        cb_funcoes.removeAllItems();
         cb_funcoes.addItem("Selecione");
        for(int i=0;i<ListaDep.size();i++){
            cb_funcoes.addItem(ListaDep.get(i).getNome());
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TDepartamento;
    private javax.swing.JTable TFuncionarios;
    private javax.swing.JButton btnCancelarD;
    private javax.swing.JButton btnCancelarF;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvarD;
    private javax.swing.JButton btnSalvarF;
    private javax.swing.JComboBox<String> cb_funcoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCodD;
    private javax.swing.JLabel lblCodigoF;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeD;
    private javax.swing.JTextField txtCodD;
    private javax.swing.JTextField txtCodF;
    private javax.swing.JTextField txtNomeD;
    private javax.swing.JTextField txtNomeF;
    // End of variables declaration//GEN-END:variables

    private int pesquisarFunc(String matriculaInformada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void LoadTableFunc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
