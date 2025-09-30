import java.util.Scanner;

public class PracticaEjercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tiempoInicial = System.nanoTime();
//        System.out.println("Ingrese los elementos separados por espacio:");
//        String[] entrada = sc.nextLine().split(" ");
//        System.out.println("Ingrese el valor de T:");
//        int T = sc.nextInt();
        String [] entrada = {"A", "B", "C", "D", "E", "F", "G", "H"};
        int T = 3;

        if (entrada.length % 2 != 0 || T < 1 || T >= entrada.length) {
            System.out.println("Entrada inválida.");
            return;
        }

        String[] arreglo = entrada;
        int mitad = arreglo.length / 2;

        for (int i = 1; i <= T; i++) {

            if (i % 2 != 0) {
                rotarElementos(arreglo, 0, mitad - 1);
            } else  {
                rotarElementos(arreglo, mitad, arreglo.length - 1);
            }


        }

        System.out.println("Resultado:");
        for (String s : arreglo) {
            System.out.print(s + " ");
        }
        sc.close();
        System.out.println("Tiempo de Ejecución: " + ((System.nanoTime() - tiempoInicial) / 1_000_000.0) + " miliSegundos");
    }

    public static void rotarElementos(String[] arr, int inicio, int fin) {
        String temp = arr[fin];
        for (int i = fin; i > inicio; i--) {
            arr[i] = arr[i - 1];
        }
        arr[inicio] = temp;
    }

}