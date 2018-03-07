package com.nuovonet.ws.client;

import java.util.Map;

public class RetornoTratado {
	
	private String result;
	private String error;
	private Map<Integer, String> report;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Map<Integer, String> getReport() {
		return report;
	}
	public void setReport(Map<Integer, String> report) {
		this.report = report;
	}
	
	

}
