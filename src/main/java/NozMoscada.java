public class NozMoscada extends CafeDecorator {

    public NozMoscada(Cafe cafe) {
        super(cafe);
    }

    public double getPrecoCondimento() {
        return 0.80;
    }

    public String getNomeCondimento() {
        return "Noz-moscada";
    }
}
