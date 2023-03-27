import java.util.Scanner;
public class reto6 {

    public static void main(String [] args){

        String palabra = "amor" ;
        String  usuario;
        int cantidadpalabras, opcion=1 , i=0 ;

        Scanner captura=new Scanner(System.in);
        

        while(opcion==1) {
        
        System.out.println("¡Bienvenido al juego de Descubra la palabra!  ");

        System.out.println("Digite la cantidad de palabras que desea descubr");
        cantidadpalabras=captura.nextInt();

        System.out.println("LA PISTA ES LA SIGUIENTE : dicha palabra representa un sentimiento ");

        System.out.print("¿ Que palabra crees que púeda ser ?: ");
        usuario=captura.next();

        if (usuario==palabra){
                System.out.println("¡Felicidades! , has adivinado la palabra:) ");
        }
        else {
            System.out.println("Lo lamento , no adivinaste la palabra ");
        }

    
        System.out.println("desea volver  a jugar, digite 1 para si 0 para no");
        opcion=captura.nextInt();
        i++;

        }
        System.out.println(i);
        captura.close();
            
        }
        

        }
    
        



