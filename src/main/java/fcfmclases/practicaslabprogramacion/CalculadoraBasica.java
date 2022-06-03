/**
 * @since 03/03/2022
 * @author Omar Gallegos
 */
public class CalculadoraBasica extends CalculadoraPADRE {
 //P R O P I E D A D E S
    private String modelo;
 //M E T O D O S
    public double multpli (double a, double b){
    return a*b;
    }
    
    public double divi (double a, double b){
    return a/b;
    }
    
//ENCAPSULAMIENTO (GET Y SET)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
