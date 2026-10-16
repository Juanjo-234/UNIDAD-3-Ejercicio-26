public class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String hacerSonido(){
        return "El animal emite un sonido genérico";
    }

    public String mostrarInformacion(){
        return "Nombre: " + nombre + " | Edad: " + edad + " años";
    }
}
