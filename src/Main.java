import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        float numeros []= new float [5];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int promedioMayores =0;
        int sumaMayores = 0;
        int contMayores = 0;
        for (float edad : numeros) {
            if (edad > 5) {
                sumaMayores += edad;
                contMayores++;
            }
        }
        promedioMayores = sumaMayores / contMayores;

        int mediaMenores =0;
        int sumaMenores = 0;
        int contMenores = 0;
        for (float edad : numeros) {
            if (edad <= 5) {
                sumaMenores += edad;
                contMenores++;
            }
        }
        mediaMenores = sumaMenores / contMenores;

        int cantidadCinco = 0;
        for (float edad : numeros) {
            if (edad == 5) {
                cantidadCinco++;
            }
        }
        System.out.println("El promedio de edad de los estudiantes mayores a 5 años es: " + promedioMayores);
        System.out.println("La media de edad de los estudiantes menores a 5 años es: " + mediaMenores);
        System.out.println("La cantidad de estudiantes que tienen 5 años exactamente es: " + cantidadCinco);
    }
}
