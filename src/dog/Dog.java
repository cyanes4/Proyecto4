/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author Alejandro
 */
public class Dog 
{

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    private String name;
    private String breed;
    private String color;
    private int age;
 
    // Constructor Declaration of Class
    public Dog(String name,String breed,int 
            age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
 
    // method 1
    public String GetName()
    {
        return getName();
    }
 
    // method 2
    public String GetBreed()
    {
        return getBreed();
    }
 
    // method 3
    public int GetAge()
    {
        return getAge();
    }
 
    // method 4
    public String GetColor()
    {
        return getColor();
    }
 
    @Override
    public String toString()
    {
        return("Hi my name is "+this.GetName()+
               ".\nMy breed,age and color are "+
               this.GetBreed()+","+this.GetAge()+
               ","+ this.GetColor());
    }
 
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}