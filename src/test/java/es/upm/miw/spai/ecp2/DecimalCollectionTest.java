package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    DecimalCollection collection;

    @Before
    public void dataDecimalCollection() {
        collection = new DecimalCollection();
        collection.add(1);
        collection.add(5);
        collection.add(2);
    }

    @Test
    public void testSize() {
        assertEquals(3, this.collection.size());
    }

    @Test
    public void testSum() {
        assertEquals(8, this.collection.sum(), 10e-1);
    }

    @Test
    public void testHigher() {
        assertEquals(5, this.collection.higher(), 10e-1);
    }

}
