package com.accenture.utilities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="data")

public class Data {
	private String FirstName;
	private String LastName;
	
	@XmlElement(name = "FirstName")
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getFirstName() {
		return FirstName;
	}
	
	@XmlElement(name = "LastName")
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getLastName() {
		return LastName;
	}

/*public void setFirstName(String f)
{
	this.FirstName=f;
}
public String getFirstName()
{
	return FirstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}*/

}
