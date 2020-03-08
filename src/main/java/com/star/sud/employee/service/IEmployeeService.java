/**
 * 
 */
package com.star.sud.employee.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;

import com.star.sud.employee.dto.Employee;

/**
 * @author sudarshan
 *
 */
public interface IEmployeeService {

	/**
	 * @param employee
	 * @return
	 * @throws Exception
	 */
	ResponseEntity<Object> createEmployee(Employee employee);

	/**
	 * @param empId
	 * @return
	 */
	MappingJacksonValue getEmployeeById(int empId);

	/**
	 * @return
	 */
	List<Employee> retrieveAllEmployees();

}
