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
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UsaOperacionesConPuntos2D {

    public static void main(String... something) {

        double ax = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x para el punto a"));
        double ay = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y para el punto a"));


        Punto2D a = new Punto2D(ax,ay);
        Punto2D b = new Punto2D();

        OperacionesConPuntos2D op = new OperacionesConPuntos2D();

        double norma = op.normaEuclideana(a);
        double metricaE = op.metricaEuclidiana(a,b);
        double metricaT = op.metricaTaxista(a,b);
        double producto = op.dotProduct(a,b);
        double areaTriangulo = op.areaPalalelogramo(a,b);


        JOptionPane.showMessageDialog(null, "La norma de " + a + " es : " + norma + "\n" +
                "\n" + "La diatancia del punto " + a + " al punto  "+ b + "  es: " + metricaE +  "\n" +
                "\n" + "El producto de los puntos " + a + " y " + b + " es: " + producto + "\n" +
                "\n" + "La métrica Manhhattan de los puntos " + a + " y " + b + " es: " + metricaT + "\n" +
                "\n" + "El área del triangulo formado entre el punto " + a + ", (" + a.getX()+ ",0.0) y " + b  + " es: "+ areaTriangulo);

    }
}
