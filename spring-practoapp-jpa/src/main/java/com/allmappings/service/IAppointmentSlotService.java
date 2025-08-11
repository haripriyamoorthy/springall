package com.allmappings.service;

import java.time.LocalDate;
import java.util.List;

import com.allmappings.model.AppointmentSlot;
import com.allmappings.model.AppointmentSlotDto;

public interface IAppointmentSlotService {
	void addAppointmentSlot(AppointmentSlotDto appointmentSlotDto);
    void  updateAppointmentSlot( AppointmentSlotDto appointmentSlotDto);
    void deleteAppointmentSlot(int slotId);
    List<AppointmentSlot> findByDoctorAndDate( Integer doctorId, LocalDate date);

  
    List<AppointmentSlot> findAvailableSlots();
    
}
