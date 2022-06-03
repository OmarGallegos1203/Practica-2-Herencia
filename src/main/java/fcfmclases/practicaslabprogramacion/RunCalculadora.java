import java.util.Scanner;      
/*No se que sea el package, pero me daba errores 
y cuando lo quite me dio menos¿?
*/
/**
 * @since 03/03/2022
 * @author Omar Gallegos
 */
public class RunCalculadora {
    public static void main(String[] args) {
        //SCANER
        System.out.println("\tCALCULADORA\n\n\nIngresa la marca: ");
        Scanner smrca = new Scanner(System.in);
        String mrca = smrca.nextLine();
        
        System.out.println("\nIngresa el modelo");
        Scanner smdlo = new Scanner(System.in);
        String mdlo = smdlo.nextLine();
        
        //OPERACIONES Y PRINT
        CalculadoraBasica casio = new CalculadoraBasica();
        casio.setMarca(mrca);
        casio.setModelo(mdlo);
        System.out.print("CALCULADORA:\nMarca: ");
        System.out.println(casio.getMarca());
        System.out.print("Modelo: ");
        System.out.println(casio.getModelo());
        System.out.println("Suma 7.5 + 13.56 = "+casio.suma(7.5, 13.56));
        System.out.println("Resta 8.48 - 6.96 ="+casio.resta(8.48, 6.96));
        System.out.println("Multiplicacion (6.16)*(1.38) ="+casio.multpli(6.16, 1.38));
        System.out.println("Division 20/19 = "+casio.divi(20, 19));
    } 
}