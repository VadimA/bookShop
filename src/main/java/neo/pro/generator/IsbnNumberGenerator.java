package neo.pro.generator;

import neo.pro.annotation.ISBN;
import neo.pro.annotation.Loggable;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by vanosov on 30.08.2017.
 */
@ISBN
public class IsbnNumberGenerator implements NumberGenerator {

    @Inject
    Logger logger;

    @Loggable
    public String generateNumber() {
        System.out.println(" in generateNumber");
        return "63-633" + Math.abs(new Random().nextInt(100));
    }
}