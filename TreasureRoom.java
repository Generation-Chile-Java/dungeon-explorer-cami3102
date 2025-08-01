public class TreasureRoom implements Room{
    private GameObject treasure;

    public TreasureRoom(){
        //Creamos un tesoro (usamos una clase anonima para simplificar)
        this.treasure = new GameObject() {
            @Override
            public void interact(Player player) {
                player.collectItem("Espada magica");
            }
        };
    }

    @Override
    public void enter(Player player) {
        System.out.println("Encontraste un cofre con un tesoro!");
        treasure.interact(player); //el jugador recoge el tesoro

    }
}
