package com.accenture.utilities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="registrationData")

public class RegData {

	private List<Data> regData;
	
	@XmlElement(name="data")
	
	public void setRegData(List<Data> regData) {
		this.regData = regData;
	}
	
	public List<Data> getRegData() {
		return regData;
	}





	
}
