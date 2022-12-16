package Animales;

public class Humano extends Animal {
    final static Integer numPatas = 2;
    final static Boolean mamifero = true;
    @Override
    Integer getNumPatas(){
        return numPatas;
    }

    @Override
    Boolean esMamifero() {
        return mamifero;
    }

    @Override
    void hablar() {
        System.out.println("Hola");
    }
}