package com.wso2.mediator;

import com.fasterxml.uuid.Generators;
import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class TimeUUIDGeneratorMediator extends AbstractMediator { 
	
	public static final String CURRENT_TIME_UUID = "uri.var.uuid";

	public boolean mediate(MessageContext messageContext) {
		messageContext.setProperty(CURRENT_TIME_UUID, Generators.timeBasedGenerator().generate().toString());
		return true;
	}
}