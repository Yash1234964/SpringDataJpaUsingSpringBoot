package in.ineuron.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.dao.ICoronaVaccineRepo;

@Service("service")
public class CoronaVaccineManagementServiceImpl implements ICoronaVaccineManagementService {

	@Autowired
	public ICoronaVaccineRepo repo;

	@Override
	public List<CoronaVaccine> fetchVaccineByCompany(String company) {
		System.out.println(repo.getClass().getName()+" "+Arrays.toString(repo.getClass().getDeclaredMethods()));
		List<CoronaVaccine> listEntities = repo.findByCompany(company);
		return listEntities;
	}

	@Override
	public List<CoronaVaccine> fetchVaccineByPriceLessThan(double price) {
		List<CoronaVaccine> listEntity =repo.findByPriceLessThan(price);
		return listEntity;
	}

	@Override
	public List<CoronaVaccine> searchVaccineByCountriesAndPriceRange(List<String> countries, Double startRange,
			Double endRange) {
		// TODO Auto-generated method stub
		return repo.findByCountryInAndPriceBetween(countries, startRange, endRange);
	}

	@Override
	public List<CoronaVaccine> searchVaccineNotByCountry(List<String> countries) {
		
		return repo.findByCountryNotIn(countries);
	}

	
}
