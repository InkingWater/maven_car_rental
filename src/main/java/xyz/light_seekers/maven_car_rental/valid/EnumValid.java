package xyz.light_seekers.maven_car_rental.valid;

import xyz.light_seekers.maven_car_rental.valid.validtImpl.EnumValidImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 9:17
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {EnumValidImpl.class})
@Documented
public @interface EnumValid {
    String message() default "";

    /**
     * 作用参考@Validated和@Valid的区别
     *
     * @return
     */
    Class<?>[] groups() default {};

    /**
     * @return
     */
    Class<? extends Payload>[] payload() default {};

    /**
     * 目标枚举类
     *
     * @return
     */
    Class<?> target() default Class.class;

    /**
     * 是否忽略空值
     *
     * @return
     */
    boolean ignoreEmpty() default true;
}
