package c1;

public class Hammer extends WorkTool{
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Młotek został użyty do wbicia gwoździa");
    }
}
