package Impressao;

public class Impressao {

    private static int ultimoId = 0;
    private int id;
    private String nomeArquivo;
    private boolean status;

    public Impressao( String nomeArquivo) {
        this.id = ++ultimoId;
        this.nomeArquivo = nomeArquivo;
        this.status = false;
    }

public void registrarInicio(String nomeArquivo){
      this.status = true;

}

    //getters

    public int getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    @Override
    public String toString() {
        return "Impressao{" +
                "id=" + id +
                ", nomeArquivo='" + nomeArquivo + '\'' +
                ", status=" + status +
                '}';
    }
}
