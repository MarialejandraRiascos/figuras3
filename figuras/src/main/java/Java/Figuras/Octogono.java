package Java.Figuras;
import java.util.Scanner;
public class Octogono extends Figura
{
    Scanner scanner = new Scanner(System.in);
    
    Double longitudP;
    Double respuestaP;
    Double perimetroA;
    Double apotemaA;
    Double respuestaA;

    public Octogono()
    {
    
    }
    
    public Octogono(Double longitudP, Double respuestaP, Double perimetroA, Double apotemaA, Double respuestaA) 
    {
        this.longitudP = longitudP;
        this.respuestaP = respuestaP;
        this.perimetroA = perimetroA;
        this.apotemaA = apotemaA;
        this.respuestaA = respuestaA;
    }
    
    public Double getLongitudP() {
        return longitudP;
    }

    public void setLongitudP(Double longitudP) {
        this.longitudP = longitudP;
    }

    public Double getRespuestaP() {
        return respuestaP;
    }

    public void setRespuestaP(Double respuestaP) {
        this.respuestaP = respuestaP;
    }

    public Double getPerimetroA() {
        return perimetroA;
    }

    public void setPerimetroA(Double perimetroA) {
        this.perimetroA = perimetroA;
    }

    public Double getApotemaA() {
        return apotemaA;
    }

    public void setApotemaA(Double apotemaA) {
        this.apotemaA = apotemaA;
    }

    public Double getRespuestaA() {
        return respuestaA;
    }

    public void setRespuestaA(Double respuestaA) {
        this.respuestaA = respuestaA;
    }

    public Double calcularPerimetro()
    {
        respuestaP = longitudP * 8;
    
        System.out.println("El perimetro del octogono es: " + respuestaP);
        return apotemaA;
    }
    
    public Double calcularArea()
    {
        respuestaA = (perimetroA * apotemaA) / 2;
    
        System.out.println("El area del octogono es: " + respuestaA);
        return apotemaA;
    }
}
     

