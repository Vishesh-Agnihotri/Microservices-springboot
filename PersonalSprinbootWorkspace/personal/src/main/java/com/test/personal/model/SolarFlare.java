package com.test.personal.model;

import java.util.List;

public class SolarFlare {

	private String flrID;
	private List<Instrument> instruments;
	private String beginTime;
	private String peakTime;
	private String endTime;
	private String classType;
	private String sourceLocation;
	private int activeRegionNum;
	private List<LinkedEvent> linkedEvents;
	private String link;

	// getters and setters

	public String getFlrID() {
		return flrID;
	}

	public void setFlrID(String flrID) {
		this.flrID = flrID;
	}

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getPeakTime() {
		return peakTime;
	}

	public void setPeakTime(String peakTime) {
		this.peakTime = peakTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getSourceLocation() {
		return sourceLocation;
	}

	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}

	public int getActiveRegionNum() {
		return activeRegionNum;
	}

	public void setActiveRegionNum(int activeRegionNum) {
		this.activeRegionNum = activeRegionNum;
	}

	public List<LinkedEvent> getLinkedEvents() {
		return linkedEvents;
	}

	public void setLinkedEvents(List<LinkedEvent> linkedEvents) {
		this.linkedEvents = linkedEvents;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	// Instrument class
	public static class Instrument {
		private String displayName;

		// getters and setters

		public String getDisplayName() {
			return displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}
	}

	// LinkedEvent class
	public static class LinkedEvent {
		private String activityID;

		// getters and setters

		public String getActivityID() {
			return activityID;
		}

		public void setActivityID(String activityID) {
			this.activityID = activityID;
		}
	}
}
