package com.agrosupport.api.appointment.domain.services;

import com.agrosupport.api.appointment.domain.model.commands.CreateAvailableDateCommand;
import com.agrosupport.api.appointment.domain.model.commands.DeleteAvailableDateCommand;
import com.agrosupport.api.appointment.domain.model.commands.UpdateAvailableDateCommand;
import com.agrosupport.api.appointment.domain.model.entities.AvailableDate;

import java.util.Optional;

public interface AvailableDateCommandService {
    Long handle(CreateAvailableDateCommand command);
    Optional<AvailableDate> handle(UpdateAvailableDateCommand command);
    void handle(DeleteAvailableDateCommand command);
}
