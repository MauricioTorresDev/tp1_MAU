package pe.edu.vallegrande.prueba;

import pe.edu.vallegrande.dto.CursoDto;
import pe.edu.vallegrande.service.CursoService;

import java.util.List;

public class Prueba05 {

    public static void main(String[] args) {
        try {
            CursoService cursoService = new CursoService();
            List<CursoDto> lista = cursoService.leerTodos();
            for(CursoDto bean: lista){
                System.out.println(bean);
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
