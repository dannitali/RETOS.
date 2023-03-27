import java.util.Random;
import java.util.Scanner;

public class  reto4 {
    public static void main(String[] args) {
        String nombre , usuario;
        int edad;
        String opciones;

        Random random = new Random();
        Scanner juego = new Scanner(System.in);

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");

        System.out.println("Digite su nombre");
        nombre=juego.nextLine();

        System.out.println("Digite su edad");
        edad=juego.nextInt();

        if (edad>=18 && edad<=100){
            
        int maquina = random.nextInt(3); // Se genera un numero aleatorio entre 0 , 1 y  2
        

        System.out.println("Juega piedra, papel o tijera: ");
        opciones = juego.next();

        switch(opciones) {
            case "piedra":
                if (maquina == 0) {
                    System.out.println("La máquina eligió piedra. ¡Empate!");
                } else if (maquina == 1) {
                    System.out.println("La máquina eligió papel. ¡Perdiste!");
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
                }
                break;
            case "tijera":
                if (maquina == 0) {
                    System.out.println("La máquina eligió piedra. ¡Perdiste!");
                } else if (maquina == 1) {
                    System.out.println("La máquina eligió papel. ¡Ganaste!");
                } else {
                    System.out.println("La máquina eligió tijera. ¡Empate!");
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        }
        else {
            System.out.println("Su edad no es valida ");
        }

        System.out.println("Gracias por jugar");

        juego.close();

    }
}