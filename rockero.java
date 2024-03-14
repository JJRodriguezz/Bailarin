package Lenguajes;

class Rockero extends Bailarin {

    Rockero(String nombre) {
        super(nombre);
    }

    @Override
    public void bailar() {
        System.out.println("El rockero "+ getNombre()  + " está bailando Rock");
        System.out.println("*Haciendo un pogo con los demás en la fiesta*");
    }
}