package at.ac.fhcampuswien.asd.rest.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OutboundUserRegistrationDto {

    Long id;
    String username;
    String firstName;
    String lastName;
}
