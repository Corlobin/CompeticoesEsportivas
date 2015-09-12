package competicoesesportivas;

public class CompeticoesEsportivas {

    public static void main(String[] args) {
        // TODO code application logic here
        Competidor competidor = new Competidor();
        competidor.setId(0);
        competidor.setNome("Ricardo");
        CompetidorDAO cdao = new CompetidorDAO();
        cdao.insert(competidor);
        
    }
    
}
