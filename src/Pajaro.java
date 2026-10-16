public class Pajaro extends Animal{
    public Pajaro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "Pio";
    }
}
