package com.training.javaee.teb.custom.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Retention(RUNTIME)
@Target({
          FIELD,
          METHOD,
          ElementType.ANNOTATION_TYPE
})
@Constraint(validatedBy = {
                            ContainsStrImpl.class
})
public @interface ContainsStr {

    String[] value();

    String message() default "String must contain {value}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
