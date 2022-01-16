package com.eazybytes.accounts.model;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Properties {

	private String msg;
	private String buildVersion;
	private Map<String, String> mailDetails;
	private List<String> activeBranches;

	public Properties(String msg, String buildVersion, Map<String, String> mailDetails, List<String> activeBranches) {
		this.msg = msg;
		this.buildVersion = buildVersion;
		this.mailDetails = mailDetails;
		this.activeBranches = activeBranches;
	}

}

/*
https://github.com/eazybytes/microservices-config/blob/main/accounts-prod.properties
accounts.msg =Welcome to the EazyBank Accounts Prod application
accounts.build-version=1

accounts.mailDetails.hostName=prod-accounts@eazybytes.com
accounts.mailDetails.port=9010
accounts.mailDetails.from=prod-accounts@eazybytes.com
accounts.mailDetails.subject=Your Account Details from Eazy Bank Production Environment

accounts.activeBranches[0]=Hyderabad
accounts.activeBranches[1]=Paris
accounts.activeBranches[2]=NewYork


http://localhost:8080/account/properties
{
   "msg":"Welcome to the EazyBank Accounts Prod application",
   "buildVersion":"1",
   "mailDetails":{
      "hostName":"prod-accounts@eazybytes.com",
      "port":"9010",
      "from":"prod-accounts@eazybytes.com",
      "subject":"Your Account Details from Eazy Bank Production Environment"
   },
   "activeBranches":[
      "Hyderabad",
      "Paris",
      "NewYork"
   ]
}


*/