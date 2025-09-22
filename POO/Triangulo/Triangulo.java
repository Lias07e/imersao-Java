package Triangulo;

public class Triangulo {
   
    private int idTriangulo;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double area;
    private String tipo;



 public Triangulo( int idTriangulo, double ladoA 
                   ,double ladoB , double ladoC ){

   this.idTriangulo = idTriangulo;
   this.ladoA = ladoA;
   this.ladoB = ladoB;
   this.ladoC = ladoC;
   
    
 }

    

 public int getIdTriangulo() {
    return idTriangulo;
 }
 
 public double getLadoA() {
    return ladoA;
 }

 public double getLadoB() {
    return ladoB;
 }

 public double getLadoC() {
    return ladoC;
 }

 public double getArea() {
    return area;
 }

 public String getTipo() {
    return tipo;
 }

  public double calcularArea(double ladoA, double ladoB, double ladoC){

 double Sp = (ladoA + ladoB + ladoC ) / 2;
       area =  Math.sqrt(Sp * (Sp - ladoA) * (Sp - ladoB) * (Sp - ladoC));

  if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoC + ladoA > ladoB){
     System.out.println(" Isso é um triangulo");
  }
  else {
  }
  return area;

  }



  public String definirTipo(double area){

   if(ladoA ==ladoB && ladoB == ladoC){
    System.out.println("Equilatero");
 }

  if(ladoA == ladoB && ladoB != ladoC){
    System.out.println("Isosceles");
  }

  if(ladoA != ladoB && ladoB != ladoC){
    System.out.println("Escaleno");
  }

  else{
    System.out.println("Indefinido");
  }
    return tipo;
  }

}
