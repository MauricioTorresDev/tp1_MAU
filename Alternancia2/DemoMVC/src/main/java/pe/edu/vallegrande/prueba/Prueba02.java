package pe.edu.vallegrande.prueba;

import pe.edu.vallegrande.service.MateService;

public class Prueba02 {

    public static void main(String[] args) {
        // Datos
        int n1 = 15;
        int n2 = 20;
        // Proceso
        MateService service = new MateService();
        int mcm = service.calcularMCM(n1,n2);
        // Reporte
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("mcm: " + mcm);
    }

}
