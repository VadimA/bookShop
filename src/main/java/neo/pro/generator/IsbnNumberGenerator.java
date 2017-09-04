package neo.pro.generator;

import javax.enterprise.inject.Default;
import java.util.Random;

/**
 * Created by vanosov on 30.08.2017.
 */
@Default
public class IsbnNumberGenerator implements NumberGenerator {

    public String generateNumber() {
        return "63-633" + Math.abs(new Random().nextInt(100));
    }
}