/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematcc;

import javax.swing.JButton;

/**
 *
 * @author rob
 */
public class PanelWhoAmI extends javax.swing.JPanel {

    /**
     * Creates new form PanelWhoAmI
     */
    public PanelWhoAmI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        souAluno = new javax.swing.JButton();
        souProfessor = new javax.swing.JButton();

        souAluno.setText("Sou Aluno");
        souAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                souAlunoActionPerformed(evt);
            }
        });

        souProfessor.setText("Sou Professor da Disciplina");
        souProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                souProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(souProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(souAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(souAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(souProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void souAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_souAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_souAlunoActionPerformed

    private void souProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_souProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_souProfessorActionPerformed

    public JButton getSouAluno() {
        return souAluno;
    }

    public JButton getSouProfessor() {
        return souProfessor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton souAluno;
    private javax.swing.JButton souProfessor;
    // End of variables declaration//GEN-END:variables
}
