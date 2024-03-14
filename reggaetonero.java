package Lenguajes;

class Reggaetonero extends Bailarin {

    Reggaetonero(String nombre) {
        super(nombre);
    }

    @Override
    public void bailar() {
        System.out.println("El reggaetonero "+ getNombre()  + " está perreando");
        System.out.println("*Es el rey del perreo*");
    }
}