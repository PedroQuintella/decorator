public class Canela extends CafeDecorator {

    public Canela(Cafe cafe) {
        super(cafe);
    }

    public double getPrecoCondimento() {
        return 0.50;
    }

    public String getNomeCondimento() {
        return "Canela";
    }
}
