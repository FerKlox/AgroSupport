package com.agrosupport.api.appointment.domain.exceptions;

public class AvailableDateNotFoundException extends RuntimeException {
    public AvailableDateNotFoundException(Long id) {
        super("Available date not found with id: " + id);
    }
}
