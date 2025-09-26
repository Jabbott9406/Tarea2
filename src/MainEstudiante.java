import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainEstudiante {
    int matricula;
    String nombre;
    double indiceAcademico;

    public MainEstudiante(int matricula, String nombre, double indiceAcademico) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.indiceAcademico = indiceAcademico;
    }

    @Override
    public String toString() {
        return matricula + " - " + nombre + " - " + indiceAcademico;
    }

    public static List<MainEstudiante> ordenarMergeSort(List<MainEstudiante> lista, boolean ascendente) {
        if (lista.size() <= 1){
            return lista; //En caso de que la lista esté vacía o tenga un solo elemento.
        }

        int mid = lista.size() / 2;
        List<MainEstudiante> left = ordenarMergeSort(new ArrayList<>(lista.subList(0, mid)), ascendente);
        List<MainEstudiante> right = ordenarMergeSort(new ArrayList<>(lista.subList(mid, lista.size())), ascendente);

        List<MainEstudiante> temp = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (ascendente) {
                if (left.get(i).indiceAcademico <= right.get(j).indiceAcademico) {
                    temp.add(left.get(i++));
                } else {
                    temp.add(right.get(j++));
                }
            } else {
                if (left.get(i).indiceAcademico >= right.get(j).indiceAcademico) {
                    temp.add(left.get(i++));
                } else {
                    temp.add(right.get(j++));
                }
            }
        }

        while (i < left.size()) {
            temp.add(left.get(i++));
        }
        while (j < right.size()) {
            temp.add(right.get(j++));
        }

        return temp;
    }


//    public static int generarAleatorio(int min, int max) {
//        return (int) (Math.random() * (max - min + 1) + min);
//    }

    public static void main(String[] args) {
        ArrayList<MainEstudiante> lista = new ArrayList<MainEstudiante>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int matricula = 1000 + rand.nextInt(9000);
            String nombre = "Estudiante #" + i;
            double indice = Math.round((rand.nextDouble() * 5.0) * 100.0) / 100.0;
            MainEstudiante e = new MainEstudiante(matricula, nombre, indice);
            lista.add(e);
        }
        System.out.println("\nLista original:");
        for (MainEstudiante e : lista) {
            System.out.println(e);
        }

        List<MainEstudiante> listaOrdenadaAsc = ordenarMergeSort(lista, true);
        System.out.println("\nLista ordenada ascendente por Indice Academico:");
        for (MainEstudiante e : listaOrdenadaAsc) {
            System.out.println(e);
        }
        List<MainEstudiante> listaOrdenadaDesc = ordenarMergeSort(lista, false);
        System.out.println("\nLista ordenada descendente por Indice Academico:");
        for (MainEstudiante e : listaOrdenadaDesc) {
            System.out.println(e);
        }
    }
}