package firstpackage;

public class one  {
    public String name;
    public static int counter;

    static {System.out.println("a");    }
    public one(String name) {
        this.name = name;
        counter++;
    }
}
