package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	
	public Iterable<CoronaVaccine> fetchDetails(Boolean asc,String...properties);
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo,int pageSize,boolean asc,String...properties);
   
}
