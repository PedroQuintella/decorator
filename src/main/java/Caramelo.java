public class Caramelo extends CafeDecorator {

    public Caramelo(Cafe cafe) {
        super(cafe);
    }

    public double getPrecoCondimento() {
        return 0.70;
    }

    public String getNomeCondimento() {
        return "Caramelo";
    }
}
