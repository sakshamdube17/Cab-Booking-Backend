package com.cabbooking.Cab.booking.responseBody;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingResponseBody {
   private int bookingId;
    private int customerId;
    private String customerName;
    private String startingPoint;
    private String endingPoint;
    private String Status;


}
