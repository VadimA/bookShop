package neo.pro.generator;

import neo.pro.annotation.Loggable;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by vanosov on 30.08.2017.
 */
@Default
public class IssnNumberGenerator implements NumberGenerator {

    @Inject
    Logger logger;

    @Loggable
    public String generateNumber() {
        return "64-7789" + Math.abs(new Random().nextInt(1000));
    }
}
