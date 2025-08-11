package com.allmappings.service;

import java.util.List;

import com.allmappings.model.Address;
import com.allmappings.model.AddressDto;

public interface IAddressService {
	 void addAddress(AddressDto addressDto);
	    void  updateAddress( AddressDto addressDto);
	    void deleteAddress(int Addressid);
	    
	    List<AddressDto> findByCity(String city);
		 List<AddressDto> findByZipCode(String zipCode);
		 List<AddressDto> findAddressByCityAndState(String city,String state);
		 List<AddressDto> findAllDoctorAddresses();
}
