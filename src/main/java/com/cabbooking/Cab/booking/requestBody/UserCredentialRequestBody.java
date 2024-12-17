package com.cabbooking.Cab.booking.requestBody;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserCredentialRequestBody {
    private String email;
    private String password;
}
