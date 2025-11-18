package Impressora;

public class Aplicacao {
    public static void main(String [] args){

        Impressora il = new Impressora("Desjtop-123",1);

        if(il.finalizarImpressao() == false){
            System.out.println("Não tem impressão para finalizar");
        }

        il.receberImpressao("aula de poo");
        il.receberImpressao("curso de java");
        il.receberImpressao("aila de bd");


        System.out.println("============================");
        System.out.println(il);



        if(il.finalizarImpressao() == false){
            System.out.println("Não tem impressão para finalizar");
        }
        System.out.println("============================");
        System.out.println(il);


    }
}
