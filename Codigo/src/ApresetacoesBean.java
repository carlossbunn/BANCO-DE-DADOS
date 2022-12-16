
import java.util.HashSet;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebeca
 */
public class ApresetacoesBean {
   private int idShow;//codm
   private String Nome;//nome
   private String datadShow;//cidade
   private String Hora;//especialidade
 
   

    private ArtistasBean artistas;

   public ApresetacoesBean(int idShow, String Nome,String datadShow, String Hora) {
       this.idShow=idShow;
       this.Nome= Nome;
       this.datadShow = datadShow;
       this.Hora= Hora;
       
       
   }
    
   
    public int getidShow() {
        return idShow;
    }
    
    public void setidShow(int idShow) {
        this.idShow = idShow;
    }

    
   
    public String getNome() {
        return Nome;
    } 
    public void setNome(String nome) {
        this.Nome = nome;
    }
    
    /**
     *
     * @return
     */
    public String getdatadShow() {
        return datadShow;
    } 
    
    public void setdatadShow(String datadShow) {
        this.datadShow = datadShow;
    }
 
   
    
    public String getHora() {
        return Hora;
    }

    
    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    
   
    
    public ArtistasBean getArtistas() {
        return artistas;
    }

    public void setArtistas(ArtistasBean artistas) {
        this.artistas = artistas;
    }
    
    
   // return "Nroa: "+nroa+" capacidade: "+capacidade+" andar: "+andar;
   @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("codm: "+idShow+" nome: "+Nome+" idade: "+datadShow+" especialidade: "+Hora);
        if(artistas!= null)
            sb.append(" andar: "+artistas.getNome()+" capacidade: "+artistas.getIdade());
        return sb.toString();
    }  
}

