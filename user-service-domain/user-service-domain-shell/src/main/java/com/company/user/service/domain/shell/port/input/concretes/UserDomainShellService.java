package com.company.user.service.domain.shell.port.input.concretes;


import com.company.library.annotations.InputPort;
import com.company.library.web.request.UserInsertCommandRequestModel;
import com.company.library.web.response.UserInsertResponseModel;
import com.company.user.service.domain.core.model.command.UserInsertCommand;
import com.company.user.service.domain.shell.port.handler.UserCreatedCommandHandler;
import com.company.user.service.domain.shell.port.input.abstracts.AbstractUserDomainShellService;
import lombok.RequiredArgsConstructor;

@InputPort
@RequiredArgsConstructor
public class UserDomainShellService implements AbstractUserDomainShellService {
    private final UserCreatedCommandHandler userCreatedCommandHandler;

    @Override
    public UserInsertResponseModel insert(UserInsertCommandRequestModel model) {
        UserInsertCommand userInsertCommand = new UserInsertCommand();
        userCreatedCommandHandler.handle(userInsertCommand);
        return null;
    }
}
