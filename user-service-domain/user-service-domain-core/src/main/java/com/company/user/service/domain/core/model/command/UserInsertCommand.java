package com.company.user.service.domain.core.model.command;


import com.company.library.valueobjects.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserInsertCommand {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
}
