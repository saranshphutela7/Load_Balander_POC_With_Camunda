package com.ribbon.gateway.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ribbon.gateway.model.CamundaVariable;
import com.ribbon.gateway.model.StartProcessInstanceResponseEntity;
import com.ribbon.gateway.model.Variable;

@RestController
@CrossOrigin
public class Controller {

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	/**
	 * This API is used to start a process instance using Camunda's REST API.
	 * 
	 * @param key       the key of the process to be started
	 * @param pizzaType process variable
	 * @param quantity  process variable
	 * @return true if started successfully otherwise false
	 */
	@GetMapping("/start")
	public Boolean startProcessInstance(@RequestParam String key, @RequestParam String pizzaType,
			@RequestParam Integer quantity) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		Map<String, Variable> camundaVariables = new HashMap<>();
		camundaVariables.put("pizzaType", new Variable("String", pizzaType));
		camundaVariables.put("quantity", new Variable("Integer", quantity));

		CamundaVariable variables = new CamundaVariable(camundaVariables);
		HttpEntity<CamundaVariable> entity = new HttpEntity<>(variables, headers);
		String url = "http://camunda/engine-rest/process-definition/key/{key}/start";
		ResponseEntity<StartProcessInstanceResponseEntity> responseEntity = restTemplate.exchange(url, HttpMethod.POST,
				entity, new ParameterizedTypeReference<StartProcessInstanceResponseEntity>() {
				}, key);

		return responseEntity.getStatusCode().is2xxSuccessful();

	}

}
