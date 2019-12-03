package sistematcc;

import DAO.DAOpropostaTC;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import models.Aluno;
import models.Professor;
import models.PropostaTC;

public class PanelDefinicaoOrientadorTema extends javax.swing.JPanel {

    private Aluno aluno;
    private Professor professor;
    private DAOpropostaTC listaPropostas;
    
    public PanelDefinicaoOrientadorTema(Aluno alunoLogado, Professor professorSelecionado, DAOpropostaTC proposta) {
        this.aluno = alunoLogado;
        this.professor = professorSelecionado;
        this.listaPropostas = proposta;
        initComponents();
        nomeAluno.setText(aluno.getNome());
        nomeAluno.setEditable(false);
        matriculaAluno.setText(Integer.toString(aluno.getMatricula()));
        matriculaAluno.setEditable(false);
        telefoneAluno.setText(aluno.getTelefone());
        telefoneAluno.setEditable(false);
        emailAluno.setText(aluno.getEmail());
        emailAluno.setEditable(false);
        nomeOrientador.setText(professor.getNome());
        nomeOrientador.setEditable(false);
        temaDoTCC.setText(professor.getSugestao());
        areaDoProjeto.setText(professor.getAreaDeInteresse().get(0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        temaDoTCC = new javax.swing.JTextField();
        telefoneAluno = new javax.swing.JTextField();
        nomeOrientador = new javax.swing.JTextField();
        emailAluno = new javax.swing.JTextField();
        matriculaAluno = new javax.swing.JTextField();
        nomeAluno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        areaDoProjeto = new javax.swing.JTextField();

        jLabel1.setText("Definição Professor Orientador e Tema");

        jLabel2.setText("Matricula:");

        jLabel3.setText("Aluno:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Email:");

        jLabel6.setText("Tema do Trabalho:");

        jLabel7.setText("Orientador:");

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        telefoneAluno.setText("jTextField1");
        telefoneAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneAlunoActionPerformed(evt);
            }
        });

        nomeOrientador.setText("jTextField1");
        nomeOrientador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeOrientadorActionPerformed(evt);
            }
        });

        emailAluno.setText("jTextField1");
        emailAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAlunoActionPerformed(evt);
            }
        });

        matriculaAluno.setText("jTextField1");
        matriculaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaAlunoActionPerformed(evt);
            }
        });

        nomeAluno.setText("jTextField1");
        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });

        jLabel8.setText("Area do Projeto:");

        areaDoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaDoProjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 109, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nomeOrientador)
                        .addGap(26, 26, 26)
                        .addComponent(confirmar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(areaDoProjeto)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(temaDoTCC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneAluno)
                            .addComponent(matriculaAluno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAluno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeAluno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(matriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefoneAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temaDoTCC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaDoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirmar)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        criarPropostaTC();
    }//GEN-LAST:event_confirmarActionPerformed

    private void telefoneAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneAlunoActionPerformed

    private void nomeOrientadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeOrientadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeOrientadorActionPerformed

    private void emailAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAlunoActionPerformed

    private void matriculaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaAlunoActionPerformed

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAlunoActionPerformed

    private void areaDoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaDoProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaDoProjetoActionPerformed

    private void criarPropostaTC() {
        PropostaTC novaProposta = new PropostaTC(temaDoTCC.getText(), aluno, 
                professor, areaDoProjeto.getText());
        if(listaPropostas.add(novaProposta)) {
            JOptionPane.showMessageDialog(null, "Sua Proposta foi enviada ao Professor !");
        }
    }

    public JButton getConfirmar() {
        return confirmar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaDoProjeto;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField emailAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField matriculaAluno;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField nomeOrientador;
    private javax.swing.JTextField telefoneAluno;
    private javax.swing.JTextField temaDoTCC;
    // End of variables declaration//GEN-END:variables
}
