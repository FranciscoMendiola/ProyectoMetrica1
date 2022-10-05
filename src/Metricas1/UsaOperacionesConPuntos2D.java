/**
 *  Programa que muestra el uso de las clases
 *  Punto2D y OperacionesConPuntos2D
 *
 *  Actividad a realizar:
 *  1.- Pedir los datos en enorno gráfico
 *  2.- Probar los métodos de OperacionesConPuntos2D
 *
 *   @version 22/Sep/22
 */

package Metricas1;

import java.util.Scanner;

public class UsaOperacionesConPuntos2D {

    public static void main(String... something){
        Punto2D a = new Punto2D(4,3);
        Punto2D b = new Punto2D();
        OperacionesConPuntos2D op = new OperacionesConPuntos2D();
        op.metricaEuclidiana(a,b);
        double norma = OperacionesConPuntos2D.normaEuclideana(a);
        double dAB = OperacionesConPuntos2D.metricaEuclidiana(a,b);
        System.out.println("La norma de " + a + " es : " + norma);
        System.out.println("La diatancia del punto " + a +
                            " al punto  "+ b + "  es: " + dAB);

        System.out.println("1111111111111111111");




    }
}
