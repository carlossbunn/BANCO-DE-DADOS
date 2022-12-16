/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebeca
 */
public class ArtistasBean {
   private int idArtista;
   private String Nome;
   private int Idade;
   
   public ArtistasBean(int idArtista, String Nome, int Idade) {
       this.idArtista= idArtista;
       this.Nome = Nome;
       this.Idade = Idade;
   }

  
    public int getidArtista() {
        return idArtista;
    }

    
    public void setidArtista(int idArtista) {
        this.idArtista = idArtista;
    }

  
    public String getNome() {
        return Nome;
    }

    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

  
    public int getIdade() {
        return Idade;
    }

    /**
     * @param andar the Idade to set
     */
    public void setIdade(int andar) {
        this.Idade = andar;
    }
   
    public String toString(){
        return "idArtista: "+idArtista+" Nome: "+Nome+" Idade: "+Idade;
    }

}