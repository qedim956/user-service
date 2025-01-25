package com.company.user.service.domain.shell.port.input.concretes;

import com.company.user.service.library.annotations.InputPort;
import com.company.user.service.library.events.UserCreatedEvent;
import com.company.user.service.library.web.request.UserInsertCommandRequestModel;
import com.company.user.service.library.web.response.UserInsertResponseModel;
import com.company.user.service.domain.core.model.command.UserInsertCommand;
import com.company.user.service.domain.shell.handler.UserCreatedCommandHandler;
import com.company.user.service.domain.shell.port.input.abstracts.AbstractUserDomainShellService;
import com.company.user.service.domain.shell.mapper.abstracts.AbstractsUserDomainShellMapper;
import lombok.RequiredArgsConstructor;

@InputPort
@RequiredArgsConstructor
public class UserDomainShellService implements AbstractUserDomainShellService {
  private final UserCreatedCommandHandler userCreatedCommandHandler;
  private final AbstractsUserDomainShellMapper userDomainShellMapper;

  @Override
  public UserInsertResponseModel insert(UserInsertCommandRequestModel model) {
    UserInsertCommand userInsertCommand = userDomainShellMapper.toCommand(model);
    UserCreatedEvent event = userCreatedCommandHandler.handle(userInsertCommand);
    return userDomainShellMapper.toResponseModel(event);
  }
}
