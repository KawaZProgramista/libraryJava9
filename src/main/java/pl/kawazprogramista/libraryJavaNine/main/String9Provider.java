package pl.kawazprogramista.libraryJavaNine.main;


import pl.kawazprogramista.libraryJavaNine.helpers.IntProviderForLibrary9UseOnly;

import java.util.stream.IntStream;

public class String9Provider {
    private final IntProviderForLibrary9UseOnly intProviderForLibrary9UseOnly = new IntProviderForLibrary9UseOnly();

    public String getString() {
        return IntStream.range(0, 20)
                .mapToObj(i -> intProviderForLibrary9UseOnly.getInt())
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
