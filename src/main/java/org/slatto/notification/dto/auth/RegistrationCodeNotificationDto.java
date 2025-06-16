package org.slatto.notification.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.slatto.notification.dto.BaseNotificationDto;
import org.slatto.notification.dto.NotificationEventType;
import org.slatto.notification.dto.NotificationType;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
public class RegistrationCodeNotificationDto extends BaseNotificationDto {

    public RegistrationCodeNotificationDto(String recipientEmail, String messageBody,
                                           NotificationType type,
                                           NotificationEventType event) {
        super(recipientEmail, messageBody, type, event);
    }
}
