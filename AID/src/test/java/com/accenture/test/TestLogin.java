package com.accenture.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestLogin {
  @Test
  public void LoginValid() {
	  String AR = "Tested";
	  String BR = "Tested";
	  Assert.assertEquals(AR, BR);
  }
  
  @Test
  public void LoginInvalid() {
	  String AR = "Tested";
	  String BR = "Tested12";
	  Assert.assertEquals(AR, BR);
  }
  
  
}
