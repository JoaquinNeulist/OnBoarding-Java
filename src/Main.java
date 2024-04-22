import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
      /*
      Tipos de Datos
      Primitivos
      No primitivos / Referenciados
      */
        /*
        ! Primitivos
        * numericos
        ? enteros
        ? int
        ? long
        ? Byte
        ? short

        * decimales
        ? float
        ? double

        * booleanos
        ? true / false

        * caracteres
        ? char

        * */
        /*
        ! No Primitivos / Referenciados / Wrappers (clases de datos)
        * Numericos
        ? Integer
        ? long
        ? Byte
        ? short
        * array
        ? ArrayList
        * Cadena de textos
        ? String
        * Clases / interfaces
        ? Personas
        ? Autos
        ? Error
        */
//        String nombreJugador = "Leonel";  //comillas simples son para los Char
//        String apellidoJugador = "Messi";
//        Byte camisetaDeMessi = 10;
//        Byte edad = 36;
//        int sumaedadYCamiseta = edad + camisetaDeMessi;
//        String[] arrayNombres = {"Jose", "Guille", "Joaco"};
//        int[] arrayNumeros = new int[5];
//        System.out.println(arrayNombres[0]);
//        System.out.println(arrayNumeros[0]);
//        System.out.println("suma edad =" + sumaedadYCamiseta);
//
//        //Operadores

        //Aritmeticos
        // +, -, *, /, %

        //Relacionales
        // ==, !=, >, <, <=, >=

        //Logiocs
        // &&, ||, !

        // Condicionales
        // if
        // else if
        // else
        // switch

        // Bucles
        // For
        // While
        // Do while

//        switch (edad) {
//            case 10:
//                System.out.println("el numero es el 10");
//                break;
//            default:
//                System.out.println("no es la 10");
//        }
//        for (int i = 0; i < arrayNumeros.length; i++) {
//            arrayNumeros[i] = i;
//            System.out.println(arrayNumeros[i]);
//            System.out.println("-----------------");
//        }
//        for (int element : arrayNumeros){
//            System.out.println(++element);
//        }
        // consola como prompt
        // Scanner con system.in
        Scanner scanner = new Scanner(System.in);
        Byte numeroCamiseta;
        numeroCamiseta = scanner.nextByte();
        String nombreJugador;
        nombreJugador = scanner.next();
        System.out.println("Numero de camiseta : "+ numeroCamiseta+" Nombre de jugador : " +nombreJugador);
    }
}