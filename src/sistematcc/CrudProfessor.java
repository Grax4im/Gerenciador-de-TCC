package sistematcc;
import DAO.ProfessorDAO;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import models.Aluno;
import models.Professor;
import models.Serializar;
import models.tableModelCrudProfessor;

/**
 *
 * @author rob
 */
public class CrudProfessor extends javax.swing.JPanel {

    tableModelCrudProfessor modelo = new tableModelCrudProfessor();
    ProfessorDAO lista;
    
    public CrudProfessor(ProfessorDAO listaProfessores) {
        this.lista = listaProfessores;
        initComponents();
        jTable1.setModel(modelo);
        popularTabela();
    }
    public void popularTabela() {
        ArrayList<Professor> lista = Serializar.load("listaProfessores.ser");
        for(Professor i : lista) {
            modelo.addRow(i);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        areaDeInteresse = new javax.swing.JTextField();
        sugestao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();

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

        jLabel1.setText("Nome:");

        jLabel2.setText("Sugestão Projeto:");

        jLabel3.setText("Email:");

        jLabel4.setText("Area de Interesse:");

        areaDeInteresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaDeInteresseActionPerformed(evt);
            }
        });

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        confirmar.setText("VOLTAR PARA PAGINA DE LOGIN");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(38, 38, 38)
                                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sugestao, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(areaDeInteresse)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(confirmar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sugestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaDeInteresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(confirmar)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String campoNome = nome.getText();
        String campoEmail = email.getText();
        String campoSugestao = sugestao.getText();
        String campoArea = areaDeInteresse.getText();
        
        boolean verificarVazio = !(campoNome.isEmpty() && campoEmail.isEmpty() 
                && campoSugestao.isEmpty() && campoArea.isEmpty());
        if(verificarVazio) {
            Professor novoProfessor = new Professor(campoNome,campoEmail, true);
            novoProfessor.addAreaDeInteresse(campoArea);
            novoProfessor.setSugestao(campoSugestao);
            
            if(lista.add(novoProfessor)) {
                modelo.addRow(novoProfessor);
                modelo.fireTableDataChanged();
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int linha = jTable1.getSelectedRow();
        if(linha != -1) {
            Object nome = modelo.getValueAt(linha, 0);
            Professor excluido = lista.search((String)nome);
            if(lista.remove(excluido)) {
                modelo.removeRow(linha);
                modelo.fireTableRowsDeleted(linha, linha);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione um Professor ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                if(!(nome.getText().isEmpty()) && !(email.getText().isEmpty()) 
                && !(sugestao.getText().isEmpty()) && !(areaDeInteresse.getText().isEmpty())) {
            
            Professor novoProfessor = new Professor(nome.getText(), email.getText(),
            true);
            
            novoProfessor.addAreaDeInteresse(areaDeInteresse.getText());
            
            novoProfessor.setSugestao(sugestao.getText());
            
            Professor professorAntigo;
            
            if(jTable1.getSelectedRow() != -1) {
                Object nomeProfessor = modelo.getValueAt(jTable1.getSelectedRow(), 0);
                professorAntigo = lista.search((String)nomeProfessor);
                
                if(lista.update(professorAntigo, novoProfessor)){
                    int linha = jTable1.getSelectedRow();
                    modelo.setValueAt(novoProfessor.getNome(), linha, 0);
                    modelo.setValueAt(novoProfessor.getEmail(),linha,1);
                    modelo.setValueAt(novoProfessor.getSugestao(), linha, 2);
                    modelo.setValueAt(novoProfessor.getAreaDeInteresseString(), linha, 3);
                    modelo.fireTableDataChanged();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Selecione um Professor");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Preencha todos os campos");
        }                                        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarActionPerformed

    private void areaDeInteresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaDeInteresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaDeInteresseActionPerformed

    public JButton getConfirmar() {
        return confirmar;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaDeInteresse;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField sugestao;
    // End of variables declaration//GEN-END:variables
}
