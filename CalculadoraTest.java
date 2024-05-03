/**
 * Clase : Test para la calculadora
 * Autor : Jose Alonso Ureña
 * Fecha : 04/05/24
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void test() {
        //Un número positivo y otro negativo
        Calculadora c1 = new Calculadora(-3, 6);
        assertAll(
                () -> assertEquals(3, c1.suma()),
                () -> assertEquals(-9, c1.resta()),
                () -> assertEquals(-18, c1.producto()),
                () -> assertEquals(0, c1.division())
        );


        // Los dos números positivos

        Calculadora c2 = new Calculadora(10, 2);
        assertAll(
                () -> assertEquals(12, c2.suma()),
                () -> assertEquals(8, c2.resta()),
                () -> assertEquals(20, c2.producto()),
                () -> assertEquals(5, c2.division())
        );

        //El denominador(segundo número) es 0

        Calculadora c3 = new Calculadora(5, 0);
        assertAll(
                () -> assertEquals(5, c3.suma()),
                () -> assertEquals(5, c3.resta()),
                () -> assertEquals(0, c3.producto()),
                () -> assertThrows(ArithmeticException.class, () -> c3.division(),"Salta error")
        );

    }
}