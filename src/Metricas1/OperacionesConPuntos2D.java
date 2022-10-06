/**
 *  Programa que permitirá realizar
 *  operaciones con puntos en la forma P = (x,y)
 *
 *  NOTA: DEBEN IMPLEMENTAR LOS MÉTODOS
 *
 *  Curso: Matemáticas para ciencias Aplicadas
 *
 *  Temas:  Función distancia, producto punto y
 *          su aplicación para obtener el área
 *
 *  @author Roberto Méndez Méndez
 *  @version  22-Septiembre-22
 */


package Metricas1;

public class OperacionesConPuntos2D {


    public static double normaEuclideana(Punto2D p) {
        double norma = metricaEuclidiana(new Punto2D(), p);
        return norma;
    }

    public static double metricaEuclidiana(Punto2D a, Punto2D b) {
        double distanciaAB = Math.sqrt(Math.pow( (a.getX() - b.getX()) , 2) + Math.pow( (a.getY() - b.getY()) , 2));
        return distanciaAB;
    }

    public static double metricaTaxista(Punto2D a, Punto2D b) {
        double distanciaT = Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY());
        return distanciaT; }

    public static double dotProduct(Punto2D a, Punto2D b) {
        double producto = (a.getX()*b.getX()) + (a.getY()*b.getY());
        return producto; }

    public double areaPalalelogramo(Punto2D a, Punto2D b) {
        double area = Math.abs(a.getX() * a.getY()) / 2;
        return area; }
}
