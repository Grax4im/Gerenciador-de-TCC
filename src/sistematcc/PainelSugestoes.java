package sistematcc;
import DAO.DAOprofessor;
import models.Professor;
import models.tableModel;

public class PainelSugestoes extends javax.swing.JPanel {
    
    DAOprofessor listaProfessores;
    tableModel tableModel;
    
    public PainelSugestoes(DAOprofessor listaProfessores) {
        this.tableModel = new tableModel();
        initComponents();
        this.listaProfessores = listaProfessores; 
        popularTabela();
    }
    
    /*Este método percorre toda a lista de professores e coloca seus dados na tabela*/
    public void popularTabela() {
        for(Professor i : listaProfessores.getLista()) {
            tableModel.addRow(i);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProfessores = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Professores e suas areas de interesse");

        tabelaProfessores.setModel(tableModel);
        jScrollPane1.setViewportView(tabelaProfessores);
        if (tabelaProfessores.getColumnModel().getColumnCount() > 0) {
            tabelaProfessores.getColumnModel().getColumn(0).setHeaderValue("Nome do Professor");
            tabelaProfessores.getColumnModel().getColumn(1).setHeaderValue("Area de Interesse");
            tabelaProfessores.getColumnModel().getColumn(2).setHeaderValue("E-mail");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProfessores;
    // End of variables declaration//GEN-END:variables

}
