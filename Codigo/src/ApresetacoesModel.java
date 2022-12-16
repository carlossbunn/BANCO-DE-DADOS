
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
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
public class ApresetacoesModel {

    static void create(ApresetacoesBean m, Connection con) throws SQLException {
        PreparedStatement st;
        
            st = con.prepareStatement("INSERT INTO apresentacoes (idShow, Nome, datadShow, Hora) VALUES (?,?,?,?)");                 
            st.setInt(1, m.getidShow());        
            st.setString(2, m.getNome());            
            st.setString(3, m.getdatadShow());            
            st.setString(4, m.getHora());
            st.execute();
            st.close();
            
    }
 
    
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT idShow, nome, datadShow,hora FROM apresentacoes";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new ApresetacoesBean(result.getInt(1), result.getString(2), result.getString(3),result.getString(4)));
            }
        return list;
    }    

    static HashSet listAllApresetacoes(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT idArtista, Nome, idade FROM artistas NATURAL JOIN apresentacoes";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            ApresetacoesBean mb = new ApresetacoesBean(result.getInt(1), result.getString(2), result.getString(3), 
                result.getString(4));
            ArtistasBean a = new ArtistasBean(result.getInt(5), result.getString(6), result.getInt(7));
            mb.setArtistas(a);
            list.add(mb);
        }
        return list;
    }
}
