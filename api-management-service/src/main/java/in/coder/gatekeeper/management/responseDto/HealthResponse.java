package in.coder.gatekeeper.management.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class HealthResponse {
    public String serviceStatus;
    public String dpStatus;
    public LocalDateTime appStatus;

}
