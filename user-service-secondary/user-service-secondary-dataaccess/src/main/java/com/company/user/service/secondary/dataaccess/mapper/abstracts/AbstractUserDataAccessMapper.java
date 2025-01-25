package com.company.user.service.secondary.dataaccess.mapper.abstracts;

import com.company.user.service.library.roots.UserRoot;
import com.company.user.service.secondary.dataaccess.entity.UserEntity;

public interface AbstractUserDataAccessMapper {
    UserRoot toRoot(UserEntity user);
    UserEntity toEntity(UserRoot userRoot);
}
