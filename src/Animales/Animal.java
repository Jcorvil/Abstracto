package Animales;

public abstract class Animal {
    Boolean mamifero = true;

    abstract Integer getNumPatas();

    Boolean esMamifero() {
        return mamifero;
    }

    //"dormir" es común para todas las clases, asi que se puede definir aquí.
    void dormir(){
        System.out.println("zZzZzZz");
    }
    //"hablar" va a ser distinto para cada clase, asi que se pone en "abstract" y se define en cada clase.
    //Además, al ser abstracto es obligatorio hacerlo, mientras que "dormir" puede usarse o no.
    abstract void hablar();
}