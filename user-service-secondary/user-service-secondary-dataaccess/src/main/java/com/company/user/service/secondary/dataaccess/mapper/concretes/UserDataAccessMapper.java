package com.company.user.service.secondary.dataaccess.mapper.concretes;

import com.company.user.service.library.annotations.DomainMappers;
import com.company.user.service.library.identity.UserID;
import com.company.user.service.library.roots.UserRoot;
import com.company.user.service.library.valueobjects.Date;
import com.company.user.service.library.valueobjects.DateTime;
import com.company.user.service.secondary.dataaccess.entity.UserEntity;
import com.company.user.service.secondary.dataaccess.mapper.abstracts.AbstractUserDataAccessMapper;

@DomainMappers
public class UserDataAccessMapper implements AbstractUserDataAccessMapper {

  @Override
  public UserRoot toRoot(UserEntity user) {
    return UserRoot.builder()
        .id(UserID.of(user.getId()))
        .username(user.getUsername())
        .password(user.getPassword())
        .firstName(user.getFirstName())
        .lastName(user.getLastName())
        .birthDate(Date.of(user.getBirthDate()))
        .gender(user.getGender())
        .isLocked(user.getIsLocked())
        .createdAt(DateTime.of(user.getCreatedAt()))
        .updatedAt(DateTime.of(user.getUpdatedAt()))
        .isActive(user.getIsActive())
        .build();
  }

  @Override
  public UserEntity toEntity(UserRoot userRoot) {
    return UserEntity.builder()
        .id(userRoot.getId().value())
        .username(userRoot.getUsername())
        .password(userRoot.getPassword())
        .firstName(userRoot.getFirstName())
        .lastName(userRoot.getLastName())
        .birthDate(userRoot.getBirthDate().value())
        .gender(userRoot.getGender())
        .isLocked(userRoot.getIsLocked())
        .createdAt(userRoot.getCreatedAt().value())
        .updatedAt(userRoot.getUpdatedAt().value())
        .isActive(userRoot.getIsActive())
        .build();
  }
}
