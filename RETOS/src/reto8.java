import java.util.Random;
import java.util.Scanner;

public class reto8 {

    public static void main(String[] args) {

        int vidas1 = 3;
        int vidas2 = 3;
        int jugador1 = 1;
        int jugador2 = 2;
        int dado1 = 0;
        int dado2 = 0;
        int opcion =1 ;
        int i=0;

        Scanner juego = new Scanner(System.in);
        Random ran = new Random();

    while(opcion==1){

        System.out.println("¡Bienvenido al juego de dados!");
        System.out.println("Cada jugador tiene 3 vidas. El jugador con el número más alto en su dado gana.");

        if (vidas1 == 0 || vidas2 == 0) {
            vidas1 = 3;
            vidas2 = 3;
        }

        
        while (vidas1 > 0 && vidas2 > 0) {
            System.out.println("-----------------------");
            System.out.println("Jugador " + jugador1 + ", presione ENTER para lanzar los dados");
            juego.nextLine();
            System.out.println("Jugador " + jugador2 + ", presione ENTER para lanzar los dados");
            juego.nextLine(); 

            dado1 = ran.nextInt(6) + 1 ; // generar número aleatorio entre 1 y 6
            System.out.println("Jugador " + jugador1 + " sacó: " + dado1 );
                  
            dado2 = ran.nextInt(6) + 1; // generar número aleatorio entre 1 y 6
            System.out.println("Jugador " + jugador2 + " sacó: " + dado2 );

            if (dado1 > dado2) {
                System.out.println("El jugador uno gana");
                vidas2--;
            }
            else if (dado2>dado1){
                System.out.println("El jugador dos gana ");
                vidas1--;
            }
            else if (dado1==dado2){
                System.out.println("Empate");

            }

            System.out.println("Vidas:");
            System.out.println("Jugador 1: " + vidas1);
            System.out.println("Jugador 2: " + vidas2);
        }

        if (vidas1 > vidas2) {
            System.out.println("¡El jugador 1 gana el juego!");
        } else {
            System.out.println("¡El jugador 2 gana el juego!");
        } 


        System.out.println("desea registrar otra respuesta , 1 para si 0 para no");
        opcion = juego.nextInt();        
    }
        
        System.out.println("Gracias por jugar ");
        
        juego.close();
   
    } 
    
    
    
    }
    
    