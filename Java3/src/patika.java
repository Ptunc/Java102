public class patika {
    public static void main(String[] args) {
        calisan c1 = new calisan("ali veli", "05435434343", "info@info.com");
        c1.giris();
        akademisyen a1 = new akademisyen("mine emine", "05325323232", "info@info.com", "fizik", "dr");
        a1.cikis();
        a1.derseGir();

        memur m1 = new memur("duru muru", "05425424242", "info@info.com", "bilgi islem", "9-18");
        m1.mesaiyeGel();

    }
}
