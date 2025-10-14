public class RacaTeste {
     public static void main(String[] args) {

         // declaro meu vetor(ARRAY) //
        Raca[] rc = new Raca[3];

        // aqui colocamos os meus parametros no vetor que declarei //
         rc[0] = new Raca(100, "Lobo Ibérico",
                         "Canídeo", "Espanha");

         rc[1] = new Raca(101, "Lobo hungaro",
                "Canídeo", "Espanha");

         rc[2] = new Raca(103, "lobo gigante",
                "Canídeo", "Espanha");

       

 System.out.println();
		
	    mostrarMensagem(rc[0].analisarExtincao(false, true, 
                                            true, true) == true,  
			   	        "Colocando o 1º elemento em extinção");
		
		mostrarMensagem(rc[3].analisarExtincao(true, true, 
                                            true, true) == true,
				        "Colocando o 4º elemento em extinção");

		mostrarMensagem(rc[0].analisarExtincao(false, true, 
                                            true, false) == false,  
	   	        "Colocando o 1º elemento fora de extinção");

    }

    static void mostrarMensagem(boolean teste, String texto){
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RED   = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println( (teste ? ANSI_GREEN + "Passou     ": ANSI_RED + "Não passou ") + 
        		             ANSI_RESET + texto);
    }

}


