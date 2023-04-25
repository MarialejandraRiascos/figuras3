package Java.Figuras;
import java.util.Scanner;
public class Rectangulo extends Figura
{
    Scanner scanner = new Scanner(System.in);

    Double base;
    Double altura;
    Double respuestaP;
    Double respuestaA;

    public Rectangulo()
    {

    }

    public Rectangulo(Double base,Double altura,Double respuestaP,Double respuestaA)
    {
        this.base = base;
        this.altura = altura;
        this.respuestaP = respuestaP;
        this.respuestaA = respuestaA;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
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
        respuestaP = base+altura;

        System.out.println("El perimetro del rectangulo es: " + respuestaP);
        return altura;
    }

    public Double calcularArea()
    {
        respuestaA = base*altura;

        System.out.println("El area del octogono es: " + respuestaA);
        return altura;
    }
}
