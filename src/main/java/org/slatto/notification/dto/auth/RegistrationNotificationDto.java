package org.slatto.notification.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.slatto.notification.dto.BaseNotificationDto;

@Builder
@AllArgsConstructor
public class RegistrationNotificationDto extends BaseNotificationDto {
    private String username;

}
