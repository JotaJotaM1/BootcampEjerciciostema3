public class coche {

    int numeroDePuertas = 0;

    coche(){
        System.out.println("Segunda parte del ejercicio: Constructor coche");
    }

    public void agregarPuerta(){
        numeroDePuertas ++;
        System.out.println("Se Agrego una puerta");
    }

    public void mostrarNumeroDePuertas(){
        System.out.println("La cantidad de puertas es " + numeroDePuertas);
    }
}
