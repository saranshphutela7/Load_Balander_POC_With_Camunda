package com.ribbon.gateway.model;

import java.util.List;

public class StartProcessInstanceResponseEntity {

	private String id;
	private String definitionId;
	private String tenantId;
	private String businessKey;
	private String caseInstanceId;
	private boolean ended;
	private boolean suspended;
	private List<LinksEntity> links;

	public StartProcessInstanceResponseEntity() {
		super();
	}

	public StartProcessInstanceResponseEntity(String id, String definitionId, String tenantId, String businessKey,
			String caseInstanceId, boolean ended, boolean suspended, List<LinksEntity> links) {
		super();
		this.id = id;
		this.definitionId = definitionId;
		this.tenantId = tenantId;
		this.businessKey = businessKey;
		this.caseInstanceId = caseInstanceId;
		this.ended = ended;
		this.suspended = suspended;
		this.links = links;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDefinitionId() {
		return definitionId;
	}

	public void setDefinitionId(String definitionId) {
		this.definitionId = definitionId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getCaseInstanceId() {
		return caseInstanceId;
	}

	public void setCaseInstanceId(String caseInstanceId) {
		this.caseInstanceId = caseInstanceId;
	}

	public boolean isEnded() {
		return ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}

	public boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}

	public List<LinksEntity> getLinks() {
		return links;
	}

	public void setLinks(List<LinksEntity> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StartProcessInstanceResponseEntity [id=");
		builder.append(id);
		builder.append(", definitionId=");
		builder.append(definitionId);
		builder.append(", tenantId=");
		builder.append(tenantId);
		builder.append(", businessKey=");
		builder.append(businessKey);
		builder.append(", caseInstanceId=");
		builder.append(caseInstanceId);
		builder.append(", ended=");
		builder.append(ended);
		builder.append(", suspended=");
		builder.append(suspended);
		builder.append(", links=");
		builder.append(links);
		builder.append("]");
		return builder.toString();
	}

}
