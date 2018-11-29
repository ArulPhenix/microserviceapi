/**
 * 
 */
package com.amp.domain.metadata;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author phenix
 *
 */
public class SearchInputMetaData {

	@NotEmpty(message="ConsumerAppId should not be Empty")
	private String consumerAppId;
	@Pattern(regexp="IA|EX", message="ConsumerAppType should be IA or EX")
	private String consumerAppType;
	private String externalCorrelationId;
	@JsonIgnore
	private String internalCorrelationId;
	
	public String getConsumerAppId() {
		return consumerAppId != null ? consumerAppId.trim().toUpperCase() : null;
	}
	public void setConsumerAppId(String consumerAppId) {
		this.consumerAppId = consumerAppId != null ? consumerAppId.trim().toUpperCase() : null;
	}
	public String getConsumerAppType() {
		return consumerAppType != null ?consumerAppType.trim().toUpperCase() : null;
	}
	public void setConsumerAppType(String consumerAppType) {
		this.consumerAppType = consumerAppType != null ?consumerAppType.trim().toUpperCase() : null;
	}
	public String getExternalCorrelationId() {
		return externalCorrelationId != null ? externalCorrelationId.trim() : null;
	}
	public void setExternalCorrelationId(String externalCorrelationId) {
		this.externalCorrelationId = externalCorrelationId != null ? externalCorrelationId.trim() : null;
	}
	public String getInternalCorrelationId() {
		return internalCorrelationId != null ? internalCorrelationId.trim() : null;
	}
	public void setInternalCorrelationId(String internalCorrelationId) {
		this.internalCorrelationId = internalCorrelationId != null ? internalCorrelationId.trim() : null;
	}
	@Override
	public String toString() {
		return "SearchInputMetaData [consumerAppId=" + consumerAppId + ", consumerAppType=" + consumerAppType
				+ ", externalCorrelationId=" + externalCorrelationId + ", internalCorrelationId="
				+ internalCorrelationId + "]";
	}
	
}
