package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.dao.ICoronaVaccineRepo;

@Service("service")
public class CoronaVaccineManagementServiceImpl implements ICoronaVaccineManagementService {

	@Autowired
	public ICoronaVaccineRepo repo;
	
	@Override
	public String registerVacine(CoronaVaccine vaccine) {
		System.out.println("In memory proxy class is :: "+repo.getClass().getName());
		
		CoronaVaccine saveVaccine = null;
		
		if(vaccine!=null) {
			saveVaccine = repo.save(vaccine);
		}
		
		return saveVaccine!=null ?"Vaccine registration successful with "+saveVaccine.getRegNo():"Vaccine registration failed";
	}

	@Override
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines) {
		
		if(vaccines!=null)
			return repo.saveAll(vaccines);
		else
			throw new IllegalArgumentException("Batch insertion not possible ...");
		
	}

	@Override
	public Long getVaccineCount() {
		// TODO Auto-generated method stub
		return repo.count();
	}

	@Override
	public Boolean checkAvailablityByRegNo(Long regNo) {
		// TODO Auto-generated method stub
		return repo.existsById(regNo);
	}

	@Override
	public Iterable<CoronaVaccine> fetchAllVaccine() {
		
		return repo.findAll();
	}

	@Override
	public Iterable<CoronaVaccine> fetchAllDetailsById(List<Long> id) {
		// TODO Auto-generated method stub
		return repo.findAllById(id);
	}

	@Override
	public Optional<CoronaVaccine> fetchVaccineByid(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public String removeVaccineById(Long id) {
		// TODO Auto-generated method stub
		Optional<CoronaVaccine> optional=repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "Deletion Successful";
			
		}else
		return "record not available";
	}

	@Override
	public String removeVaccineByObject(CoronaVaccine vaccine) {
		Optional<CoronaVaccine> optional=repo.findById(vaccine.getRegNo());
		if(optional.isPresent()) {
			repo.delete(vaccine);
			return "Deletion Successful";
			
		}else
		return "record not available";
	}

	

}
