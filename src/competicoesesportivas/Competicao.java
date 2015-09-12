package competicoesesportivas;

import java.util.Calendar;

public class Competicao {
    private int id;    
    private String nome;
    private Calendar dataInicio;
    private Calendar dataFim;

    public Competicao() {
    }
    
    public Competicao(int id, String nome, Calendar dataInicio, Calendar dataFim) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataInicio
     */
    public Calendar getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public Calendar getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }
    
}
