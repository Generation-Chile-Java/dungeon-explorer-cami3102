import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Crear jugador
        System.out.println("Ingresa tu nombre: ");
        String playerName=scanner.nextLine();
        Player player=new Player(playerName);

        //Crear mazmorra: array de salas
        Room[] dungeon = {
                new EmptyRoom(),
                new TreasureRoom(),
                new EnemyRoom(),
                new TreasureRoom(),
                new EnemyRoom(),
                new EmptyRoom()
        };

        System.out.println("\n¡Bienvenido a la Mazmorra, " + player.getName() + "!\n");

        // Bucle principal del juego
        for (int i = 0; i < dungeon.length; i++) {
            if (!player.isAlive()) {
                System.out.println("¡Has muerto! Fin del juego.");
                break;
            }

            System.out.println("Presiona Enter para entrar a la sala " + (i + 1) + "...");
            scanner.nextLine();  // Espera a que el jugador presione Enter

            // Polimorfismo: cada sala se comporta diferente
            dungeon[i].enter(player);

            // Mostrar estado después de cada sala
            player.showStatus();
        }

        // Si el jugador sobrevive
        if (player.isAlive()) {
            System.out.println("¡Felicidades, " + player.getName() + "! Has explorado toda la mazmorra y sobreviviste.");
        } else {
            System.out.println("No lograste completar la mazmorra.");
        }

        scanner.close();

    }
}