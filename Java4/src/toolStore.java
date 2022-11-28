public class toolStore extends normalLoc{
    public toolStore(Player player) {
        super(player, "Store");
    }

    @Override
    boolean onLocation() {
        System.out.println("Mağazaya hoş geldiniz !");
        return true;
    }
}
