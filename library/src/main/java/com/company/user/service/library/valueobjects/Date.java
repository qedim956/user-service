package com.company.user.service.library.valueobjects;

import com.company.user.service.library.annotations.ValueObject;

import java.time.LocalDate;
@ValueObject
public final class Date {
    private final LocalDate value;

    private Date(final LocalDate value) {
        this.value = value;
    }




    public boolean isEqualOrBefore(final Date date) {//may 5 2025  may 5 2025
        return !date.value.isAfter(this.value);
    }

    public LocalDate value(){
        return this.value;
    }

    public static Date of(final LocalDate value) {
        return new Date(value);
    }
}
