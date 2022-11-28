public class normalLoc extends Location{
    public normalLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    boolean onLocation() {
        return true;
    }
}
