import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
     public void start(){
         System.out.println("\nMacera Oyununa Hoşgeldiniz !");
         System.out.print("Lütfen bir isim giriniz: ");
         String playerName = input.nextLine();
         Player player = new Player(playerName);
         System.out.println("\nAdaya Hoşgeldin " + player.getName() + " !");
         System.out.println("\nBaşlamak için bir karakter seçin:\n ");
         System.out.println("------------------------------------");
         player.selectChar();
     }
}
