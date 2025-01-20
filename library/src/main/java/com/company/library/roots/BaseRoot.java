package com.company.library.roots;

import com.company.library.identity.BaseID;
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
