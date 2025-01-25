package com.company.user.service.domain.core.model.mapper.abstracts;

import com.company.user.service.library.roots.UserRoot;
import com.company.user.service.domain.core.model.command.UserInsertCommand;

public interface AbstractUserDomainMapper {
    UserRoot toRoot(UserInsertCommand command);
}
