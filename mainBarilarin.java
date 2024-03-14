package Lenguajes;

public class mainBarilarin {
    public static void main(String[] args) {

        Bailarin[] bailarines = new Bailarin[4];
        
        Bailarin Salsero1 = new Salsero("Marc Anthony");
        bailarines[0] = Salsero1;
        bailarines[1] = new Reggaetonero("Daddy Yankee");
        bailarines[2] = new Merenguero("Solís");
        bailarines[3] = new Rockero("Corey Taylor");
        
        for (Bailarin bailarin : bailarines) {
            System.out.println("==========================================");
            bailarin.bailar();
        }
        System.out.println("==========================================");
    }
}