package sistematcc;
import DAO.DAOprofessor;
import models.Professor;
import models.tableModel;

public class PanelSugestoes extends javax.swing.JPanel {
    
    DAOprofessor listaProfessores;
    tableModel tableModel;
    
    public PanelSugestoes(DAOprofessor listaProfessores) {
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
        escolherProfessor = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Professores e suas areas de interesse");

        tabelaProfessores.setModel(tableModel);
        jScrollPane1.setViewportView(tabelaProfessores);
        if (tabelaProfessores.getColumnModel().getColumnCount() > 0) {
            tabelaProfessores.getColumnModel().getColumn(0).setHeaderValue("Nome do Professor");
            tabelaProfessores.getColumnModel().getColumn(1).setHeaderValue("Area de Interesse");
            tabelaProfessores.getColumnModel().getColumn(2).setHeaderValue("E-mail");
        }

        escolherProfessor.setText("Escolher Professor como Orientador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(escolherProfessor)
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
                .addComponent(escolherProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton escolherProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProfessores;
    // End of variables declaration//GEN-END:variables

}
