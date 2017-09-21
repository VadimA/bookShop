package neo.pro.generator;

import neo.pro.annotation.ISBN;
import neo.pro.annotation.Random;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

/**
 * Created by user on 21.09.2017.
 */
@Alternative @ISBN
public class MockGenerator implements NumberGenerator{

    @Inject @Random
    private int random;
    public String generateNumber() {
        return "Mock " + random;
    }
}
