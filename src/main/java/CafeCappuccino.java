public class CafeCappuccino implements Cafe {

    public Double preco;

    public CafeCappuccino() {
    }

    public CafeCappuccino(Double preco) {
        this.preco = preco;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Café Cappuccino";
    }
}
