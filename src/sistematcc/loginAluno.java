package sistematcc;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class loginAluno extends JPanel{
    
    JButton confirmar;
    JLabel labelNome, labelMatricula;
    JTextField campoNome, campoMatricula;
    
    public loginAluno() {
        confirmar = new JButton("Entrar");
        labelNome = new JLabel("Nome");
        labelMatricula = new JLabel("Matricula");
        campoNome = new JTextField(40);
        campoMatricula = new JTextField(20);
        this.add(labelNome);
        this.add(campoNome);
        this.add(labelMatricula);
        this.add(campoMatricula);
        this.add(confirmar);
        this.setLayout(new FlowLayout());
    }
    public JButton getBotaoConfirmar() {
        return confirmar;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public JTextField getCampoMatricula() {
        return campoMatricula;
    }
    
    
}
