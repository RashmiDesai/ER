package com.corejava;

public class AccessMembers 
{
	int defaultMember;
	private int priMember;
	public int pubMember;
	
	public int getDefaultMember() {
		return defaultMember;
	}
	public void setDefaultMember(int defaultMember) {
		this.defaultMember = defaultMember;
	}
	public int getPriMember() {
		return priMember;
	}
	public void setPriMember(int priMember) {
		this.priMember = priMember;
	}
	public int getPubMember() {
		return pubMember;
	}
	public void setPubMember(int pubMember) {
		this.pubMember = pubMember;
	}
	
	
}
