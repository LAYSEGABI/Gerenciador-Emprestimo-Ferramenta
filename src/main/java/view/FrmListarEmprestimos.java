package view;

import dao.AmigoDAO;
import dao.EmprestimosDAO;
import dao.FerramentaDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;
import modelo.Emprestimo;
import modelo.Ferramenta;

public class FrmListarEmprestimos extends javax.swing.JFrame {

    public FrmListarEmprestimos() {
        initComponents();

        this.carregaTabelaEmprestimosRealizados();
    }

    public void carregaTabelaEmprestimosRealizados() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableEmprestimosRealizados.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela

        EmprestimosDAO emprestimoDAO = new EmprestimosDAO();

        List<Emprestimo> listaEmprestimos = emprestimoDAO.getEmprestimosAtivos();
        for (Emprestimo emprestimo : listaEmprestimos) {

            AmigoDAO amigoDAO = new AmigoDAO();
            Amigo amigo = amigoDAO.getAmigo(emprestimo.getIdAmigo());

            FerramentaDAO ferramentaDAO = new FerramentaDAO();
            Ferramenta ferramenta = ferramentaDAO.getFerramenta(emprestimo.getIdFerramenta());

            modelo.addRow(new Object[]{
                emprestimo.getId(),
                amigo.getNome(),
                amigo.getTelefone(),
                ferramenta.getNome(),
                ferramenta.getMarca(),
                emprestimo.getDataEmprestimo(),
                emprestimo.getDataDevolucao()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        JTableEmprestimosRealizados = new javax.swing.JTable();
        jButtonAtualiza = new javax.swing.JButton();
        jTextDataDevolucao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTableEmprestimosRealizados.setForeground(new java.awt.Color(255, 0, 51));
        JTableEmprestimosRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Amigo", "Telefone", "Ferramenta", "Marca", "Data Emprestimo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableEmprestimosRealizados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableEmprestimosRealizadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JTableEmprestimosRealizados);

        jButtonAtualiza.setText("Atualizar Emprestimo");
        jButtonAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizaActionPerformed(evt);
            }
        });

        jLabel1.setText("Data de devolução");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtualiza)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualiza))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTableEmprestimosRealizadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEmprestimosRealizadosMouseClicked

    }//GEN-LAST:event_JTableEmprestimosRealizadosMouseClicked

    private void jButtonAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizaActionPerformed

        String dataDevolucao = "";
        int idEmprestimo = 0;
        String nomeFerramenta = "";

        if (this.JTableEmprestimosRealizados.getSelectedRow() == -1) {
            try {
                throw new Mensagens(
                        "Primeiro Selecione um Emprestimo para Atualizar ");
            } catch (Mensagens ex) {
                Logger.getLogger(FrmListarEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            idEmprestimo = Integer.parseInt(this.JTableEmprestimosRealizados.
                    getValueAt(this.JTableEmprestimosRealizados.getSelectedRow(), 0).
                    toString());

            nomeFerramenta = this.JTableEmprestimosRealizados.
                    getValueAt(this.JTableEmprestimosRealizados.getSelectedRow(), 3).toString();
        }

        if (this.jTextDataDevolucao.getText().length() < 2) {
            try {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } catch (Mensagens ex) {
                Logger.getLogger(FrmListarEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            dataDevolucao = this.jTextDataDevolucao.getText();
        }

        EmprestimosDAO emprestimosDAO = new EmprestimosDAO();
        emprestimosDAO.finalizarEmprestimo(idEmprestimo, dataDevolucao);

        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        ferramentaDAO.atualizarDisponibilidade(nomeFerramenta, 1);

        JOptionPane.showMessageDialog(rootPane, "Emprestimo atualizado com sucesso!");
        
        
        this.carregaTabelaEmprestimosRealizados();
        this.dispose();

    }//GEN-LAST:event_jButtonAtualizaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmListarEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListarEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListarEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListarEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListarEmprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableEmprestimosRealizados;
    private javax.swing.JButton jButtonAtualiza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextDataDevolucao;
    // End of variables declaration//GEN-END:variables
}
