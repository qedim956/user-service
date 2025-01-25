package com.company.user.service.library.roots;


import com.company.user.service.library.identity.BaseID;
import com.company.user.service.library.valueobjects.DateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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
