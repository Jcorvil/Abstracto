public class Gato extends Animal {
    final static Integer numPatas = 4;
    final static Boolean mamifero = true;
    @Override
    Integer getNumPatas(){
        return numPatas;
    }

    @Override
    Boolean esMamifero() {
        return mamifero;
    }
}