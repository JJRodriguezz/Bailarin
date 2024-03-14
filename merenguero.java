package Lenguajes;

class Merenguero extends Bailarin {

    Merenguero(String nombre) {
        super(nombre);
    }

    @Override
    public void bailar() {
        System.out.println("El merenguero "+ getNombre()  + " está bailando merengue");
        System.out.println("*Moviendo el esqueleto*");
    }
}