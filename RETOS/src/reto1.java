import java.util.Scanner;
public class reto1 {
  
    public static void main(String[] args ){
      
        Double  Fahrenheit, Kelvin , resultado1,  resultado2; 
        int Celsius=350 ;

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los centrigrados a convertir");
        Celsius = sc.nextInt();
     
        Fahrenheit = (Celsius * 1.8) + 32;
        Kelvin = Celsius + 273.15;

        resultado1 = Fahrenheit + 100;
        resultado2 = Kelvin + 100;

        System.out.println( "los " + Celsius + " grados celsius equivalen a " + resultado1 + " en grados Fahrenheit");
        System.out.println( "los " + Celsius + " grados celsius equivalen a " + resultado2 + " en grados Kelvin");

     sc.close();  
    }


}
