import java.util.ArrayList;
import java.util.List;

public class Player {
    //Atributos privados
    private String name;
    private int health;
    private List<String> inventory; //Inventario de objetos

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.inventory = new ArrayList<>(); //Lista vacia
    }

    //metodos publicos para acceder y modificar atributos

    public void takeDamage(int damage) {
        this.health -= damage;
        if (health <= 0) {
            this.health = 0;
        }
        System.out.println("Recibiste Daño!!!" + damage + " puntos de daño! Vida actual: " + this.health);
    }

    public void collectItem(String item) {
        inventory.add(item);
        System.out.println("Has obtenido " + item);
    }

    public void showStatus(){
        System.out.println("\n--- Estado del jugador ---");
        System.out.println("Nombre: " + name);
        System.out.println("Vida: " + health);
        System.out.println("Inventario: " + inventory);
        System.out.println("------------------------\n");

    }

    //Metodos para verificar estado
    public boolean isAlive() {
        return health > 0;
    }

    public String getName(){
        return name;
    }

}
