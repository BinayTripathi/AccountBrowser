package com.binay.accountbrowser.controller.accounts;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.binay.accountbrowser.exception.AccountNotFoundException;
import com.binay.accountbrowser.exception.CommonExceptionResponse;
import com.binay.accountbrowser.exception.TrancationNotFoundException;


@ControllerAdvice
@RestController
public class CustomisedResponseEntityExceptionHandler extends  ResponseEntityExceptionHandler {
    
    //Copy this from ResponseEntityExceptionHandler and update
    //public final ResponseEntity<Object> handleException(Exception ex,  WebRequest request) throws Exception
    
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(Exception ex,  WebRequest request) throws Exception
    {
           CommonExceptionResponse commonExceptionResponse = new   CommonExceptionResponse(new Date(), ex.getMessage(),  request.getDescription(true)); 
           return new ResponseEntity(commonExceptionResponse ,  HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(AccountNotFoundException.class)   
    public final ResponseEntity<Object>  handleUserNotFoundException(AccountNotFoundException ex, WebRequest request) throws  Exception
    {
           CommonExceptionResponse commonExceptionResponse = new   CommonExceptionResponse(new Date(), ex.getMessage(),  request.getDescription(true));
           return new ResponseEntity(commonExceptionResponse ,  HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(TrancationNotFoundException.class)   
    public final ResponseEntity<Object>  handleUserNotFoundException(TrancationNotFoundException ex, WebRequest request) throws  Exception
    {
           CommonExceptionResponse commonExceptionResponse = new   CommonExceptionResponse(new Date(), ex.getMessage(),  request.getDescription(true));
           return new ResponseEntity(commonExceptionResponse ,  HttpStatus.NOT_FOUND);
    }
}


