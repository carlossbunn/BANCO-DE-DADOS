
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebeca
 */
public class ArtistaModel {

    public static void create(ArtistasBean a, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO artistas (idArtista, Nome, Idade) VALUES (?,?,?)");
            st.setInt(1, a.getidArtista());
            st.setString(2, a.getNome());
            st.setInt(3, a.getIdade());
            st.execute();
            st.close();  
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT idArtista, Nome, Idade FROM artistas";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new ArtistasBean(result.getInt(1), result.getString(2), result.getInt(3)));
            }
        return list;
    }
}
