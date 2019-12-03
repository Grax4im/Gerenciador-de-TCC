package sistematcc;

import javax.swing.JButton;
import models.BancaAvaliadora;

public class PanelFormularioAvaliacao extends javax.swing.JPanel {

    BancaAvaliadora banca; 
    
    public PanelFormularioAvaliacao(BancaAvaliadora banca) {
        initComponents();
        this.banca = banca;
        primeiroAvaliador.setText("Adicionar Avaliação Prof. "+banca.getAvaliadores().get(0).getNome());
        segundoAvaliador.setText("Adicionar Avaliação Prof. " + banca.getAvaliadores().get(1).getNome());
        terceiroAvaliador.setText("Adicionar Avaliação Prof. " + banca.getAvaliadores().get(2).getNome());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        terceiroAvaliador = new javax.swing.JButton();
        primeiroAvaliador = new javax.swing.JButton();
        segundoAvaliador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        terceiroAvaliador.setText("Adicionar Avaliação do Terceiro Avaliador");

        primeiroAvaliador.setText("Adicionar Avaliação do Segundo Avaliador");

        segundoAvaliador.setText("Adicionar Avaliação do Segundo Avaliador");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Aguardando a Avaliação da Banca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(terceiroAvaliador, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(primeiroAvaliador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(segundoAvaliador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(primeiroAvaliador, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(segundoAvaliador, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(terceiroAvaliador, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getPrimeiroAvaliador() {
        return primeiroAvaliador;
    }

    public JButton getSegundoAvaliador() {
        return segundoAvaliador;
    }

    public JButton getTerceiroAvaliador() {
        return terceiroAvaliador;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton primeiroAvaliador;
    private javax.swing.JButton segundoAvaliador;
    private javax.swing.JButton terceiroAvaliador;
    // End of variables declaration//GEN-END:variables
}
