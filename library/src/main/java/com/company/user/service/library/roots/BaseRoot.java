package com.company.user.service.library.roots;

import com.company.user.service.library.identity.BaseID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseRoot<ID extends BaseID<UUID>> {
  private ID id;
}
