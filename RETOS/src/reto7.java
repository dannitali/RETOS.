import java.util.Scanner;
public class reto7 {
    
    public static void main(String [] args){

        String nombre , documento, correoelectronico; 
        int documento1, numero, edad, n=1 , i=0;

        Scanner captura=new Scanner(System.in);


        while (n==1){

            System.out.println("FORMULARIO DE REGISTRO");

            captura.nextLine();

            System.out.println("Digite su nombre"); 
            nombre= captura.nextLine(); 
            
            System.out.println("Digite su Correo Electronico");
            correoelectronico = captura.nextLine();
    
            System.out.println("Digite su tipo de Documento");
            documento = captura.nextLine();
    
            System.out.println("Digite su Documento");
            documento1 = captura.nextInt();
    
            System.out.println("Digite su telefono");
            numero = captura.nextInt();
    
            System.out.println("Digite su edad");
            edad = captura.nextInt();

            System.out.println("desea registrar otra respuesta , 1 para si 0 para no");
            n=captura.nextInt();
            i++;

        }

        System.out.println("Gracias por llenar el formulario");

        System.out.println();
        captura.close();        


    }
}
