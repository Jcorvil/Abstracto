package Animales;

public class Principal {

    public static void main(String[] args) {
        Animal a = new Perro();
        System.out.println("El perro tiene " + a.getNumPatas() + " patas");
        if (a.esMamifero()){
            System.out.println("Es mamifero");
        }else System.out.println("No es mamifero");
        a.dormir();
        a.hablar();

        Animal b = new Gato();
        System.out.println("El gato tiene " + b.getNumPatas() + " patas");
        if (b.esMamifero()){
            System.out.println("Es mamifero");
        }else System.out.println("No es mamifero");
        b.dormir();
        b.hablar();

        Animal c = new Humano();
        System.out.println("El humano tiene " + c.getNumPatas() + " patas");
        if (c.esMamifero()){
            System.out.println("Es mamifero");
        }else System.out.println("No es mamifero");
        c.dormir();
        c.hablar();
    }
}