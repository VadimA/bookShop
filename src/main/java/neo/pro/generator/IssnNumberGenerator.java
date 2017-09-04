package neo.pro.generator;

import java.util.Random;

/**
 * Created by vanosov on 30.08.2017.
 */
public class IssnNumberGenerator implements NumberGenerator {

    public String generateNumber() {
        return "64-7789" + Math.abs(new Random().nextInt(1000));
    }
}
