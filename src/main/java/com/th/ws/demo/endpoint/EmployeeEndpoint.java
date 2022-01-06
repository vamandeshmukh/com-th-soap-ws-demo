package com.th.ws.demo.endpoint;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.th.ws.demo.model.Employee;
import com.th.ws.demo.repository.EmployeeRepository;

import https.www_torryharris_com.soap_ws_demo.EmployeeType;
import https.www_torryharris_com.soap_ws_demo.GetEmployeeRequest;
import https.www_torryharris_com.soap_ws_demo.GetEmployeeResponse;

@Endpoint
public class EmployeeEndpoint {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	private static final String NAMESPACE_URI = "https://www.torryharris.com/soap-ws-demo";

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeEndpoint(EmployeeRepository employeeRepository) {
		LOG.info("2 EmployeeEndpoint");
		this.employeeRepository = employeeRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeRequest")
	@ResponsePayload
	public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeRequest request) {
		LOG.info("...5 getEmployee " + request.getEmployeeId());
		GetEmployeeResponse response = new GetEmployeeResponse();
		Employee emp = employeeRepository.findById(request.getEmployeeId()).get();
//		EmployeeType empt = (EmployeeType) employeeRepository.findById(request.getEmployeeId()).get();
		EmployeeType empt = new EmployeeType();
		empt.setEmployeeId(101);
		empt.setFirstName("Sonu");
		empt.setSalary(50000);
		response.setEmployeeType(empt);
		return response;
	}
}
