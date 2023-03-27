import java.util.Random;
import java.util.Scanner;

public class  reto3 {
    public static void main(String[] args) {
        String nombre;
        int edad, usuario;         

        Random random = new Random();
        Scanner juego = new Scanner(System.in);

        System.out.println("Bienvenido al juego de cara o sello");

        System.out.println("Digite su nombre");
        nombre=juego.nextLine();

        System.out.println("Digite su edad");
        edad=juego.nextInt();

        if ( edad>=18 && edad<=100) {
            System.out.println();

           int maquina = random.nextInt(2)+1; // Se genera un numero aleatorio entre 0 y 1 , el +1 es para que no empice d 0

        System.out.print("Elige Cara o Sello (1 para Cara, 2 para Sello): ");
        usuario = juego.nextInt();

        if(usuario == maquina){
            System.out.println("¡Ganaste , Felicidades!");
        } 
        else {
            System.out.println("Perdiste, Suerte para la proxima");
        }
        }
        else {
            System.out.println("Solo las personas mayores de edad y menores de 100 años pueden jugar");
        }

        System.out.println("Gracias por usar nuestro juego :)");

        juego.close();
        
        }
    }
