package org.slatto.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseNotificationDto implements Serializable {
    private String recipientEmail;
    private String messageBody;
    private NotificationType type;
    private NotificationEventType event;
}
