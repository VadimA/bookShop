package neo.pro.annotation;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by vanosov on 04.09.2017.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD,   TYPE, METHOD})
public @interface Random {}
