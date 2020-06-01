



package com.nttdata.SOAP.soap.exception;

import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;
import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;

@SoapFault(faultCode=FaultCode.CUSTOM, 
customFaultCode="{http://in28minutes.com/courses}001_COURSE_NOT_FOUND")
public class CourseNotFoundException extends RuntimeException {

private static final long serialVersionUID = 3518170101751491969L;

public CourseNotFoundException(String message) {
	super(message);
}

}
