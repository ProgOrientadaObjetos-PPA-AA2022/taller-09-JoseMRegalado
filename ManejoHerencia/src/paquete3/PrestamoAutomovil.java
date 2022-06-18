package paquete3;
import paquete5.Persona;
import paquete2.Prestamo;
public class PrestamoAutomovil extends Prestamo{
    protected String tipo;
    protected String marca;
    protected Persona garante1;
    protected double valorAutomovil;
    protected double valorMensual;

    public PrestamoAutomovil(Persona b, int tp, String c, String t, String m, 
            Persona g, double va) {
        super(b, tp, c);
        tipo = t;
        marca = m;
        garante1 = g;
        valorAutomovil = va;
        

    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerGarante(Persona g) {
        garante1 = g;
    }

    public void establecerValorAutomovil(double v) {
        valorAutomovil = v;
    }

    public void calcularValorMensual() {
        valorMensual = valorAutomovil / tiempoPrestamo;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String cadenaFinal = "\nPRESTAMO AUTOMOVIL\n";
        cadenaFinal = String.format("%s\n%s",cadenaFinal, super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de automóvil: %s\n"
                + "Marca de automóvil: %s\n"
                + "Garante: %s\n"
                + "Valor de automóvil: %.2f\n"
                + "Valor mensual de pago: %.2f\n",
                cadenaFinal,
                obtenerTipo(),
                obtenerMarca(),
                obtenerGarante(),
                obtenerValorAutomovil(),
                obtenerValorMensual());


        return cadenaFinal;
    }
}
