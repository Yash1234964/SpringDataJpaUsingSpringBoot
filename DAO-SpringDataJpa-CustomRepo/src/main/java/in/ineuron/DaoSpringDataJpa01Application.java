package in.ineuron;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


import in.ineuron.bo.CoronaVaccine;
import in.ineuron.service.ICoronaVaccineManagementService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		
		ICoronaVaccineManagementService service=factory.getBean(ICoronaVaccineManagementService.class);
        
//        service.fetchVaccineByCompany("serum").forEach(System.out::println);
//        service.fetchVaccineByPriceLessThan(700.0).forEach(System.out::println);
//		List<String> list = new ArrayList<String>();
//		list.add("IND");
//		list.add("USA");
//		
//		service.searchVaccineByCountriesAndPriceRange(list, 700D, 800D).forEach(System.out::println);

		List<String> list = new ArrayList<String>();
		list.add("IND");
		
		service.searchVaccineNotByCountry(list).forEach(System.out::println);
		
		
		((ConfigurableApplicationContext) factory).close();
		
		
	}

}
