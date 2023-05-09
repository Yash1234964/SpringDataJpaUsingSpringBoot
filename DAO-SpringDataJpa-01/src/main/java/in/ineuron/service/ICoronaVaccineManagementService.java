package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	
	public String registerVacine(CoronaVaccine vaccine );
   public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines);
   public Long getVaccineCount();
   public Boolean checkAvailablityByRegNo(Long regNo);
   public Iterable<CoronaVaccine> fetchAllVaccine();
   public Iterable<CoronaVaccine> fetchAllDetailsById(List<Long> id);
   public Optional<CoronaVaccine> fetchVaccineByid(Long id);
   public String removeVaccineById(Long id);
   public String removeVaccineByObject(CoronaVaccine vaccine);
   
}
