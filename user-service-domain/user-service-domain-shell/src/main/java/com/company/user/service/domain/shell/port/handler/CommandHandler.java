package com.company.user.service.domain.shell.port.handler;

public abstract class CommandHandler<REQUEST, RESPONSE> {
    public abstract RESPONSE handle(REQUEST request);
}
