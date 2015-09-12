
package competicoesesportivas;

public class Participacao {
    private int id;
    private int colocacao;
    private int premio;
    private int id_competidor;
    private int id_competicao;

    public Participacao() {
    }

    public Participacao(int id, int colocacao, int premio, int id_competidor, int id_competicao) {
        this.id = id;
        this.colocacao = colocacao;
        this.premio = premio;
        this.id_competidor = id_competidor;
        this.id_competicao = id_competicao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColocacao() {
        return colocacao;
    }

    public void setColocacao(int colocacao) {
        this.colocacao = colocacao;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public int getId_competidor() {
        return id_competidor;
    }

    public void setId_competidor(int id_competidor) {
        this.id_competidor = id_competidor;
    }

    public int getId_competicao() {
        return id_competicao;
    }

    public void setId_competicao(int id_competicao) {
        this.id_competicao = id_competicao;
    }
    
            
            
}
