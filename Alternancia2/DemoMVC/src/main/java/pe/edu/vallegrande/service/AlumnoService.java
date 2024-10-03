package pe.edu.vallegrande.service;

import pe.edu.vallegrande.dto.AlumnoDto;
import pe.edu.vallegrande.service.spec.CrudSpec;

import java.util.List;

public class AlumnoService implements CrudSpec<AlumnoDto> {

    @Override
    public List<AlumnoDto> leerTodos() {
        return null;
    }

    @Override
    public List<AlumnoDto> leerTodos(AlumnoDto bean) {
        return null;
    }

    @Override
    public AlumnoDto leerPorId(int id) {
        return null;
    }

    @Override
    public AlumnoDto grabar(AlumnoDto bean) {
        return null;
    }

    @Override
    public AlumnoDto actualizar(AlumnoDto bean) {
        return null;
    }

    @Override
    public int eliminar(int id) {
        return 0;
    }

}
