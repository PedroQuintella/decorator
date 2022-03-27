import java.text.DecimalFormat;
import java.util.function.DoubleBinaryOperator;

public abstract class CafeDecorator implements Cafe {

    private Cafe cafe;
    public String descricao;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public abstract double getPrecoCondimento();

    public Double getPreco() {
        return this.cafe.getPreco() + this.getPrecoCondimento();
    }

    public abstract String getNomeCondimento();

    public String getDescricao() {
        return this.cafe.getDescricao() + " " + "+" + " " + this.getNomeCondimento();
    }
}
