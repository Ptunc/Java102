public class daire {
    public int r;
    public final double PI_SAYISI = 3.14;
    public static int b;

    public daire(int r, int b){
        this.r = r;
        this.b = b;
    }

    public void calcArea(){
        double area = PI_SAYISI * this.r * this.r - this.b;
        System.out.println("alan: " + area);
    }
}
