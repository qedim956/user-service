package com.company.library.web.request;


import java.time.LocalDate;

import com.company.library.valueobjects.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserInsertCommandRequestModel {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
}
