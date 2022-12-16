import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ArtistasController {
    
    public void createArtista(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a cadastrar um novo artista: ");
        System.out.print("idArtista: ");
        int idArtista = input.nextInt();
        System.out.print(", Nome: ");
        String Nome = input.next();
        System.out.print(", Idade: ");
        int Idade = input.nextInt();
        ArtistasBean ab = new ArtistasBean(idArtista, Nome, Idade);
        ArtistaModel.create(ab, con);
        System.out.println("Artista cadastrado com sucesso!!\n");
    }

    void listarArtista(Connection con) throws SQLException {
        HashSet all = ArtistaModel.listAll(con);
        Iterator<ArtistasBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
