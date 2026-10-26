package in.coder.gatekeeper.analytics.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class HealthResponse {
    public String serviceName;
    public String serviceDescription;
    public String appStatus;

}
