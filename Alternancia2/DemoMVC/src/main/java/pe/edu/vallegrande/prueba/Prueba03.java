package pe.edu.vallegrande.prueba;

import java.util.List;

import pe.edu.vallegrande.dto.RowDto;
import pe.edu.vallegrande.service.MateService;

public class Prueba03 {

    public static void main(String[] args) {
        // Datos
        int num = 5;
        // Proceso
        MateService service = new MateService();
        List<RowDto> lista = service.tablaMultiplicar(num);
        // Reporte
        String repo = "";
        for(RowDto dto: lista){
            repo = "";
            repo += "" + dto.getNum1();
            repo += " " + dto.getOperador();
            repo += " " + dto.getNum2();
            repo += " = " + dto.getRpta();
            System.out.println(repo);
        }
    }

}
