package MeUp1;

public class MotorTeste {
    public static void main (String[]args){

         //Motor mt = new Motor("Honda" , 650, "Gasolina");

        Motor [] mt = new Motor[2];
        mt[0] = new Motor("Honda" , 650 , "Gasolina");
        mt[1] = new Motor("Twiter" , 650 , "Gasolina");



        System.out.print(mt[0].desligarMotor());
        System.out.print(mt[0].desligarMotor());

        System.out.println(mt[1].ligarMotor());
        System.out.println(mt[1].desligarMotor());



        System.out.println(mt[0].toString());
        System.out.println(mt[1].toString());


    }
}


