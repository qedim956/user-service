package com.company.user.service.domain.core.model.mapper.concretes;

import com.company.user.service.library.annotations.DomainMappers;
import com.company.user.service.library.roots.UserRoot;
import com.company.user.service.library.valueobjects.Date;

import com.company.user.service.domain.core.model.command.UserInsertCommand;
import com.company.user.service.domain.core.model.mapper.abstracts.AbstractUserDomainMapper;

@DomainMappers
public class UserDomainMapper implements AbstractUserDomainMapper {

    @Override
    public UserRoot toRoot(UserInsertCommand command) {
        return UserRoot
                .builder()
                .username(command.getUsername())
                .password(command.getPassword())
                .firstName(command.getFirstName())
                .lastName(command.getLastName())
                .birthDate(Date.of(command.getBirthDate()))
                .gender(command.getGender())
                .build();
    }
}
