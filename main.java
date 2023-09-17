public class Main {
    public static void main(String[] args) {
        Cola_circular colaMeses = new Cola_circular(12);

        // Agregar nombres de los meses a la cola
        colaMeses.Agregar("Enero");
        colaMeses.Agregar("Febrero");
        colaMeses.Agregar("Marzo");
        colaMeses.Agregar("Abril");
        colaMeses.Agregar("Mayo");
        colaMeses.Agregar("Junio");
        colaMeses.Agregar("Julio");
        colaMeses.Agregar("Agosto");
        colaMeses.Agregar("Septiembre");
        colaMeses.Agregar("Octubre");
        colaMeses.Agregar("Noviembre");
        colaMeses.Agregar("Diciembre");

        // Mostrar el número de elementos en la cola
        System.out.println("Número de elementos en la cola: " + colaMeses.num_elementos());

        // Verificar si la cola está vacía
        System.out.println("¿La cola está vacía? " + colaMeses.Esta_vacia());

        // Sacar elementos de la cola y mostrarlos
        System.out.println("Sacando elementos de la cola:");
        while (!colaMeses.Esta_vacia()) {
            System.out.println(colaMeses.Sacar());
        }

        // Verificar si la cola está vacía después de sacar todos los elementos
        System.out.println("¿La cola está vacía? " + colaMeses.Esta_vacia());
    }
}
