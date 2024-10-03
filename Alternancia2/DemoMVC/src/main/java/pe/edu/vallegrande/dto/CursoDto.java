package pe.edu.vallegrande.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CursoDto {

    private int id;
    private String nombre;
    private int vacantes;
    private int matriculados;
    private String profesor;
    private double precio;

}
