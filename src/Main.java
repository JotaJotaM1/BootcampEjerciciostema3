public class Main {

    public static void main(String[] args) {
        sumaDeTresNumeros(20,20,20);
        coche miCoche = new coche();
        miCoche.agregarPuerta();
        miCoche.mostrarNumeroDePuertas();
        miCoche.agregarPuerta();
        miCoche.mostrarNumeroDePuertas();
        miCoche.agregarPuerta();
        miCoche.mostrarNumeroDePuertas();
        miCoche.agregarPuerta();
        miCoche.mostrarNumeroDePuertas();
    }

    public static void sumaDeTresNumeros(int num1, int num2, int num3){
        int operacion;
        operacion = num1 + num2 + num3;
        System.out.println("suma de tres numeros, primera parte ejercicio: " + operacion);
    }
}