package org.slatto.notification.dto.appointment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.slatto.notification.dto.BaseNotificationDto;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
public class AppointmentBookingNotificationDto extends BaseNotificationDto {
    private String offeringName;
    private String clientEmail;
    private String clientFirstName;
    private String clientLastName;
    private LocalDateTime date;
    private String masterFirstName;
    private String masterLastName;
}
