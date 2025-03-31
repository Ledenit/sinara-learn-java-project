package com.night.sinara_learn_java.VI;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.lang.annotation.*;


@NotBlank(message = "{field.required}")
@Size(min = 9, max = 148, message = "{email.size}")
@EmailConstraint()
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidationGroup {
    String message() default "{validation.group.error}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
