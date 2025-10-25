package MeUp1;

public class Motor {

    private String modelo;
    private int cilindrada;
    private boolean ligado;
    private String tipoCombustivel;

    Motor(String modelo, int cilindrada , String tipoCombustivel){
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.ligado = false;
        this.tipoCombustivel = tipoCombustivel;

    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void ligarMotor(){
        if(ligado){
            System.out.println("O motor já está ligado");
        }
        else{
            ligado = true;
            System.out.println("O motor ligou");
        }

    }

    public void desligarMotor(){
        if(!ligado){
            System.out.println("O motor já  desligado");
        }
        else{
            ligado = false;
            System.out.println("O motor foi desligado");
        }
    }

    @Override
    public String toString() {
        return  "=== DADOS DO MOTOR ===\n" +
                 "Modelo: " + modelo + "\n" +
                 "Cilindradas :" + cilindrada + "\n" +
                 "tipo de combustivel: " + tipoCombustivel + "\n"+
                 "Motor está ligado :" + ligado ;

    }
}


