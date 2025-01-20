package com.company.library.roots;


import com.company.library.identity.BaseID;
import com.company.library.valueobjects.DateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.UUID;
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AggregateRoot<ID extends BaseID<UUID>> extends BaseRoot<ID> {
    private DateTime createdAt;
    private DateTime updatedAt;
    private Boolean isActive;
}
