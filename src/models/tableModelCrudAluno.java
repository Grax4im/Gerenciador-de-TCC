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

    @Override
    public void setValueAt(Object o, int linha, int coluna) {
        switch(coluna){
                case 0:
                    dados.get(linha).setNome((String)o);
                case 1:
                    dados.get(linha).setEmail((String)o);
                case 2:
                    dados.get(linha).setMatricula((String)o);
                case 3:
                    dados.get(linha).setTelefone((String)o);
        }
    }
    
    
    public void addRow(Aluno i) {
        this.dados.add(i);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}
