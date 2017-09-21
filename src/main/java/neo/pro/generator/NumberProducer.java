package neo.pro.generator;

import neo.pro.annotation.Random;

import javax.enterprise.inject.Produces;

/**
 * Created by user on 21.09.2017.
 */
public class NumberProducer {
    @Produces @Random
    private int random(){
        return Math.abs(new java.util.Random().nextInt(1000));
    }
}
