package com.company.library.events;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class BaseEvent<P> {
    private P payload;
}
