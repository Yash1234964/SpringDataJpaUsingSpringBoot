package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.type.View;


public interface ICoronaVaccineManagementService {

	public <T extends View> List<T>searchVaccineByCompany(String company,Class<T> clazz);
	
}
