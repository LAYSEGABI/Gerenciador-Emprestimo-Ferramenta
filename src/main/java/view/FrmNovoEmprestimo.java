package view;

import dao.AmigoDAO;
import dao.FerramentaDAO;
import modelo.Amigo;
import modelo.Ferramenta;
import modelo.Emprestimo;
import dao.EmprestimosDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmNovoEmprestimo extends javax.swing.JFrame {

    private Amigo objetoamigo;
    private Ferramenta objetoferramenta;

    public FrmNovoEmprestimo() {
        initComponents();
        this.objetoamigo = new Amigo();// carrega objeto amigo de amigo
        this.carregaTabelaTodosAmigos();

        this.objetoferramenta = new Ferramenta();// carrega objeto amigo de amigo
        this.carregaTabelaTodosFerramentas();

    }

    public void carregaTabelaTodosAmigos() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableAmigos.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela
//Carrega a lista de objetos aluno

        AmigoDAO amigoDAO = new AmigoDAO();

        List<Amigo> listaAmigos = amigoDAO.getAmigos();
        for (Amigo amigo : listaAmigos) {
            modelo.addRow(new Object[]{
                amigo.getId(),
                amigo.getNome(),
                amigo.getTelefone()});
        }
    }

    public void carregaTabelaTodosFerramentas() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableFerramentas.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela

        FerramentaDAO ferramentaDAO = new FerramentaDAO();

        List<Ferramenta> listaAmigos = ferramentaDAO.getFerramentasDisponiveis();
        for (Ferramenta ferramenta : listaAmigos) {
            modelo.addRow(new Object[]{
                ferramenta.getId(),
                ferramenta.getNome(),
                ferramenta.getMarca(),
                ferramenta.getCusto()});
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        JTableAmigos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JBConcluir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFerramentas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JTFDataEmprestimo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuItem = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuCadastroAluno = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuGerenciarAluno = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JTableAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAmigosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JTableAmigos);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Qual amigo deseja um emprestimo?");
        jLabel3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel3ComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jLabel3ComponentRemoved(evt);
            }
        });

        JBConcluir.setText("Concluir");
        JBConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConcluirActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JTableFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableFerramentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableFerramentas);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Qual ferramenta deseja emprestar para ??? ?");

        JTFDataEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDataEmprestimoActionPerformed(evt);
            }
        });

        jLabel6.setText("Data emprestimo");

        jMenuArquivo.setText("Gerenciar");
        jMenuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArquivoActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItem1);
        jMenuArquivo.add(jSeparator2);

        jMenuCadastroAluno.setText("Novo Amigo");
        jMenuCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroAlunoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuCadastroAluno);
        jMenuArquivo.add(jSeparator3);

        jMenuGerenciarAluno.setText("Todos Amigos");
        jMenuGerenciarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarAlunoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuGerenciarAluno);
        jMenuArquivo.add(jSeparator4);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItem2);

        jMenuItem.add(jMenuArquivo);

        jMenuSobre.setText("Relatórios");

        jMenuItem3.setText("Ferramentas");
        jMenuSobre.add(jMenuItem3);

        jMenuItem4.setText("Emprestimos ");
        jMenuSobre.add(jMenuItem4);

        jMenuItem.add(jMenuSobre);

        setJMenuBar(jMenuItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(JBCancelar)
                        .addGap(392, 392, 392)
                        .addComponent(JBConcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBConcluir))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmMenuPrincipal objeto = new FrmMenuPrincipal();
        this.dispose();
        objeto.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroAlunoActionPerformed
        FrmCadastroAmigo objeto = new FrmCadastroAmigo();
        objeto.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroAlunoActionPerformed

    private void jMenuGerenciarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerenciarAlunoActionPerformed

    }//GEN-LAST:event_jMenuGerenciarAlunoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArquivoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuArquivoActionPerformed

    private void JTableAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAmigosMouseClicked

    }//GEN-LAST:event_JTableAmigosMouseClicked

    private void JBConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConcluirActionPerformed

        try {
            int idAmigo;
            int idFerramenta;

            if (this.JTableAmigos.getSelectedRow() == -1) {
                throw new Mensagens(
                        "Primeiro Selecione um Amigo");
            } else {
                idAmigo = Integer.parseInt(this.JTableAmigos.
                        getValueAt(this.JTableAmigos.getSelectedRow(), 0).
                        toString());
            }

            if (this.JTableFerramentas.getSelectedRow() == -1) {
                throw new Mensagens(
                        "Primeiro Selecione uma Ferramenta");
            } else {
                idFerramenta = Integer.parseInt(this.JTableFerramentas.
                        getValueAt(this.JTableFerramentas.getSelectedRow(), 0).
                        toString());
            }

            Emprestimo emprestimo = new Emprestimo();
            
            FerramentaDAO ferramentaDAO = new FerramentaDAO();
            ferramentaDAO.atualizarDisponibilidade(idFerramenta, 0);

            emprestimo.setIdAmigo(idAmigo);
            emprestimo.setIdFerramenta(idFerramenta);
            emprestimo.setDataEmprestimo(this.JTFDataEmprestimo.getText());
            EmprestimosDAO emprestimosDAO = new EmprestimosDAO();
            emprestimosDAO.inserir(emprestimo);
            
             JOptionPane.showMessageDialog(rootPane, "Emprestimo Cadastrado com Sucesso!");
             
             this.dispose();

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_JBConcluirActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        FrmMenuPrincipal objeto = new FrmMenuPrincipal();
        objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void jLabel3ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel3ComponentAdded

    }//GEN-LAST:event_jLabel3ComponentAdded

    private void jLabel3ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel3ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3ComponentRemoved

    private void JTableFerramentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableFerramentasMouseClicked

        if (this.JTableFerramentas.getSelectedRow() != -1) {
            String nomeFerramenta = this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 1).toString();
            String marca = this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 2).toString();

            //this.JTFNomeFerramenta.setText(nomeFerramenta);
            //this.JTFMarcaFerramenta.setText(marca);
        }
    }//GEN-LAST:event_JTableFerramentasMouseClicked

    private void JTFDataEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDataEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDataEmprestimoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNovoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNovoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNovoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNovoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNovoEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBConcluir;
    private javax.swing.JTextField JTFDataEmprestimo;
    private javax.swing.JTable JTableAmigos;
    private javax.swing.JTable JTableFerramentas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuItem jMenuCadastroAluno;
    private javax.swing.JMenuItem jMenuGerenciarAluno;
    private javax.swing.JMenuBar jMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
