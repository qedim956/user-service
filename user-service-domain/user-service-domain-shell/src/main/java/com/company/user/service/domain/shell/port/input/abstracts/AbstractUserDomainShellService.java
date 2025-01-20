package com.company.user.service.domain.shell.port.input.abstracts;

import com.company.library.web.request.UserInsertCommandRequestModel;
import com.company.library.web.response.UserInsertResponseModel;

public interface AbstractUserDomainShellService {

    UserInsertResponseModel insert(UserInsertCommandRequestModel model);
}
