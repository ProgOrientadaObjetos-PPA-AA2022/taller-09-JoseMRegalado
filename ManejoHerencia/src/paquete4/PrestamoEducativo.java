package paquete4;
import paquete5.*;
import paquete2.Prestamo;
public class PrestamoEducativo extends Prestamo{
     protected String nivelEstudio;
    protected InstitucionEducativa centroEducativo;
    protected double valorCarrera;
    protected double valorMensual;

    public PrestamoEducativo(Persona b, int t, String cp, String ne,
            InstitucionEducativa ce, double vc) {
        super(b, t, cp);
        nivelEstudio = ne;
        centroEducativo = ce;
        valorCarrera = vc;
        

    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public void establecerCentroEducativo(InstitucionEducativa c) {
        centroEducativo = c;
    }

    public void establecerValorCarrera(double v) {
        valorCarrera = v;
    }

    public void calcularValorMensual() {
        valorMensual = (valorCarrera / tiempoPrestamo)- 
                ((valorCarrera / tiempoPrestamo) * 0.1);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String cadenaFinal = "\nPRESTAMO EDUCATIVO\n";
        cadenaFinal = String.format("%s%s",cadenaFinal, super.toString());
        cadenaFinal = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual de pago: %.2f\n",
                cadenaFinal,
                obtenerNivelEstudio(),
                obtenerCentroEducativo(),
                obtenerValorCarrera(),
                obtenerValorMensual());

        return cadenaFinal;
    }
}
