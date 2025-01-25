package com.company.user.service.domain.shell.handler;

public abstract class BaseCommandHandler<REQUEST, RESPONSE> {
    public abstract RESPONSE handle(REQUEST request);
}
