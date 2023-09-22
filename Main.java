public class Main {
    public static void main(String[] args) {
        ColaCircular cola = new ColaCircular(12);

        // Agregar nombres de los meses
        cola.agregar("Enero");
        cola.agregar("Febrero");
        cola.agregar("Marzo");
        cola.agregar("Abril");
        cola.agregar("Mayo");
        cola.agregar("Junio");
        cola.agregar("Julio");
        cola.agregar("Agosto");
        cola.agregar("Septiembre");
        cola.agregar("Octubre");
        cola.agregar("Noviembre");
        cola.agregar("Diciembre");

        // Mostrar el número de elementos en la cola
        System.out.println("Número de elementos en la cola: " + cola.numElementos());

        // Comprobar si la cola está vacía
        System.out.println("¿La cola está vacía? " + cola.estaVacia());

        // Sacar elementos de la cola y mostrarlos
        System.out.println("Elementos en la cola:");
        while (!cola.estaVacia()) {
            Object elemento = cola.sacar();
            System.out.println(elemento);
        }

        // Comprobar de nuevo si la cola está vacía después de sacar todos los elementos
        System.out.println("¿La cola está vacía ahora? " + cola.estaVacia());
    }
}
