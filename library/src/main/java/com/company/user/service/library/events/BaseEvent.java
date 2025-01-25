package com.company.user.service.library.events;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public abstract class BaseEvent<P> {
    private P payload;
}
