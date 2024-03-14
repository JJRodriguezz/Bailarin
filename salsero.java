package Lenguajes;

class Salsero extends Bailarin {
    
    Salsero(String nombre) {
        super(nombre);
    }

    @Override
    public void bailar() {
        System.out.println("El salsero "+ getNombre()  + " está bailando salsa");
        System.out.println("*Suena 'tú con él'*");
    }
}