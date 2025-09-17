public class Raca {
     private int idRaca;
     private String nome;
     private String especie;
     private String paisDeOrigem;
     private boolean riscoDeExtincao;

    public Raca(int idRaca, String nome, String especie, String paisDeOrigem){
         this.idRaca = idRaca;
         this.nome = nome;
         this.especie = especie;
         this.paisDeOrigem = paisDeOrigem;
       
    }
     public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
     public int getIdRaca(){
        return idRaca;
    }

    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }

    public String getPaisDeOrigem(){
        return paisDeOrigem;
    }

    public boolean isRiscoDeExtincao(){
        return riscoDeExtincao;
    }
 
    public boolean analisarExtincao(boolean c1, boolean c2, boolean c3, boolean c4 ){

      int pontos = (c1 ? 1 : 0) + (c2 ? 1 : 0) + (c3 ? 2 : 0) +(c4 ? 2 : 0);

      this.riscoDeExtincao = pontos >= 5  ? true : false ;
         return this.riscoDeExtincao;
    }

    }

