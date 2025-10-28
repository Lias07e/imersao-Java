package MeUp1;
import java.util.Scanner;

public class MotorTeste {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);


        Motor motor1 = new Motor("Honda" ,650 ,"Gasolina");
        Motor motor2 = new Motor("Fan" , 160,"Gasolina");


        int  ligar;
         System.out.println("Qual motor deseja ligar ?");
          ligar = sc.nextInt();

        if(ligar == 1){
            motor1.ligarMotor();
            motor2.desligarMotor();
            System.out.println("Motor 1 , ligado");
        }
        else{
            motor1.desligarMotor();
            motor2.ligarMotor();
            System.out.println("Motor 2 , foi desligado");
        }


        System.out.println("===============================================" + "\n");
         System.out.println(motor1.getCilindrada() + "  Cilindradas do motor1:" );
         System.out.println(motor1.getModelo() + "  modelo do motor1:");

        System.out.println("===============================================" + "\n");
        System.out.println(motor2.getCilindrada() + " Cilindradas do motor2:" );
        System.out.println(motor2.getModelo() + "  modelo do motor2:");

    }



}
