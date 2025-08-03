public class EnemyRoom implements Room {
    @Override
    public void enter(Player player) {
        System.out.println("Un enemigo salvaje aparece y te ataca!");
        player.takeDamage(30);//El enemigo causa 30 de daño
    }
}
