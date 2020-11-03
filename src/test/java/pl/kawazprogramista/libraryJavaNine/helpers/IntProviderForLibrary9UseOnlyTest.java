package pl.kawazprogramista.libraryJavaNine.helpers;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntProviderForLibrary9UseOnlyTest {

    @Test
    public void testGetChar() {
        IntProviderForLibrary9UseOnly subject = new IntProviderForLibrary9UseOnly();
        assertTrue("method should return int < 10", subject.getInt() < 10);
    }

}
