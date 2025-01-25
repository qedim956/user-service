package com.company.user.service.domain.shell.mapper.conretes;

import com.company.user.service.library.annotations.DomainMappers;
import com.company.user.service.library.events.UserCreatedEvent;
import com.company.user.service.library.payload.UserCreatedPayload;
import com.company.user.service.library.web.request.UserInsertCommandRequestModel;
import com.company.user.service.library.web.response.UserInsertResponseModel;
import com.company.user.service.domain.core.model.command.UserInsertCommand;
import com.company.user.service.domain.shell.mapper.abstracts.AbstractsUserDomainShellMapper;

@DomainMappers
public class UserDomainShellMapper implements AbstractsUserDomainShellMapper {

  @Override
  public UserInsertCommand toCommand(UserInsertCommandRequestModel command) {
    return UserInsertCommand.builder()
        .username(command.getUsername())
        .password(command.getPassword())
        .firstName(command.getFirstName())
        .lastName(command.getLastName())
        .birthDate(command.getBirthDate())
        .gender(command.getGender())
        .build();
  }

  @Override
  public UserInsertResponseModel toResponseModel(UserCreatedEvent userCreatedEvent) {
    UserCreatedPayload payload = userCreatedEvent.getPayload();
    return UserInsertResponseModel.builder().id(payload.getId()).build();
  }
}
