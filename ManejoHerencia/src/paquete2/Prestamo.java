package paquete2;
import paquete5.*;
public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;

    public Prestamo(Persona b, int t, String c) {
        beneficiario = b;
        tiempoPrestamo = t;
        ciudadPrestamo = c;

    }

    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }

    public void establecerTiempoPrestamo(int t) {
        tiempoPrestamo = t;
    }

    public void establecerCiudadPrestamo(String c) {
        ciudadPrestamo = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiario: %s\n"
                + "Tiempo del préstamo (meses): %d\n"
                + "Ciudad: %s\n",
                beneficiario, tiempoPrestamo, ciudadPrestamo);
        return cadena;
    }
}
