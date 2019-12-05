package models;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tableModelCrudProfessor extends AbstractTableModel{

    private List<Professor> dados = new ArrayList<>();
    private String[] colunasss = {"Nome", "Email","Area de Interesse", "Sugestão de Projeto"};

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
                    return dados.get(linha).getAreaDeInteresse();
                case 3:
                    return dados.get(linha).getSugestao();
        }
        return null;
    }
    
    public void addRow(Professor i) {
        this.dados.add(i);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int i) {
        this.dados.remove(i);
        this.fireTableRowsDeleted(i, i);
    }

    
    
}
