package Java.Figuras;
import java.util.Scanner;
public class Trapecio extends Figura
{
    Scanner scanner = new Scanner(System.in);

    Double base;
    Double lateral;
    Double respuestaP;
    Double respuestaA;

    public Trapecio()  
    {

    }

    public Trapecio(Double base,Double lateral,Double respuestaP,Double respuestaA)
    {
        this.base = base;
        this.lateral = lateral;
        this.respuestaP = respuestaP;
        this.respuestaA = respuestaA;
    }    

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getLateral() {
        return lateral;
    }

    public void setLateral(Double lateral) {
        this.lateral = lateral;
    }

    public Double getRespuestaP() {
        return respuestaP;
    }

    public void setRespuestaP(Double respuestaP) {
        this.respuestaP = respuestaP;
    }

    public Double getRespuestaA() {
        return respuestaA;
    }

    public void setRespuestaA(Double respuestaA) {
        this.respuestaA = respuestaA;
    }

    public Double calcularPerimetro()
    {
        respuestaP = base+lateral;

        System.out.println("El perimetro del trapecio es: " + respuestaP);
        return base;
    }

    public Double calcularArea()
    {
        respuestaA = (base+lateral)*2;

        System.out.println("El area del trapecio es: " + respuestaA);
        return base;
    }
}
