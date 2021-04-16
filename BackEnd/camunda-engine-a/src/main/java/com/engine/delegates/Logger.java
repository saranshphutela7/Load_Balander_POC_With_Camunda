package com.engine.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("logger")
public class Logger implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
	System.out.println("################ Request Routed to engine A ###########################");
		execution.setVariable("engineUsed", "Engine A");
		
	}

}
