package pl.kawazprogramista.libraryJavaNine.helpers;

import java.util.Random;

public class IntProviderForLibrary9UseOnly {
    public int getInt() {
        return new Random().nextInt(10);
    }
}
