
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebeca
 */
public class ApresetacoesController {
    public void createApresentacao(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo show: ");
        
        System.out.print("idShow: ");
        int idShow = input.nextInt();
                
        input.nextLine();
        System.out.print(",nome: ");
        String nome = input.nextLine(); 
        
        System.out.print(", datadShow: ");
        String datadShow =input.nextLine();
        
        System.out.print(", Hora:");              
        String Hora = input.nextLine(); 
        
       
                
        
        
        ApresetacoesBean mb = new ApresetacoesBean(idShow, nome,datadShow,Hora);
        ApresetacoesModel.create(mb, con);
        System.out.println("Show criado com sucesso!!");     
    }

    void listadApresetacoes(Connection con) throws SQLException {
        HashSet all = ApresetacoesModel.listAll(con);
        Iterator<ApresetacoesBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    void ListaApresetacoesArtistas(Connection con) throws SQLException {
        HashSet all = ApresetacoesModel.listAllApresetacoes(con);
        Iterator<ApresetacoesBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
