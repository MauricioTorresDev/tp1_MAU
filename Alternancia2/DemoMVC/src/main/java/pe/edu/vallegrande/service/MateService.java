package pe.edu.vallegrande.service;

import pe.edu.vallegrande.dto.RowDto;

import java.util.List;
import java.util.ArrayList;

public class MateService {

    // Método para calcular el MCD usando el Algoritmo de Euclides
    public int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMCD(b, a % b);
    }

    // Método para calcular el MCM a partir del MCD
    public int calcularMCM(int a, int b) {
        return (a * b) / calcularMCD(a, b);
    }

    public List<RowDto> tablaMultiplicar(int num){
        List<RowDto> lista = new ArrayList<>();
        int rpta;
        for(int i=1; i<=12; i++){
            rpta = i * num;
            RowDto bean = new RowDto(i,num,rpta,"*");
            lista.add(bean);
        }
        return lista;
    }

    public List<RowDto> tablaSumar(int num){
        List<RowDto> lista = new ArrayList<>();
        int rpta;
        for(int i=1; i<=12; i++){
            rpta = i + num;
            RowDto bean = new RowDto(i,num,rpta,"+");
            lista.add(bean);
        }
        return lista;
    }
}
