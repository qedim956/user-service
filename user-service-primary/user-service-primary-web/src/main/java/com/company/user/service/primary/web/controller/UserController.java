package com.company.user.service.primary.web.controller;

import com.company.user.service.library.web.request.UserInsertCommandRequestModel;
import com.company.user.service.library.web.response.UserInsertResponseModel;
import com.company.user.service.domain.shell.port.input.abstracts.AbstractUserDomainShellService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
@RequiredArgsConstructor
public class UserController {
    private final AbstractUserDomainShellService userDomainShellService;

    @PostMapping("/insert")
    public ResponseEntity<UserInsertResponseModel> insert(@RequestBody
                                                          UserInsertCommandRequestModel model){
        return ResponseEntity.ok(userDomainShellService.insert(model));

    }
}
