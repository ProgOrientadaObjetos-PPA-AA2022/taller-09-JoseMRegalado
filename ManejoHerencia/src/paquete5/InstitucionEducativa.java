package paquete5;

public class InstitucionEducativa {
    protected String nombre;
    protected String siglas;

    public InstitucionEducativa(String n, String s) {
        nombre = n;
        siglas = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Siglas: %s\n",
                nombre, siglas);
        return cadena;
    }
}
