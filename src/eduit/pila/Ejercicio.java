package eduit.pila;

public class Ejercicio {
    public static void m6 (int x) {
        System.out.println("Llegué a m6" + " " + x);
    }
    public static void m5(int x) {
       System.out.println("Antes de llamar a m6" + " "  + x);
        m6(x);
        System.out.println("Después de llamar a m6" + " "  + x);
    }
    public static void m4(int x) {
        System.out.println("Antes de llamar a m5" + " "  + x);
        m5(x);
        System.out.println("Después de llamar a m5" + " " + x);
    }
    public static void m3(int x) {
        System.out.println("Antes de llamar a m4" + " " + x);
        m4(x);
        System.out.println("Despúes de llamar a m4" + " " + x);
    }
    public static void m2(int x) {
        System.out.println("Antes de llamar a m3" + " " + x);
        m3(x);
        System.out.println("Después de llamar a m3" + " " + x);
    }
    public static void m1(int x){
        System.out.println("Antes de llamar a m2" + " " + x);
        m2(x);
        System.out.println("Después de llamar a m2" + " " + x);
    }
    public static void main (String[] args) {
        m1(1000);
    }
}