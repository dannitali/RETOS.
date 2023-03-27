import java.util.Scanner;
import java.util.Random;
public class reto5 {
    public static void main(String [] args){

        String nombre , usuario;
        int vidas = 3;
        int opcion =1 , i=0;
        String opciones;

        Random random = new Random();
        Scanner juego = new Scanner(System.in);

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");

        System.out.println("Digite su nombre");
        nombre=juego.nextLine();

        while(opcion==1){

        int maquina = random.nextInt(3); // Se genera un numero aleatorio entre 0 , 1 y  2
        
        System.out.println("Juega piedra, papel o tijera: ");
        opciones = juego.next();

        switch(opciones) {
            case "piedra":
                if (maquina == 0) {
                    System.out.println("La máquina eligió piedra. ¡Empate!");
                } else if (maquina == 1) {
                    System.out.println("La máquina eligió papel. ¡Perdiste!");
                    vidas--;
                } else {
                    System.out.println("La máquina eligió tijera. ¡Ganaste!");
                }
                break;
            case "papel":
                if (maquina == 0) {
                    System.out.println("La máquina eligió piedra. ¡Ganaste!");
                } else if (maquina == 1) {
                    System.out.println("La máquina eligió papel. ¡Empate!");
                } else {
                    System.out.println("La máquina eligió tijera. ¡Perdiste!");
                    vidas--;
                }
                break;
            case "tijera":
                if (maquina == 0) {
                    System.out.println("La máquina eligió piedra. ¡Perdiste!");
                    vidas--;
                } else if (maquina == 1) {
                    System.out.println("La máquina eligió papel. ¡Ganaste!");
                } else {
                    System.out.println("La máquina eligió tijera. ¡Empate!");
                }
                break;
            default:
                System.out.println("Su opcion es inválida.");
                break;
        }


        System.out.println("Vidas :");
        System.out.println("Sus vidas son : " + vidas);

        if (vidas==0) {
            System.out.println("Desea recargar las vidas para volver a jugar, 1 para si 0 para no");
            opcion=juego.nextInt();
            i++; 

        }

        }
        System.out.println("Gracias por jugar ");

        juego.close();

    }

}
    

