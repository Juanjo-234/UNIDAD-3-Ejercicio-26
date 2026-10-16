//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Animal> misAnimales = new ArrayList<>();

    misAnimales.add(new Perro("Firulais", 4));
    misAnimales.add(new Gato("Michi", 2));
    misAnimales.add(new Pajaro("Piolín", 1));

    System.out.println("=== ZOO DE ANIMALES ===");
    for (Animal animal : misAnimales) {
        System.out.println(animal.mostrarInformacion() + " -> Sonido: " + animal.hacerSonido());
    }
}
