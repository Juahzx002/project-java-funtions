// Estructura básica del proyecto Java
public class App {
    public static void main(String[] args) {
        // CORRECCIÓN: Se elimina el "x:"
        System.out.println("¡Hola, Mundo!"); 
    }
}

// función sin parámetros y sin retorno implementada
void saludar() {
    System.out.println("¡Bienvenido a la programación en Java!");
}

// función con parámetros y sin retorno implementada
void saludarPersona(String nombre) {
    System.out.println("¡Hola, " + nombre + "!");
}

// función con parámetros y con retorno implementada
static int sumar(int num1, int num2) {
        
        // Operación interna
        int total = num1 + num2;

        // return: Devuelve el valor final y termina la función.
        return total;
    }
