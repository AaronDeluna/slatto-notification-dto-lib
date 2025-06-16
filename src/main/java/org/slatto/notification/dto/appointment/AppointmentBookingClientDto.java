package org.slatto.notification.dto.appointment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.slatto.notification.dto.BaseNotificationDto;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
public class AppointmentBookingClientDto extends BaseNotificationDto {
}
