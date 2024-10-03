package pe.edu.vallegrande.service;

import pe.edu.vallegrande.db.AccesoDB;
import pe.edu.vallegrande.dto.CursoDto;
import pe.edu.vallegrande.service.spec.CrudSpec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoService implements CrudSpec<CursoDto> {

    private final String SELECT_BASE = "select cur_id, cur_nombre, cur_vacantes, cur_matriculados, cur_profesor, cur_precio from curso";
    @Override
    public List<CursoDto> leerTodos() {
        Connection cn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<CursoDto> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            pstm = cn.prepareStatement(SELECT_BASE);
            rs = pstm.executeQuery();
            while(rs.next()){
                CursoDto bean = toDto(rs);
                lista.add(bean);
            }
            rs.close();
            pstm.close();
        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }catch (Exception e){
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            }catch (Exception e){
            }
        }
        return lista;
    }

    private CursoDto toDto(ResultSet rs) throws SQLException {
        CursoDto bean = new CursoDto();
        bean.setId(rs.getInt("cur_id"));
        bean.setNombre(rs.getString("cur_nombre"));
        bean.setVacantes(rs.getInt("cur_vacantes"));
        bean.setMatriculados(rs.getInt("cur_matriculados"));
        bean.setProfesor(rs.getString("cur_profesor"));
        bean.setPrecio(rs.getDouble("cur_precio"));
        return bean;
    }

    @Override
    public List<CursoDto> leerTodos(CursoDto bean) {
        return null;
    }

    @Override
    public CursoDto leerPorId(int id) {
        return null;
    }

    @Override
    public CursoDto grabar(CursoDto bean) {
        return null;
    }

    @Override
    public CursoDto actualizar(CursoDto bean) {
        return null;
    }

    @Override
    public int eliminar(int id) {
        return 0;
    }

}
