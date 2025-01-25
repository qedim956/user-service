package com.company.user.service.domain.core.model.port.input.concretes;

import com.company.user.service.library.roots.UserRoot;
import com.company.user.service.domain.core.model.command.UserInsertCommand;
import com.company.user.service.domain.core.model.mapper.abstracts.AbstractUserDomainMapper;
import com.company.user.service.domain.core.model.port.input.abstracts.AbstractUserDomainService;
import com.company.user.service.domain.core.model.port.output.AbstractsUserDataAccessAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDomainService implements AbstractUserDomainService {
    private final AbstractUserDomainMapper userDomainMapper;
    private final AbstractsUserDataAccessAdapter userDataAccessAdapter;

    @Override
    public UserRoot insert(UserInsertCommand command) {
        UserRoot userRoot = userDomainMapper.toRoot(command);
        userRoot.initialize();

        return userDataAccessAdapter.save(userRoot);
    }
}
