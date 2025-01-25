package com.company.user.service.library.identity;

import lombok.experimental.SuperBuilder;

import java.util.UUID;
@SuperBuilder
public class UserID extends BaseID<UUID>{

    public static UserID of(UUID uuid){
        return UserID.builder()
                .id(uuid)
                .build();
    }

}
