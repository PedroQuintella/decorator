import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void deveRetornarPrecoCafe() {
        Cafe cafe = new CafeCappuccino(2.50);

        assertEquals(2.50, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComCanela() {
        Cafe cafe = new Canela(new CafeCappuccino(2.50));

        assertEquals(3.00, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComNozMoscada() {
        Cafe cafe = new NozMoscada(new CafeCappuccino(2.50));

        assertEquals(3.30, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComCaramelo() {
        Cafe cafe = new Caramelo(new CafeCappuccino(2.50));

        assertEquals(3.20, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComCanelaMaisNozMoscada() {
        Cafe cafe = new Canela(new NozMoscada(new CafeCappuccino(2.50)));

        assertEquals(3.80, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComCanelaMaisCaramelo() {
        Cafe cafe = new Canela(new Caramelo(new CafeCappuccino(2.50)));

        assertEquals(3.70, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComNozMoscadaMaisCaramelo() {
        Cafe cafe = new NozMoscada(new Caramelo(new CafeCappuccino(2.50)));

        assertEquals(4.0, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComCanelaMaisNozMoscadaMaisCaramelo() {
        Cafe cafe = new Canela(new NozMoscada(new Caramelo(new CafeCappuccino(2.50))));

        assertEquals(4.50, cafe.getPreco());
    }

    @Test
    void deveRetornarDescricaoCafe() {
        Cafe cafe = new CafeCappuccino();

        assertEquals("Café Cappuccino", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComCanela() {
        Cafe cafe = new Canela(new CafeCappuccino());

        assertEquals("Café Cappuccino + Canela", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComNozMoscada() {
        Cafe cafe = new NozMoscada(new CafeCappuccino());

        assertEquals("Café Cappuccino + Noz-moscada", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComCaramelo() {
        Cafe cafe = new Caramelo(new CafeCappuccino());

        assertEquals("Café Cappuccino + Caramelo", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComCanelaMaisNozMoscada() {
        Cafe cafe = new Canela(new NozMoscada(new CafeCappuccino()));

        assertEquals("Café Cappuccino + Noz-moscada + Canela", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComCanelaMaisCaramelo() {
        Cafe cafe = new Canela(new Caramelo(new CafeCappuccino()));

        assertEquals("Café Cappuccino + Caramelo + Canela", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComNozMoscadaMaisCaramelo() {
        Cafe cafe = new NozMoscada(new Caramelo(new CafeCappuccino()));

        assertEquals("Café Cappuccino + Caramelo + Noz-moscada", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeCafeComCanelaMaisNozMoscadaMaisCaramelo() {
        Cafe cafe = new Canela(new NozMoscada(new Caramelo(new CafeCappuccino())));

        assertEquals("Café Cappuccino + Caramelo + Noz-moscada + Canela", cafe.getDescricao());
    }
}