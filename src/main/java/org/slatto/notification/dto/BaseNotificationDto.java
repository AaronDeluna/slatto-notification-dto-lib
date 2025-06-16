package org.slatto.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseNotificationDto implements Serializable {
    private String recipientEmail;
    private String messageBody;
    private NotificationType type;
    private NotificationEventType event;
}
