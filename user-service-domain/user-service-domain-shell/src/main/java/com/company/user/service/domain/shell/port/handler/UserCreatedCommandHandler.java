package com.company.user.service.domain.shell.port.handler;

import com.company.library.events.UserCreatedEvent;
import com.company.user.service.domain.core.model.command.UserInsertCommand;

public class UserCreatedCommandHandler extends CommandHandler<UserInsertCommand, UserCreatedEvent> {
    @Override
    public UserCreatedEvent handle(UserInsertCommand userInsertCommand) {
        return null;
    }
}
