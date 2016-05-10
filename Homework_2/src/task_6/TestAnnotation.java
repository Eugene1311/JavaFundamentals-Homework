package task_6;

import java.lang.annotation.*;
/**
 * Created by Евгений on 03.04.2016.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestAnnotation {
    String madeIn();
}
