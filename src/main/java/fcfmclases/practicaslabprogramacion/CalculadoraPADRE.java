/**
 * @since 03/03/2022
 * @author Omar Gallegos
 */
public class CalculadoraPADRE {
//P R O P I E D A D E S
    private String marca;
//M E T O D O S
    public double suma(double a, double b){
    return a+b;
    }
    
    public double resta(double a, double b){
    return a-b;
    }
    
//ENCAPSULAMIENTO (GET Y SET)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
