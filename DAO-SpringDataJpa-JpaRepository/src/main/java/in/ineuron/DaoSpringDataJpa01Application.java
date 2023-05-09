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
		
//		CoronaVaccine vaccine=new CoronaVaccine();
		
//		CoronaVaccine vaccine= new CoronaVaccine("Cocishield","Serum","IND",750.0);
//		CoronaVaccine vaccine= new CoronaVaccine(2);
//		service.searchVaccineByGivenData(vaccine,true,"price").forEach(System.out::println);
		
//		CoronaVaccine vaccine = service.getVaccineById(2L);
//		
//		if(vaccine!=null) {
//			System.out.println(vaccine);
//		}else {
//			System.out.println("vaccine not found");
//		}
		
		List<Long> list=new ArrayList<Long>();
		list.add(1L);
		list.add(2L);
		
		String status=service.removeVaccinesByRegNo(list);
		System.out.println(status);
		

		
		((ConfigurableApplicationContext) factory).close();
		
		
	}

}
