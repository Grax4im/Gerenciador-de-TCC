package models;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tableModelCrudAluno extends AbstractTableModel{

    private List<Aluno> dados = new ArrayList<>();
    private String[] colunasss = {"Nome", "Email","Matricula", "Telefone"};

    @Override
    public String getColumnName(int coluna) {
        return colunasss[coluna];
    }
    
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunasss.length;
        
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
                case 0:
                    return dados.get(linha).getNome();
                case 1:
                    return dados.get(linha).getEmail();
                case 2:
                    return dados.get(linha).getMatricula();
                case 3:
                    return dados.get(linha).getTelefone();
        }
        return null;
    }
    
    public void addRow(Aluno i) {
        this.dados.add(i);
        this.fireTableDataChanged();
    }
    
}
