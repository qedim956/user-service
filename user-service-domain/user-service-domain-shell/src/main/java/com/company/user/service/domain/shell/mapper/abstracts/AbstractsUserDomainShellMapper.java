package com.company.user.service.domain.shell.mapper.abstracts;

import com.company.user.service.library.events.UserCreatedEvent;
import com.company.user.service.library.web.request.UserInsertCommandRequestModel;
import com.company.user.service.library.web.response.UserInsertResponseModel;
import com.company.user.service.domain.core.model.command.UserInsertCommand;

public interface AbstractsUserDomainShellMapper {
    UserInsertCommand toCommand(UserInsertCommandRequestModel command);
    UserInsertResponseModel toResponseModel(UserCreatedEvent userCreatedEvent);
}
