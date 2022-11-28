import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);
    private int damage;
    private int health;
    private int coin;
    private String name;
    private String charName;

    public Player(String name){
        this.name = name;
    }

    public void selectChar(){
        Characters[] charList = {new Samurai(), new Archer(), new Knight()};
        for (Characters characters : charList) {
            System.out.println("ID: " + characters.getId() + "\tKarakter: " + characters.getName() +
                    "\tHasar: " + characters.getDamage() +
                    "\tSağlık: "+ characters.getHealth() +
                    "\tPara: " + characters.getCoin());
        }
        System.out.println("------------------------------------");
        System.out.print("Lütfen bir karakter(ID) giriniz: ");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
        System.out.println("Karakter: " + this.getCharName());
    }
    public void selectLoc(){
        System.out.println("Bölgeler: ");
        System.out.println("1. Güvenli Ev");
        System.out.println("2. Mağaza");
        System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
        int selectLoc = input.nextInt();
        switch (selectLoc){
            case
        }
    }
    public void initPlayer(Characters characters){
        this.setCharName(characters.getName());
        this.setDamage(characters.getDamage());
        this.setHealth(characters.getHealth());
        this.setCoin(characters.getCoin());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
