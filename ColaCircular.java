public class ColaCircular {
    private int tamaño;
    private int frente;
    private int finalCola;
    private Object[] arreglo;

    public ColaCircular(int tamaño) {
        this.tamaño = tamaño;
        this.frente = -1;
        this.finalCola = -1;
        this.arreglo = new Object[tamaño];
    }

    public void agregar(Object valor) {
        if ((frente == 0 && finalCola == tamaño - 1) || (frente == finalCola + 1)) {
            System.out.println("Cola llena, no se pueden insertar elementos");
        } else {
            if (finalCola == tamaño - 1) {
                finalCola = 0;
                arreglo[finalCola] = valor;
            } else {
                finalCola = finalCola + 1;
                arreglo[finalCola] = valor;
            }
            if (frente == -1) {
                frente = 0;
            }
        }
    }

    public Object sacar() {
        if (frente == -1) {
            System.out.println("Cola vacía, no se pueden eliminar elementos");
            return null;
        } else {
            Object valorFuera = arreglo[frente];
            System.out.println("Se ha eliminado el siguiente valor: " + valorFuera);
            if (frente == finalCola) {
                frente = -1;
                finalCola = -1;
            } else {
                if (frente == tamaño - 1) {
                    frente = 0;
                } else {
                    frente = frente + 1;
                }
            }
            return valorFuera;
        }
    }

    public int numElementos() {
        if (frente == -1) {
            return 0;
        } else if (frente <= finalCola) {
            return finalCola - frente + 1;
        } else {
            return (tamaño - frente) + (finalCola + 1);
        }
    }

    public boolean estaVacia() {
        return frente == -1;
    }
}
