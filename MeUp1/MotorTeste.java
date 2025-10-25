package MeUp1;

public class MotorTeste {
    public static void main (String[]args){

        Motor mt = new Motor("Honda" , 650, "Gasolina");


        System.out.println("============ TESTE DA CLASSE MOTOR ================");
        System.out.println(mt);

        System.out.println("============================");
        mt.ligarMotor();
        mt.ligarMotor();

         System.out.println("============================");
        mt.ligarMotor();
        mt.desligarMotor();
        
        System.out.println("============================");
        mt.desligarMotor();
        mt.desligarMotor();
        
        System.out.println(mt);




    }
}

