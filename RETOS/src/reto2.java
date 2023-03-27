import java.util.Scanner;
public class reto2 {
    public static void main(String[] args ){
         String nombrebebe , nombremedico , nombrevacuna , eps;
         int  meses, pesobebe, dosisvacuna ;
         
        Scanner lectura=new  Scanner(System.in);

        System.out.print("Por favor ingrese el nombre del bebé : ");
        nombrebebe = lectura.nextLine();

        System.out.print("Por favor ingrese los meses del bebé : ");
        meses = lectura.nextInt();

        System.out.print("Por favor ingrese el peso del bebé : ");
        pesobebe = lectura.nextInt();

        System.out.print("Por favor ingrese el nombre del medico : ");
        nombremedico = lectura.next();
        lectura.nextLine(); 
        
        System.out.print("Por favor ingrese el nombre de la vacuna : ");
        nombrevacuna = lectura.nextLine();

        System.out.print("Por favor ingrese el nombre de la eps : ");
        eps = lectura.nextLine();

        dosisvacuna =  (pesobebe +15 / meses * 15 ) * 10;

        System.out.println("Al bebe "+ nombrebebe+ " de eps "+ eps+ " atendido por " + nombremedico + " se le debe aplicar " +dosisvacuna+ " de la vacuna " +nombrevacuna);




        lectura.close();
    }
    
}
