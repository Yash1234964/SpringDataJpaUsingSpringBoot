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
		
//		CoronaVaccine vaccine=new CoronaVaccine(null,"Cocishield","Serum","IND",750.0,2);
//		System.out.println(service.registerVacine(vaccine));
		
//		ArrayList<CoronaVaccine> vaccines=new ArrayList<CoronaVaccine>();
//		vaccines.add(new CoronaVaccine(null,"Sputnik", "russie", "Russia",455.7, 2));
//		vaccines.add(new CoronaVaccine(null,"Pyzer", "Pyzwer", "USA",638.7, 2));
//		vaccines.add(new CoronaVaccine(null,"Moderna", "Moderrna", "USA",721.4, 2));
//		Iterable<CoronaVaccine> listVaccines=service.registerInBatch(vaccines);
//		listVaccines.forEach(vaccine ->System.out.println(vaccine.getRegNo()));
		
//		System.out.println("Total nuber of vaccine types :: "+service.getVaccineCount());
//		System.out.println("Checking for vaccine availablity :: "+service.checkAvailablityByRegNo(3L));
		
//		service.fetchAllVaccine().forEach(System.out::println);         
		
//		List<Long> arr=new ArrayList<Long>();
//		
//		arr.add(1L);
//		arr.add(2L);
//		arr.add(3L);
//		arr.add(4L);
//		
//		service.fetchAllDetailsById(arr).forEach(System.out::println);
		
//		Optional<CoronaVaccine> record=service.fetchVaccineByid(3L);
//		
//		if(record.isPresent()) {
//			System.out.println(record.get());
//			record.orElseThrow(()->new IllegalArgumentException("No record to display"));
//		}
//		
//		
		
//		System.out.println(service.removeVaccineById(3L));
		
		CoronaVaccine vaccine=new CoronaVaccine(3L,"Pyzer", "Pyzwer", "USA",638.7, 2);
		System.out.println(service.removeVaccineByObject(vaccine));
		
		
		((ConfigurableApplicationContext) factory).close();
		
		
	}

}
