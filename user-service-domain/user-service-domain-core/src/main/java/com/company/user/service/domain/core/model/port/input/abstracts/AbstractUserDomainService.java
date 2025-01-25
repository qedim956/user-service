package com.company.user.service.domain.core.model.port.input.abstracts;

import com.company.user.service.library.roots.UserRoot;
import com.company.user.service.domain.core.model.command.UserInsertCommand;

public interface AbstractUserDomainService {
    UserRoot insert(UserInsertCommand command);
}
