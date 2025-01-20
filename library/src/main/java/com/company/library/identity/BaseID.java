package com.company.library.identity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public abstract class BaseID<ID> {
    private ID id;


}
