package com.company.user.service.library.identity;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class BaseID<ID> {
    private ID id;

    public ID value(){
        return id;
    }


}
