
//Crear una clase abstracta "Bailarin" que tenga el metodo bailar.
//Crear las siguentes clases que hereden de "Bailarin" y que sobreescriban el método bailar.
//Clase "Salsero", "Merenguero", "Rockero", "Reggaetonero"
//Finalmente, cree una clase main en la que se creen instancias que se almacenen en un array, el cual al ser recorrido, muestre
//el uso del polimorfismo



package Lenguajes;

abstract class Bailarin {
    private String nombre;

    public Bailarin(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void bailar() {
        System.out.println("Bailando ando");
    }
}