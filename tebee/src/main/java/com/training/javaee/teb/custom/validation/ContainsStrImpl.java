package com.training.javaee.teb.custom.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContainsStrImpl implements ConstraintValidator<ContainsStr, String> {

    private ContainsStr anno;

    @Override
    public void initialize(final ContainsStr anno) {
        this.anno = anno;

    }

    @Override
    public boolean isValid(final String valueParam,
                           final ConstraintValidatorContext contextParam) {
        String[] valuesLoc = this.anno.value();
        for (String stringLoc : valuesLoc) {
            if (stringLoc.equalsIgnoreCase(valueParam)) {
                return true;
            }
        }
        return false;
    }

}
