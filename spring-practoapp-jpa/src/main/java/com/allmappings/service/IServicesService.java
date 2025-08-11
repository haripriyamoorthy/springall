package com.allmappings.service;

import java.util.List;

import com.allmappings.model.Services;
import com.allmappings.model.ServicesDto;

public interface IServicesService {
	void addServices(ServicesDto servicesDto);
    void  updateServices( ServicesDto servicesDto);
    void deleteServices(int serviceId);
    List<Services> findByCategory(String category);
    Services findByServiceName( String serviceName);
}
