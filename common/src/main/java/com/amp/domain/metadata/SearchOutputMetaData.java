/**
 * 
 */
package com.amp.domain.metadata;

import java.util.List;

/**
 * @author phenix
 *
 */
public class SearchOutputMetaData {

	private String respCode;
	private List<String> respMessage;
	private String correlationId;
	private String elapsedTimeMsg;
	
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public List<String> getRespMessage() {
		return respMessage;
	}
	public void setRespMessage(List<String> respMessage) {
		this.respMessage = respMessage;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public String getElapsedTimeMsg() {
		return elapsedTimeMsg;
	}
	public void setElapsedTimeMsg(String elapsedTimeMsg) {
		this.elapsedTimeMsg = elapsedTimeMsg;
	}
	@Override
	public String toString() {
		return "SearchOutputMetaData [respCode=" + respCode + ", respMessage=" + respMessage + ", correlationId="
				+ correlationId + ", elapsedTimeMsg=" + elapsedTimeMsg + "]";
	}
	
}
