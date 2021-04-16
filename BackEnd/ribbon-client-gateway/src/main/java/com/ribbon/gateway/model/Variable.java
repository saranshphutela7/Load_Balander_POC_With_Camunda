package com.ribbon.gateway.model;

public class Variable {

	private String type;
	private Object value;

	public Variable() {
		super();
	}

	public Variable(String type, Object value) {
		super();
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Variable [type=");
		builder.append(type);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

}
