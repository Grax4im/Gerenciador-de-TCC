package models;
public class Avaliacao {
    private Aluno aluno;
    private Professor avaliador;
    private String titulo, parecer;
    //observacoes de cada topico
    private String usoDaLinguagemObs, 
            apresentacaoObs, estruturadoTextoObs,
            conteudoDoTextoObs,relevanciaAdequacaoObs;
    //aprovado ou reprovado
    private boolean avaliacao;
    //caso aprovado, conceito de A até C (implementar enum)
    private String conceito; 
}
