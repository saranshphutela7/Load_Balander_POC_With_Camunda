package com.ribbon.gateway.model;

public class LinksEntity {
	private String method;
	private String href;
	private String rel;

	public LinksEntity() {
		super();
	}

	public LinksEntity(String method, String href, String rel) {
		super();
		this.method = method;
		this.href = href;
		this.rel = rel;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LinksEntity [method=");
		builder.append(method);
		builder.append(", href=");
		builder.append(href);
		builder.append(", rel=");
		builder.append(rel);
		builder.append("]");
		return builder.toString();
	}

}
