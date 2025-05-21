import java.util.Scanner;

public class Calculadora{

    public int Sumar(int a, int b){
        return a + b;
    }
   public int Sumar(int a, int b, int c){

    return a + b +c;
   }
   public double Sumar(double a, double b){
    return a + b;
   }
   public double Sumar(double a, double b, double c){

    return a + b + c;
   }

   public int Resta(int a, int b){

    return a - b;
   }
   public int Resta(int a, int b, int c){

    return a - b - c;
   }
   public double Resta(double a, double b){

    return a - b;
   }
   public double Resta(double a, double b, double c){

    return a - b - c;
   }
   //MULTIPLICACION
   public int Multiplicacion(int a, int b){

    return a * b;
   }
   public int Multiplicacion(int a, int b, int c){

    return a * b * c;
   }
   public double Multiplicacion(double a, double b){

    return a * b;
   }
   public double Multiplicacion(double a, double b, double c){

    return a * b *c;
   }
   //DIVISION
   public int Division(int a, int b){

    return a / b;
   }
   public int Division(int a, int b, int c){

    return a / b / c;
   }
   public double Division(double a, double b){

    return a / b;
   }
   public double Division(double a, double b, double c){

    return a / b / c;
   }
}
    public static void main(String[] args){
        //Instanciar objeto
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de a");
        int scannerInt= scanner.nextInt();
        System.out.println("Ingrese el valor de b");
        int scannerInt2 = scanner.nextInt();
        System.out.println("Ingrese el valor de c");
        int scannerInt3 = scanner.nextInt();

        double scannerdouble1= scanner.nextdoubl();
        System.out.println("Ingrese el valor de b");
        double scannerDouble2 = scanner.nextDouble();
        System.out.println("Ingrese el valor de c");
        double scannerDouble3 = scanner.nextDouble();
    }
