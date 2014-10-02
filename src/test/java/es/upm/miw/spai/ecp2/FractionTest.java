package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void dataFraction() {
        this.fraction = new Fraction(2, 5);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(2, this.fraction.getNumerator());
        assertEquals(5, this.fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        this.fraction = new Fraction();
        assertEquals(1, this.fraction.getNumerator());
        assertEquals(1, this.fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.4, this.fraction.decimal(), 10e-5);
    }
    
    @Test
    public void testIsEquivalente(){
        assertTrue(this.fraction.isEquivalente(new Fraction(4,10)));
    }

}
