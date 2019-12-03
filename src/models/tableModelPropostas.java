package models;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tableModelPropostas extends AbstractTableModel{

    private List<PropostaTC> dados = new ArrayList<>();
    private String[] colunasss = {"Autor", "Titulo","Orientador"};

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
                    return dados.get(linha).getAutor().getNome();
                case 1:
                    return dados.get(linha).getTitulo();
                case 2:
                    return dados.get(linha).getOrientador().getNome();
        }
        return null;
    }
    
    public void addRow(PropostaTC i) {
        this.dados.add(i);
        this.fireTableDataChanged();
    }
    
}
