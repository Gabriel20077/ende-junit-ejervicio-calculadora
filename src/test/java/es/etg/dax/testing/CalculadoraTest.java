package es.etg.dax.testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.etg.dax.testing.exception.OperacionNoValidaException;

// Las clases de test suelen tener el sufijo Test
public class CalculadoraTest {

    Calculadora calculadora = new Calculadora(); //

    @Test
    void sumarPositivos() {

        int valor1 = 2;
        int valor2 = 3;
        int esperado = 5;

        assertEquals(esperado, Calculadora.sumar(valor1, valor2));
    }

    @Test
    void sumarPositivosMal() {

        int valor1 = 2;
        int valor2 = 3;
        int esperado = 4;

        assertEquals(esperado, Calculadora.sumar(valor1, valor2));
    }

    // @Test de varias pruebas juntas
    @Test
    void sumar() {

        // Se realizan 4 pruebas y si las cuatro son ok, sumar será ok.
        assertAll("Suma",
                () -> assertEquals(5, Calculadora.sumar(1, 4), "1 + 4 = 5"),
                () -> assertEquals(5, Calculadora.sumar(2, 3), "2 + 3 = 5"),
                () -> assertEquals(1, Calculadora.sumar(0, 1), "0 + 1 = 1"),
                () -> assertEquals(-1, Calculadora.sumar(1, -2), "1 + (-2) = -1"));

    }

    // Esta prueba comprueba que al dividir por cero se lanza una excepción
    // controlada: OperacionNoValidaException
    @Test
    @DisplayName("Probar la división por cero")
    void dividirPorZeroException() {
        var ex = assertThrows(OperacionNoValidaException.class, () -> Calculadora.dividir(4, 0),
                "La división por cero no está permitida");
        assertEquals(OperacionNoValidaException.MSG, ex.getMessage());
    }

    @Test
    @DisplayName("Dividir dos números positivos")
    void dividirPositivos() throws OperacionNoValidaException {
        assertEquals(2, Calculadora.dividir(4, 2));
    }

    @Test
    @DisplayName("Dividir número positivo entre negativo")
    void dividirPositivoNegativo() throws OperacionNoValidaException {
        assertEquals(-2, Calculadora.dividir(4, -2));
    }

    @Test
    @DisplayName("Dividir número negativo entre positivo")
    void dividirNegativoPositivo() throws OperacionNoValidaException {
        assertEquals(-2, Calculadora.dividir(-4, 2));
    }

    @Test
    @DisplayName("Dividir dos números negativos")
    void dividirNegativos() throws OperacionNoValidaException {
        assertEquals(2, Calculadora.dividir(-4, -2));
    }

    @Test
    @DisplayName("Dividir cero entre número distinto de cero")
    void dividirCero() throws OperacionNoValidaException {
        assertEquals(0, Calculadora.dividir(0, 5));
    }

    @Test
    @DisplayName("Dividir por uno devuelve el mismo número")
    void dividirPorUno() throws OperacionNoValidaException {
        assertEquals(7, Calculadora.dividir(7, 1));
    }

    @Test
    @DisplayName("Caso invalido, ya que el divisor es cero, la operación no esta permitida ERROR")
    void dividirCeroEntreCeroLanzaExcepcion() {
        assertThrows(OperacionNoValidaException.class,
                () -> Calculadora.dividir(0, 0));
    }

    @Test
    @DisplayName("Caso limite, divide el numero más pequeño positivo entre si mismo")
    void dividirUnoEntreUno() throws OperacionNoValidaException {
        assertEquals(1, Calculadora.dividir(1, 1));
    }

}
