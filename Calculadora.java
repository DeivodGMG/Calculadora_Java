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
   //CLASE MAIN
   public static void main(String[] args){
    try (Scanner scanner = new Scanner(System.in)) {
        //Instanciar objetos
        Calculadora calculadora = new Calculadora();
        System.out.println("== Expresiones matematicas ==");
        System.out.print("Ingrese una expresion:\n");
        String expression = scanner.nextLine();
        char[] arrayExpression = expression.toCharArray();
        int resultado = 0;
        boolean primeraoleada = false; //Una vez hecho la operacion de los dos primeros numeros 
        for(int i = 0; i < expression.length(); i++){
            if(arrayExpression[i] == '+'){
                int antes = i - 1; //El numero antes del operador
                int despues = i + 1; //El numero despues del operador
                int num1 = Integer.parseInt(String.valueOf(arrayExpression[antes]));
                int num2 = Integer.parseInt(String.valueOf(arrayExpression[despues]));
                
                if(primeraoleada){
                    resultado = resultado + num2;
                }else{
                    resultado = resultado + calculadora.Sumar(num1, num2);
                          primeraoleada = true;
                }
                
            } 
                        if(arrayExpression[i] == '-'){
                           
                int antes = i - 1; //El numero antes del operador
                int despues = i + 1; //El numero despues del operador
                int num1 = Integer.parseInt(String.valueOf(arrayExpression[antes]));
                int num2 = Integer.parseInt(String.valueOf(arrayExpression[despues]));
                                if(primeraoleada){
                    resultado = resultado - num2;
                }else{
                           primeraoleada = true;
                    resultado = resultado + calculadora.Resta(num1, num2);
                }
            } 
                        if(arrayExpression[i] == '*'){
                          
                int antes = i - 1; //El numero antes del operador
                int despues = i + 1; //El numero despues del operador
                int num1 = Integer.parseInt(String.valueOf(arrayExpression[antes]));
                int num2 = Integer.parseInt(String.valueOf(arrayExpression[despues]));
                                if(primeraoleada){
                    resultado = resultado * num2;
                }else{
                    resultado = resultado + calculadora.Multiplicacion(num1, num2);
                           primeraoleada = true;
                }
            } 
                        if(arrayExpression[i] == '/'){
                          
                int antes = i - 1; //El numero antes del operador
                int despues = i + 1; //El numero despues del operador
                int num1 = Integer.parseInt(String.valueOf(arrayExpression[antes]));
                int num2 = Integer.parseInt(String.valueOf(arrayExpression[despues]));
                     if(primeraoleada){
                    resultado = resultado / num2;
                }else{
                           primeraoleada = true;
                    resultado = resultado + calculadora.Division(num1, num2);
                }
            } 
            
        }
        System.out.println("Resultado de la expresion: " + resultado);
        System.out.print("\n-------------------------------------");
        //Solicitar datos por consola
        System.out.println("Ingrese 3 numeros enteros:");
        int numInt1= scanner.nextInt();
        int numInt2= scanner.nextInt();
        int numInt3= scanner.nextInt();
        System.out.println("Ahora 3 numero decimales:");
        double numDouble1= scanner.nextDouble();
        double numDouble2= scanner.nextDouble();
        double numDouble3= scanner.nextDouble();
        //Programa para sumar
        System.out.println("-------------------------");
        System.out.println("== SUMAR == ");
        System.out.println("La suma de " + numInt1 + " + " + numInt2 + " = " + calculadora.Sumar(numInt1, numInt2) );
        System.out.println("La suma de " + numInt1 + " + " + numInt2 + " + " + numInt3 + " = " + calculadora.Sumar(numInt1, numInt2, numInt3) );
        System.out.println("La suma de " + numDouble1 + " + " + numDouble2 + " = " + calculadora.Sumar(numDouble1, numDouble2) );
        System.out.println("La suma de " + numDouble1 + " + " + numDouble2 + " + " + numDouble3 + " = " + calculadora.Sumar(numDouble1, numDouble2, numDouble3) );
        //Programa para restar
        System.out.println("-------------------------");
        System.out.println("== RESTAR == ");
        System.out.println("La resta de " + numInt1 + " - " + numInt2 + " = " + calculadora.Resta(numInt1, numInt2) );
        System.out.println("La resta de " + numInt1 + " - " + numInt2 + " - " + numInt3 + " = " + calculadora.Resta(numInt1, numInt2, numInt3) );
        System.out.println("La resta de " + numDouble1 + " - " + numDouble2 + " = " + calculadora.Resta(numDouble1, numDouble2) );
        System.out.println("La resta de " + numDouble1 + " - " + numDouble2 + " - " + numDouble3 + " = " + calculadora.Resta(numDouble1, numDouble2, numDouble3) );
        //Programa para multiplicar
        System.out.println("-------------------------");
        System.out.println("== MULTIPLICACION == ");
        System.out.println("La multiplicacion de " + numInt1 + " * " + numInt2 + " = " + calculadora.Multiplicacion(numInt1, numInt2) );
        System.out.println("La multiplicacion de " + numInt1 + " * " + numInt2 + " * " + numInt3 + " = " + calculadora.Multiplicacion(numInt1, numInt2, numInt3) );
        System.out.println("La multiplicacion de " + numDouble1 + " * " + numDouble2 + " = " + calculadora.Multiplicacion(numDouble1, numDouble2) );
        System.out.println("La multiplicacion de " + numDouble1 + " * " + numDouble2 + " * " + numDouble3 + " = " + calculadora.Multiplicacion(numDouble1, numDouble2, numDouble3) );
        //Programa para dividir
        System.out.println("-------------------------");
        System.out.println("== DIVISION == ");
        System.out.println("La division de " + numInt1 + " / " + numInt2 + " = " + calculadora.Division(numInt1, numInt2) );
        System.out.println("La division de " + numInt1 + " / " + numInt2 + " / " + numInt3 + " = " + calculadora.Division(numInt1, numInt2, numInt3) );
        System.out.println("La division de " + numDouble1 + " / " + numDouble2 + " = " + calculadora.Division(numDouble1, numDouble2) );
        System.out.println("La division de " + numDouble1 + " / " + numDouble2 + " / " + numDouble3 + " = " + calculadora.Division(numDouble1, numDouble2, numDouble3) );
    } //Try scanner

    } //Metodo main

}