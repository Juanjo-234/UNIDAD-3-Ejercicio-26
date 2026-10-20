Este programa está diseñado para modelar una jerarquía de clases de animales aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento y polimorfismo mediante la sobrescritura de métodos (@Override).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base Animal: Concentra los atributos comunes a cualquier especie (nombre y edad) y define un método genérico hacerSonido() que puede ser heredado o especializado.

Desarrolla las clases hijas (Perro, Gato y Pajaro): Extienden de Animal utilizando la palabra clave super en sus constructores para inicializar los atributos heredados de forma limpia y segura.

Sobrescribe el método hacerSonido(): Cada subclase implementa su propia versión del método utilizando la anotación @Override para imprimir el sonido característico correspondiente ("Guau", "Miau", "Pío").

Ejecuta la prueba en el main: Crea una colección polimórfica de diferentes animales, la recorre invocando sus respectivos métodos de datos y sonidos, y muestra los resultados formateados por consola.
