package models;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tableModel extends AbstractTableModel{

    List<Professor> dados = new ArrayList<>();
    String[] colunas = {"Nome", "Area de Interesse", "Email"};

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }
    
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
        
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
                case 0:
                    return dados.get(linha).getNome();
                case 1:
                    return dados.get(linha).getAreaDeInteresse();
                case 2:
                    return dados.get(linha).getEmail();
        }
        return null;
    }
    
    public void addRow(Professor i) {
        this.dados.add(i);
        this.fireTableDataChanged();
    }
    
}
