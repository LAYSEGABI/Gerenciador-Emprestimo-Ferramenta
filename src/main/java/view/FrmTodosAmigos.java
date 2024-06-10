package view;

import dao.AmigoDAO;
import modelo.Amigo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmTodosAmigos extends javax.swing.JFrame {

    private Amigo objetoamigo;

    public FrmTodosAmigos() {
        initComponents();
        this.objetoamigo = new Amigo();// carrega objeto amigo de amigo

        this.carregaTabelaTodosAmigos();

    }

    public void carregaTabelaTodosAmigos() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableAmigos.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela


        AmigoDAO amigoDAO = new AmigoDAO();

        List<Amigo> listaAmigos = amigoDAO.getAmigos();
        for (Amigo amigo : listaAmigos) {
            modelo.addRow(new Object[]{
                amigo.getId(),
                amigo.getNome(),
                amigo.getTelefone()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        JTableAmigos = new javax.swing.JTable();
        JTFNomeAmigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JBApagar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTableAmigos.setForeground(new java.awt.Color(255, 0, 51));
        JTableAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Amigo", "Telefone"
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

        JTFNomeAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeAmigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Amigo");

        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefone");

        JBApagar.setBackground(new java.awt.Color(245, 245, 245));
        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JTFNomeAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(219, 219, 219))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBCancelar)
                .addGap(40, 40, 40)
                .addComponent(JBAlterar)
                .addGap(56, 56, 56)
                .addComponent(JBApagar)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNomeAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBAlterar)
                    .addComponent(JBApagar))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTableAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAmigosMouseClicked
        if (this.JTableAmigos.getSelectedRow() != -1) {
            String nomeAmigo = this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 1).toString();
            String telefone = this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 2).toString();

            this.JTFNomeAmigo.setText(nomeAmigo);
            this.JTFTelefone.setText(telefone);

        }
    }//GEN-LAST:event_JTableAmigosMouseClicked

    private void JTFNomeAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeAmigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeAmigoActionPerformed

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {
            // validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            int telefone = 0;

            if (this.JTableAmigos.getSelectedRow() == -1) {
                throw new Mensagens(
                        "Primeiro Selecione um Amigo para APAGAR ");
            } else {
                id = Integer.parseInt(this.JTableAmigos.
                        getValueAt(this.JTableAmigos.getSelectedRow(), 0).
                        toString());
            }
            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.
                    showConfirmDialog(null,
                            "Tem certeza que deseja apagar este Amigo ?");
            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o Amigo processar

                AmigoDAO amigoDAO = new AmigoDAO();
                Amigo amigo = new Amigo(id, nome, telefone);

                amigoDAO.excluirAmigo(amigo);

                // limpa os campos
                this.JTFNomeAmigo.setText("");
                this.JTFTelefone.setText("");

                JOptionPane.showMessageDialog(rootPane,
                        "Amigo Apagado com Sucesso!");

            }
            // atualiza a tabela.

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabelaTodosAmigos();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        try {
            // recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            int telefone = 0;

            if (this.JTableAmigos.getSelectedRow() == -1) {
                throw new Mensagens(
                        "Primeiro Selecione um Amigo para Alterar ");
            } else {
                id = Integer.parseInt(this.JTableAmigos.
                        getValueAt(this.JTableAmigos.getSelectedRow(), 0).
                        toString());
            }

            if (this.JTFNomeAmigo.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNomeAmigo.getText();
            }
            if (this.JTFTelefone.getText().length() <= 0) {
                throw new Mensagens("telefone deve ser n�mero e maior que zero.");
            } else {
                telefone = Integer.parseInt(this.JTFTelefone.getText());
            }
            AmigoDAO amigoDAO = new AmigoDAO();
            Amigo amigo = new Amigo(id, nome, telefone);

            amigoDAO.editarAmigo(amigo);

            // limpa os campos
            this.JTFNomeAmigo.setText("");
            this.JTFTelefone.setText("");

            JOptionPane.showMessageDialog(rootPane, "Amigo editado com Sucesso!");

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            // atualiza a tabela.
            carregaTabelaTodosAmigos();
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTodosAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTodosAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTodosAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTodosAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTodosAmigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFNomeAmigo;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JTable JTableAmigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
