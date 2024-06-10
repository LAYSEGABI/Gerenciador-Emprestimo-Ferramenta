package view;

import dao.AmigoDAO;
import dao.EmprestimosDAO;
import dao.FerramentaDAO;
import modelo.Emprestimo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;
import modelo.Ferramenta;

public class FrmEmprestimosRealizados extends javax.swing.JFrame {

    private Emprestimo objetoemprestimosrealizados;

    public FrmEmprestimosRealizados() {
        initComponents();
        this.objetoemprestimosrealizados = new Emprestimo();// carrega objeto amigo de amigo
        
        this.carregaTabelaEmprestimosRealizados();

    }
//

    public void carregaTabelaEmprestimosRealizados() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableEmprestimosRealizados.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela

        EmprestimosDAO emprestimoDAO = new EmprestimosDAO();

        List<Emprestimo> listaEmprestimos = emprestimoDAO.getEmprestimos();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        JTableEmprestimosRealizados.setForeground(new java.awt.Color(255, 0, 51));
        JTableEmprestimosRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Amigo", "Telefone", "Ferramenta", "Marca", "Data Emprestimo", "Data Devolução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTableEmprestimosRealizadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEmprestimosRealizadosMouseClicked
        

    }//GEN-LAST:event_JTableEmprestimosRealizadosMouseClicked

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
            java.util.logging.Logger.getLogger(FrmEmprestimosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmprestimosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmprestimosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmprestimosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmprestimosRealizados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableEmprestimosRealizados;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
