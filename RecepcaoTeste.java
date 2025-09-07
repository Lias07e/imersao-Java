package Recepcao;

public class RecepcaoTeste {
     public static void main(String[]args){

    //declara meu objeto
  Recepcao rep = new Recepcao();

  rep.nome = "Elias";
  rep.diarias = 5;
  rep.cpf = "130.394.784-60";
  rep.formaPagamento = "Debito";


System.out.println(rep.nome);
System.out.println(rep.cpf);
System.out.println(rep.diarias);
System.out.println(rep.formaPagamento);




}
}