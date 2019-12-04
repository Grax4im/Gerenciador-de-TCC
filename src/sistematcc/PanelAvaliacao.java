package sistematcc;
import javax.swing.JButton;
import models.Avaliacao;
import models.Professor;
import models.PropostaTC;

public class PanelAvaliacao extends javax.swing.JPanel {

    PropostaTC proposta;
    Professor avaliador;
    Avaliacao avaliacao;
    
    public PanelAvaliacao(PropostaTC proposta, Professor avaliador) {
        initComponents();
        this.proposta = proposta;
        this.avaliador = avaliador;
        campoAluno.setText(proposta.getAutor().getNome());
        campoAluno.setEditable(false);
        campoOrientador.setText(proposta.getOrientador().getNome());
        campoOrientador.setEditable(false);
        campoTitulo.setText(proposta.getTitulo());
        campoTitulo.setEditable(false);
        reprovado.setSelected(true);
        jComboBox1.setVisible(false); 
        titulo.setText("Ficha de Avaliação - Professor " + avaliador.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        titulo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        campoOrientador = new javax.swing.JTextField();
        campoTitulo = new javax.swing.JTextField();
        campoAluno = new javax.swing.JTextField();
        titulo4 = new javax.swing.JLabel();
        aprovado = new javax.swing.JRadioButton();
        reprovado = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        titulo5 = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        confirmar = new javax.swing.JButton();

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setText("Ficha de Avaliação - Professor ");

        titulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo1.setText("Titulo:");

        titulo3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo3.setText("Orientador:");

        titulo4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo4.setText("Aluno:");

        buttonGroup1.add(aprovado);
        aprovado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        aprovado.setText("Aprovado");
        aprovado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprovadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(reprovado);
        reprovado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reprovado.setText("Reprovado");
        reprovado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprovadoActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        titulo5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titulo5.setText("Conceito:");

        titulo6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo6.setText("Parecer:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        confirmar.setText("Confirmar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aprovado)
                        .addGap(18, 18, 18)
                        .addComponent(reprovado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo6)
                        .addGap(431, 431, 431))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(titulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo1)
                    .addComponent(campoOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo3)
                    .addComponent(titulo4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprovado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reprovado)
                    .addComponent(titulo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titulo5)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aprovadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprovadoActionPerformed
       jComboBox1.setVisible(true);
    }//GEN-LAST:event_aprovadoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public JButton getConfirmar() {
        return confirmar;
    }
    public boolean isAprovado() {
         return aprovado.isSelected();
    }
    public Avaliacao criarAvaliacao() {
        avaliacao = new Avaliacao(proposta,avaliador,isAprovado());
        if(jComboBox1.isVisible()){
                avaliacao.setConceito(jComboBox1.getSelectedItem().toString());
        }
        if(!jTextArea1.toString().isEmpty()){
            avaliacao.setParecer(jTextArea1.toString());
        }
        return avaliacao;
    }
    
    private void reprovadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprovadoActionPerformed
        jComboBox1.setVisible(false);
    }//GEN-LAST:event_reprovadoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aprovado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoAluno;
    private javax.swing.JTextField campoOrientador;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton confirmar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton reprovado;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    // End of variables declaration//GEN-END:variables
}
