package com.company.library.roots;

import com.company.library.identity.UserID;
import com.company.library.valueobjects.Date;
import com.company.library.valueobjects.Gender;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class UserRoot extends AggregateRoot<UserID> {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender;
    private Boolean isLocked;


}
