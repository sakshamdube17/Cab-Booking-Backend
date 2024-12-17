package com.cabbooking.Cab.booking.execption;

public class UserNotFound extends RuntimeException{
  public UserNotFound(String mssg){
      super (mssg);
  }
}
