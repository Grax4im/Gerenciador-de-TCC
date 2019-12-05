package sistematcc;
import DAO.PropostaTCDAO;
import javax.swing.JButton;
import javax.swing.JTable;
import models.PropostaTC;
import models.tableModelPropostas;

public class PanelPropostasTC extends javax.swing.JPanel {
    private tableModelPropostas tableModelPropostas;
    private PropostaTCDAO listaPropostas;
    
    public PanelPropostasTC(PropostaTCDAO listaPropostas) {
        this.tableModelPropostas = new tableModelPropostas();
        initComponents();
        this.listaPropostas = listaPropostas; 
        popularTabela();
    }
    
    /*Este método percorre toda a lista de professores e coloca seus dados na tabela*/
    public void popularTabela() {
        for(PropostaTC i : listaPropostas.getLista()) {
                tableModelPropostas.addRow(i);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPropostas = new javax.swing.JTable();
        escolherProposta = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Proposta de TC - Enviadas por Alunos");

        tabelaPropostas.setModel(tableModelPropostas);
        jScrollPane1.setViewportView(tabelaPropostas);

        escolherProposta.setText("Definir Banca Avaliadora");
        escolherProposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolherPropostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(escolherProposta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolherProposta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void escolherPropostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolherPropostaActionPerformed

    }//GEN-LAST:event_escolherPropostaActionPerformed
    public PropostaTC getPropostaSelecionada() {
        int linha = tabelaPropostas.getSelectedRow();
        if(linha != -1) {
            return listaPropostas.getLista().get(linha);
        }
        return null;
    }
    public JButton getEscolherPropsota() {
        return escolherProposta;
    }
    
    public JTable getTabelaPropostas() {
        return tabelaPropostas;
    }
    public tableModelPropostas getTableModel() {
        return tableModelPropostas;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton escolherProposta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPropostas;
    // End of variables declaration//GEN-END:variables

}
