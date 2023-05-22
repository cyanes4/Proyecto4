package dog;

/**
 * Esta clase implementa el tipo de dato abstracto Perro
 * @author Alejandro
 * @version 1
 */

public class Dog {

    // Instance Variables
    /** name es el nombre de la mascota */
    private String name;
    /** breed es la raza del perro */
    private String breed;
     /** color es el color del perro */
    private String color;
      /** age es la edad del perro en años */
    private int age;

    
    /**
     * Declaración del constructor de la clase
     * @param name es el nombre de la mascota
     * @param breed es la raza del perro
     * @param color es el color del perro
     * @param age es la edad del perro en años
     */
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    /**
     * Establece el nombre del perro
     * @param name es el nombre de la mascota
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Establece la raza del perro
     * @param breed es la raza del perro
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Establece el color del perro
     * @param color es el color del perro
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Establece la edad del perro
     * @param age es la edad del perro en años
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Devuelve el nombre del perro
     * @return el nombre del perro.
     */
    public String getName() {
        return name;
    }

    /**
     * Devuelve la raza del perro
     * @return raza del perro
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Devuelve la edad del perro
     * @return edad del perro en años.
     */
    public int getAge() {
        return age;
    }

    /**
     * Devuelve el color del perro
     * @return color del perro.
     */
    public String getColor() {
        return color;
    }

    /*
    @Override
    public String toString() {
        return ("Hi my name is " + this.getName()
                + ".\nMy breed,age and color are "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }
    */
    
    /**
     * @return Devuelve una cadena con los datos del perro-
     */
    @Override
    public String toString() {
        StringBuilder cc = new StringBuilder("Hi my name is ");
        cc.append(this.getName());
        cc.append(".\nMy breed,age and color are ");
        cc.append(this.getBreed());
        cc.append(",");
        cc.append(this.getAge());
        cc.append(",");
        cc.append(this.getColor());
        return cc.toString();
    }
}
