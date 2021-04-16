package com.ribbon.gateway.model;

import java.util.Map;

public class CamundaVariable {

	private Map<String, Variable> variables;

	public CamundaVariable() {
		super();
	}

	public CamundaVariable(Map<String, Variable> variables) {
		super();
		this.variables = variables;
	}

	public Map<String, Variable> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, Variable> variables) {
		this.variables = variables;
	}

}
