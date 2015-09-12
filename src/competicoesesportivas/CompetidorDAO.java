
package competicoesesportivas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class CompetidorDAO {
    private Connection conn;
    private String SQL;
    
    public CompetidorDAO() {
        
    }
    public void finalize() {
        try{ 
            conn.close();
        } catch(Exception e) {
            System.out.println("Ocorreu um erro na classe competidordao " + e.getLocalizedMessage());
        }
    }
    public void insert(Competidor c) {
        SQL = "INSERT INTO Competidor (id, nome) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(SQL);
        stmt.setInt(1, c.getId());
        stmt.setString(2, c.getNome());
        stmt.execute();
        stmt.close();
    }
    public void update(Competidor c) {
        SQL = "UPDATE Competidor SET nome = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(SQL);
        stmt.setString(1, c.getNome());
        stmt.setInt(2, c.getId());
        stmt.execute();                        
        stmt.close();
    }
    public void delete(Competidor c) {
        SQL = "DELETE FROM Competidor WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(SQL);
        stmt.setInt(1, c.getId());
        stmt.execute();                        
        stmt.close();
    }
    public Competidor get(int id) {
        sql = "SELECT * FROM competidor WHERE id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = stmt.executeQuery();
        rs.next();

        Competidor competidor = new Competidor(rs.getInt(1), rs.getString(2));
        rs.close();
        stmt.close();
        return competidor;
    }   
    public ArrayList<Competidor> getCompetidores() {
        ArrayList<Competidor> retorno = new ArrayList<Competidor>();
        
        sql = "SELECT * FROM competidor";
        stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()) {
            Competidor c = new Competidor(rs.getInt(1), rs.getString(2));
            retorno.add(c);
        }
        rs.close();
        stmt.close();
        return retorno;        
    }    
}
