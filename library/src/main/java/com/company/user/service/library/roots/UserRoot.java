package com.company.user.service.library.roots;

import com.company.user.service.library.identity.UserID;
import com.company.user.service.library.valueobjects.Date;
import com.company.user.service.library.valueobjects.DateTime;
import com.company.user.service.library.valueobjects.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoot extends AggregateRoot<UserID> {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender;
    private Boolean isLocked;

    public void initialize(){
        super.setId(UserID.of(UUID.randomUUID()));
        super.setCreatedAt(DateTime.now());
        super.setUpdatedAt(DateTime.now());
        this.setIsActive(Boolean.TRUE);
        this.isLocked = Boolean.FALSE;
    }


}
