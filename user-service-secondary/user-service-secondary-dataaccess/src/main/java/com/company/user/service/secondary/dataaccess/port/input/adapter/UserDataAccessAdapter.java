package com.company.user.service.secondary.dataaccess.port.input.adapter;

import com.company.user.service.library.roots.UserRoot;
import com.company.user.service.domain.core.model.port.output.AbstractsUserDataAccessAdapter;
import com.company.user.service.secondary.dataaccess.entity.UserEntity;
import com.company.user.service.secondary.dataaccess.mapper.abstracts.AbstractUserDataAccessMapper;
import com.company.user.service.secondary.dataaccess.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserDataAccessAdapter implements AbstractsUserDataAccessAdapter {
    private final UserRepository userRepository;
    private final AbstractUserDataAccessMapper userDataAccessMapper;

    @Override
    public UserRoot save(UserRoot userRoot) {
        UserEntity userEntity = userDataAccessMapper.toEntity(userRoot);
        UserEntity savedEntity = userRepository.save(userEntity);
        return this.userDataAccessMapper.toRoot(savedEntity);
    }
}
