package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	public List<CoronaVaccine> fetchVaccineByCompany(String company);
	public List<CoronaVaccine> fetchVaccineByPriceLessThan(double price);
	public List<CoronaVaccine> searchVaccineByCountriesAndPriceRange(List<String>countries,Double startRange,Double endRange);
    public List<CoronaVaccine> searchVaccineNotByCountry(List<String>countries);
}
