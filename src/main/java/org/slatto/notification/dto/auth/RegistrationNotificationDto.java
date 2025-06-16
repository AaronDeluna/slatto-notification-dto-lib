package org.slatto.notification.dto.auth;

import lombok.AllArgsConstructor;
import org.slatto.notification.dto.BaseNotificationDto;

@AllArgsConstructor
public class RegistrationNotificationDto extends BaseNotificationDto {
    private String username;

}
