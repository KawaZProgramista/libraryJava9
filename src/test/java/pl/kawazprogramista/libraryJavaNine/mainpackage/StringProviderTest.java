package pl.kawazprogramista.libraryJavaNine.mainpackage;

import org.junit.Test;
import pl.kawazprogramista.libraryJavaNine.main.String9Provider;

import static org.junit.Assert.assertTrue;

public class StringProviderTest {

    @Test
    public void getStringTest() {
        String9Provider subject = new String9Provider();
        String string = subject.getString();
        assertTrue("String " + string + " 20 chars", string.length() == 20);
    }
}
