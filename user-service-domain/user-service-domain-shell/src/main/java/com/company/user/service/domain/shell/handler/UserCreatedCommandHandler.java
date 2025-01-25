package com.company.user.service.domain.shell.handler;

import com.company.user.service.library.events.UserCreatedEvent;
import com.company.user.service.library.payload.UserCreatedPayload;
import com.company.user.service.library.roots.UserRoot;
import com.company.user.service.domain.core.model.command.UserInsertCommand;
import com.company.user.service.library.annotations.CommandHandler;
import com.company.user.service.domain.core.model.port.input.abstracts.AbstractUserDomainService;
import lombok.RequiredArgsConstructor;

@CommandHandler
@RequiredArgsConstructor
public class UserCreatedCommandHandler
    extends BaseCommandHandler<UserInsertCommand, UserCreatedEvent> {
  private final AbstractUserDomainService userDomainService;

  @Override
  public UserCreatedEvent handle(UserInsertCommand userInsertCommand) {
    UserRoot userRoot = this.userDomainService.insert(userInsertCommand);
    return UserCreatedEvent.builder()
        .payload(UserCreatedPayload
                .builder()
                .id(userRoot.getId().value().toString())
                .build())
        .build();
  }
}
