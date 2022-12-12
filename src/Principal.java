public class Principal {

    public static void main(String[] args) {
        Animal a = new Perro();
        System.out.println("El perro tiene " + a.getNumPatas() + " patas");
        System.out.println("¿Es mamifero? " + a.mamifero);

        Animal b = new Gato();
        System.out.println("El gato tiene " + b.getNumPatas() + " patas");
        System.out.println("¿Es mamifero? " + b.mamifero);

        Animal c = new Humano();
        System.out.println("El humano tiene " + c.getNumPatas() + " patas");
        if (c.mamifero = true){
            System.out.println("Es mamifero");
        }else System.out.println("No es mamifero");
    }
}