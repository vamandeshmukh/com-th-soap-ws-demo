package com.th.ws.demo;

//import java.util.HashMap;
//import java.util.Map;
//import javax.annotation.PostConstruct;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.util.Assert;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

//	Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	private static final Map<String, Employee> employees = new HashMap<>();
//
//	@PostConstruct
//	public void initData() {
//		LOG.info("1 initData");
//		Employee e1 = new Employee();
//		e1.setEmployeeId(101);
//		e1.setFirstName("Sonu");
//		e1.setSalary(55000);
//		employees.put(e1.getFirstName(), e1);
//
//		Employee e2 = new Employee();
//		e2.setEmployeeId(102);
//		e2.setFirstName("Monu");
//		e2.setSalary(50000);
//		employees.put(e2.getFirstName(), e2);
//
//		Employee e3 = new Employee();
//		e3.setEmployeeId(103);
//		e3.setFirstName("Tonu");
//		e3.setSalary(60000);
//		employees.put(e3.getFirstName(), e3);
//	}
//
//	public Employee findEmployee(String firstName) {
//		LOG.info("...6 findEmployee");
//		Assert.notNull(firstName, "The employee's name must not be null.");
//		return employees.get(firstName);
//	}

}
