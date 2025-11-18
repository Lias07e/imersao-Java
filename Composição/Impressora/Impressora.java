package Impressora;

import Impressao.Impressao;

import java.util.ArrayList;
import java.util.List;

public class Impressora {
    private int id;
    private String tipo;
    private boolean imprinmindo;
    private List<Impressao> impressoes;

    public Impressora(String tipo, int id) {
        this.tipo = tipo;
        this.id = id;
        this.imprinmindo = false;
        this.impressoes = new ArrayList<>();
    }

    public void receberImpressao( String nomeArquivo){

        impressoes.add(new Impressao(nomeArquivo));

        if(impressoes.size()==1){
            impressoes.get(0).registrarInicio(nomeArquivo);
           this.imprinmindo = true;
        }
    }
public boolean finalizarImpressao(){

        if(impressoes.size()==0){
            return false;
        }
        impressoes.remove(impressoes.get(0));

        if (!impressoes.isEmpty()){
            impressoes.get(0).registrarInicio(impressoes.get(0).getNomeArquivo());
        }
        else {
            imprinmindo = false;
        }
        return true;
}

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isImprinmindo() {
        return imprinmindo;
    }

    public List<Impressao> getImpressoes() {
        return impressoes;
    }

    @Override
    public String toString() {
        return "Impressora{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", imprinmindo=" + imprinmindo +
                ", impressoes=" + impressoes +
                '}';
    }
}
