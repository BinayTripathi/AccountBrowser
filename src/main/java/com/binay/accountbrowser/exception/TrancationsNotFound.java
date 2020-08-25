package com.binay.accountbrowser.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TrancationsNotFound extends RuntimeException {

	public TrancationsNotFound(String message)  
    {
           super(message);
    }   
}
