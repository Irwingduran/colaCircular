public class Cola_circular {
    private int Tamano;
    private int Frente;
    private int Final;
    private Object[] Arreglo;

    // Constructor
    public Cola_circular(int Tamano) {
        this.Tamano = Tamano;
        this.Frente = -1;
        this.Final = -1;
        this.Arreglo = new Object[Tamano];
    }

    // Agregar un elemento a la cola circular
    public void Agregar(Object b) {
        if (Esta_vacia()) {
            Frente = 0;
            Final = 0;
            Arreglo[Final] = b;
        } else {
            Final = (Final + 1) % Tamano;
            if (Frente == Final) {
                Frente = (Frente + 1) % Tamano; // Reemplazar el elemento en el frente si la cola está llena
            }
            Arreglo[Final] = b;
        }
    }

    // Sacar un elemento de la cola circular
    public Object Sacar() {
        Object elementoSacado = null;
        if (!Esta_vacia()) {
            elementoSacado = Arreglo[Frente];
            if (Frente == Final) {
                Frente = -1;
                Final = -1;
            } else {
                Frente = (Frente + 1) % Tamano;
            }
        }
        return elementoSacado;
    }

    // Obtener el número de elementos en la cola circular
    public int num_elementos() {
        if (Esta_vacia()) {
            return 0;
        } else if (Final >= Frente) {
            return Final - Frente + 1;
        } else {
            return (Tamano - Frente) + (Final + 1);
        }
    }

    // Verificar si la cola circular está vacía
    public boolean Esta_vacia() {
        return Frente == -1;
    }
}
