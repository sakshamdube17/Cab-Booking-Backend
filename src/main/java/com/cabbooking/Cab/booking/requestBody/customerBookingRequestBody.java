package com.cabbooking.Cab.booking.requestBody;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class customerBookingRequestBody {
    private String startingPoint;
    private String endingPoint;
}
