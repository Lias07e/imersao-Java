package ControleTelevisao;


public class ControleTelevisao {
   
//atributos


private int idControle;
private String modelo;
private int canalAtual;
private boolean ligado;


//construtores


public ControleTelevisao(int idControle, String modelo){
    this.idControle = idControle;
    this.modelo = modelo;
    this.canalAtual = 0;
    this.ligado = false;
}




boolean ligarDesligar(){
    ligado = !ligado;


    if(this.ligado){
        this.canalAtual= 1 ;
    }
    else{
         this.canalAtual= 0 ;
    }
    return this.ligado;
}
int avancarCanal(){
    if(canalAtual < 5){
  canalAtual++;
    }
    else{


        canalAtual = 1;
    }
    return  canalAtual;
}


int retornarCanal(){
    if(canalAtual > 1){
        canalAtual--;
    }
    else{
        canalAtual = 5;
    }
    return canalAtual;
}


int irParaCanal(int canal){
    if(canal >= 1 && canal <= 5){
      return canalAtual = canal;
    }
    else {
        return canalAtual = -1;
    }


}


//metodos


public int getIdControle(){
      return idControle;
  }




public String getModelo(){
     return modelo;
 }




public int getCanalAtual(){
     return canalAtual;
 }
 
public boolean getLigado(){
     return ligado;
 }




}

