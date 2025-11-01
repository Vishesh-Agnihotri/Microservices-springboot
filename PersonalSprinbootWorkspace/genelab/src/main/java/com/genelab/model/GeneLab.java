package com.genelab.model;

import java.util.Map;

public class GeneLab {

	private int hits;
	private String input;
	private int pageNumber;
	private int pageSize;
	private int pageTotal;
	private Map<String, Object> studies; // Assuming studies is a map, adjust the type accordingly
	private boolean success;
	private int totalHits;
	private String[] validInput; // Assuming validInput is an array of strings, adjust the type accordingly

	// getters and setters

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}

	public Map<String, Object> getStudies() {
		return studies;
	}

	public void setStudies(Map<String, Object> studies) {
		this.studies = studies;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getTotalHits() {
		return totalHits;
	}

	public void setTotalHits(int totalHits) {
		this.totalHits = totalHits;
	}

	public String[] getValidInput() {
		return validInput;
	}

	public void setValidInput(String[] validInput) {
		this.validInput = validInput;
	}
}
