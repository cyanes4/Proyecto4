package dog;

/**
 * Esta clase implementa un ejemplo de utilización de la clase Dog
 * @author Nuria
 * @version 1
 */
public class Programa {

    /**
     * Método principal de la clase por el que comienza la ejecución del programa.
     * @param args Son los argumentos de la línea de comandos. En este caso no se utilizan.
     */
    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}
