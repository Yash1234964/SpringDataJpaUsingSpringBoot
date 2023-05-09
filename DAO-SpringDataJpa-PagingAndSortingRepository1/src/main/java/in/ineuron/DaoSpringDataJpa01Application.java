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
	
//		service.fetchDetails(false,"price","name").
//		forEach((vaccine)->System.out.println(vaccine.getPrice()+"-->"+vaccine.getCountry()));
		
		service.fetchDetailsByPageNo(2, 4,true, "price","name").
		forEach((vaccine)->System.out.println(vaccine.getPrice()+"===>"+vaccine.getCountry()));
		
		
		((ConfigurableApplicationContext) factory).close();
		
		
	}

}
