package com.company.user.service.library.events;

import com.company.user.service.library.payload.UserCreatedPayload;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class UserCreatedEvent extends BaseEvent<UserCreatedPayload>{

}
