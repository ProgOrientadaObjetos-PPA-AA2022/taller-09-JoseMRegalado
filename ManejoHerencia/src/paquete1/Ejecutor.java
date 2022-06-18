package paquete1;

import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.*;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String cadenaa = "";
        String cadenae = "";
        String pregunta = "";
        int op;
        do{
        System.out.println("Que tipo de prestamo desea solicitar:\n"
                + "1. Prestamo Automovil\n"
                + "2. Prestamo Educativo\n"
                + "0. Finalizar Programa");
        op = sc.nextInt();
        sc.nextLine();

        if (op == 1 || op == 2) {

            System.out.println("\nIngrese el nombre del beneficiario");
            String beneficiario = sc.nextLine();
            System.out.println("Ingrese el apellido del beneficiario");
            String apellido = sc.nextLine();
            System.out.println("Ingrese el username del beneficiario");
            String username = sc.nextLine();
            System.out.println("Ingrese la cantidad de meses a pagar el "
                    + "préstamo");
            int meses = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la ciudad");
            String ciudad = sc.nextLine();

            Persona persona = new Persona(beneficiario, apellido, username);
            persona.establecerNombre(beneficiario);
            persona.establecerApellido(apellido);
            persona.establecerUsername(username);

            switch (op) {

                case 1:
                    do {
                        System.out.println("Ingrese el tipo de automovil");
                        String tipo = sc.nextLine();
                        System.out.println("Ingrese la marca del automovil");
                        String marca = sc.nextLine();
                        System.out.println("Ingrese el nombre del garante");
                        String nomG = sc.nextLine();
                        System.out.println("Ingrese el apellido del garante");
                        String apeG = sc.nextLine();
                        System.out.println("Ingrese el username del garante");
                        String userG = sc.nextLine();
                        System.out.println("Ingrese el valor del automovil");
                        double valorA = sc.nextDouble();
                        

                        Persona garante1 = new Persona(nomG, apeG, userG);
                        garante1.establecerNombre(nomG);
                        garante1.establecerApellido(apeG);
                        garante1.establecerUsername(userG);

                        PrestamoAutomovil pa1 = new PrestamoAutomovil(persona, meses,
                                ciudad, tipo, marca, garante1, valorA);
                        pa1.establecerBeneficiario(persona);
                        pa1.establecerTiempoPrestamo(meses);
                        pa1.establecerCiudadPrestamo(ciudad.toLowerCase());
                        pa1.establecerTipo(tipo);
                        pa1.establecerMarca(marca);
                        pa1.establecerGarante(garante1);
                        pa1.establecerValorAutomovil(valorA);
                        pa1.calcularValorMensual();

                        System.out.println("Desea solicitar otro prestamo. Digite la letra"
                                + " S para continuar o digite la letra N para salir");
                        sc.nextLine();
                        pregunta = sc.nextLine();

                        cadenaa = String.format("%s%s\n", cadenaa, pa1);

                    } while (pregunta.equals("S"));
                    System.out.println(cadenaa);
                    break;

                case 2:
                    do {
                        System.out.println("Ingrese su nivel de estudio");
                        String nivel = sc.nextLine();
                        System.out.println("Ingrese el nombre del Centro educativo");
                        String nomC = sc.nextLine();
                        System.out.println("Ingrese las siglas del Centro Educativo");
                        String siglas = sc.nextLine();
                        System.out.println("Ingrese el valor de la carrera");
                        double valorC = sc.nextDouble();
                        

                        InstitucionEducativa e1 = new InstitucionEducativa(nomC,
                                siglas);

                        PrestamoEducativo pe1 = new PrestamoEducativo(persona,
                                meses, ciudad, nivel, e1, valorC);

                        pe1.establecerBeneficiario(persona);
                        pe1.establecerTiempoPrestamo(meses);
                        pe1.establecerCiudadPrestamo(ciudad.toUpperCase());
                        pe1.establecerNivelEstudio(nivel);
                        pe1.establecerCentroEducativo(e1);
                        pe1.establecerValorCarrera(valorC);
                        pe1.calcularValorMensual();

                        System.out.println("Desea solicitar otro prestamo. Digite la letra"
                                + " S para continuar o digite la letra N para salir");
                        sc.nextLine();
                        pregunta = sc.nextLine();

                        cadenae = String.format("%s%s\n", cadenae, pe1);

                    } while (pregunta.equals("S"));
                    System.out.println(cadenae);
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese 1 o 2");

            }

        } else if(op != 0) {
            System.out.println("Opcion no valida, ingrese 1 o 2");
        }else{
            System.out.println("Programa finalizado");
        }
        }while(op != 0);
    }
}
