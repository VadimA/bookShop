package logger;

import neo.pro.annotation.Loggable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

/**
 * Created by user on 15.09.2017.
 */
@Interceptor
@Loggable
public class LoggingInterceptor {

    @Inject
    Logger logger;

    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        logger.entering(ic.getTarget().getClass().getName(),
                ic.getMethod().getName());
        try {
            return ic.proceed();
        } finally {
            logger.exiting(ic.getTarget().getClass().getName(),
                    ic.getMethod().getName());
        }
    }
}
