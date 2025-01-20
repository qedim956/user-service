package com.company.library.events;

import com.company.library.payload.UserCreatedPayload;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class UserCreatedEvent extends BaseEvent<UserCreatedPayload>{

}
