package com.company.user.service.domain.shell.port.input.abstracts;

import com.company.user.service.library.web.request.UserInsertCommandRequestModel;
import com.company.user.service.library.web.response.UserInsertResponseModel;

public interface AbstractUserDomainShellService {

    UserInsertResponseModel insert(UserInsertCommandRequestModel model);
}
