package com.company.user.service.domain.core.model.port.output;

import com.company.user.service.library.roots.UserRoot;

public interface AbstractsUserDataAccessAdapter {
    UserRoot save(UserRoot userRoot);
}
