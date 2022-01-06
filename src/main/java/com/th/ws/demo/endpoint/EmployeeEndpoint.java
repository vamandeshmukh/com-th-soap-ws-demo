package com.th.ws.demo.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.th.ws.demo.model.Employee;
import com.th.ws.demo.service.EmployeeService;

import https.www_torryharris_com.soap_ws_demo.EmployeeType;
import https.www_torryharris_com.soap_ws_demo.GetEmployeeRequest;
import https.www_torryharris_com.soap_ws_demo.GetEmployeeResponse;

@Endpoint
public class EmployeeEndpoint {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	private static final String NAMESPACE_URI = "https://www.torryharris.com/soap-ws-demo";

	@Autowired
	EmployeeService employeeService;

	@Autowired
	public EmployeeEndpoint(EmployeeService employeeService) {
		LOG.info("2 EmployeeEndpoint");
		this.employeeService = employeeService;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeRequest")
	@ResponsePayload
	public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeRequest request) {
		LOG.info("...5 getEmployee " + request.getEmployeeId());
		GetEmployeeResponse response = new GetEmployeeResponse();
		Employee emp = employeeService.getEmployeeById(request.getEmployeeId());
		LOG.info(emp.toString());
//		EmployeeType empt = emp;
		EmployeeType empt = new EmployeeType();
		empt.setEmployeeId(11);
		empt.setFirstName("Sonu");
		empt.setSalary(50000);
		LOG.info(empt.toString());
		response.setEmployeeType(empt);
		return response;
	}
}
