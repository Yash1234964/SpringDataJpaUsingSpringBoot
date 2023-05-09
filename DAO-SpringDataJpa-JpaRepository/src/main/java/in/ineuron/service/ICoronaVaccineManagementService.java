package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	public List<CoronaVaccine> searchVaccineByGivenData(CoronaVaccine vaccine,boolean ascOrder,String... properties);
	public CoronaVaccine getVaccineById(Long regNo);
	public String removeVaccinesByRegNo(Iterable<Long> regNo);
   
}
