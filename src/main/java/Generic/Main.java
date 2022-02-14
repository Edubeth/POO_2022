package Generic;

public class Main {
    public static void main (String [] args) {
        GenericTupla<Integer, String> point1 = new GenericTupla<>(1, "Elizabeth");
        GenericTupla<Integer, String> point2 = new GenericTupla<>(2, "Elizabeth");
        ObjectTupla objTuple = new ObjectTupla(3, "Damara");
        boolean isEqual = Utilities.compare(point1, point2);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(objTuple);
        System.out.println("Comparacion de tuplas con el metodo equals: " + point1.equals(point2));
        System.out.println("Comparacion de tuplas con la clase utilities: " + isEqual);
        System.out.println("Comparacion de tupla point2 y objTuple: " + Utilities.compare(point2, objTuple));
    }
}
