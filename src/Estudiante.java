import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    int matricula;
    String nombre;
    double indiceAcademico;

    public Estudiante(int matricula, String nombre, double indiceAcademico) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.indiceAcademico = indiceAcademico;
    }

    @Override
    public String toString() {
        return matricula + "-" + nombre + "-" + indiceAcademico;
    }

    public static List<Estudiante> ordenarMergeSort(List<Estudiante> lista, boolean ascendente) {


    }


}





















  /*
        if (lista.size() <= 1) return lista;

        int medio = lista.size() / 2;
        List<Estudiante> izquierda = ordenarMergeSort(lista.subList(0, medio), ascendente);
        List<Estudiante> derecha = ordenarMergeSort(lista.subList(medio, lista.size()), ascendente);

        return merge(izquierda, derecha, ascendente);
    }

    private static List<Estudiante> merge(List<Estudiante> izq, List<Estudiante> der, boolean asc) {
        List<Estudiante> resultado = new ArrayList<>();
        int i = 0, j = 0;

        while (i < izq.size() && j < der.size()) {
            if ((asc && izq.get(i).indiceAcademico <= der.get(j).indiceAcademico) ||
                    (!asc && izq.get(i).indiceAcademico >= der.get(j).indiceAcademico)) {
                resultado.add(izq.get(i++));
            } else {
                resultado.add(der.get(j++));
            }
        }

        while (i < izq.size()) resultado.add(izq.get(i++));
        while (j < der.size()) resultado.add(der.get(j++));

        return resultado;
    }
    */